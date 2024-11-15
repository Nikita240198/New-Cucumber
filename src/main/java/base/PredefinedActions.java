package base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import constant.ConstantPath;
import CustomException.InvalidLocatorType;
import io.github.bonigarcia.wdm.WebDriverManager;
import stepDefinition.AutomationHooks;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PredefinedActions {
	

	// public static WebDriverWait wait;
	public static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();
	public Select select;
	public DesiredCapabilities capabilities = new DesiredCapabilities();

	// ----------------------------------------- Web Automation
	// ---------------------------------------------------------------

	public static WebDriver getDriver() {
		return webDriver.get();
	}

	public static String readPropertyValue(String propertyKey) throws IOException, XmlPullParserException {
		MavenXpp3Reader reader = new MavenXpp3Reader();
		Model model;
		String propertyValue = null;
		try {
			FileReader fileReader = new FileReader("pom.xml");
			model = reader.read(fileReader);
			propertyValue = model.getProperties().getProperty(propertyKey);
			return propertyValue;
		} catch (IOException | XmlPullParserException e) {
			e.printStackTrace();
			return propertyValue;
		}
	}

	public void configureSelenium(String browser, boolean useWebDriverManager, boolean runHeadless) {

		ChromeOptions chromeOptions = new ChromeOptions();
		EdgeOptions edgeOptions = new EdgeOptions();
		FirefoxOptions firefoxOptions = new FirefoxOptions();

		if (runHeadless) {
			chromeOptions.addArguments("--headless");
			edgeOptions.addArguments("--headless");
			firefoxOptions.addArguments("--headless");
		}

		switch (browser.toLowerCase()) {
		case "chrome":
			if (useWebDriverManager)
				WebDriverManager.chromedriver().setup();
			else
				System.setProperty("webdriver.chrome.driver", ConstantPath.CHROMEDRIVER);
			webDriver.set(ThreadGuard.protect(new ChromeDriver(chromeOptions)));
			break;
		case "firefox":
			if (useWebDriverManager)
				WebDriverManager.firefoxdriver().setup();
			else
				System.setProperty("webdriver.gecko.driver", ConstantPath.GICODRIVER);
			webDriver.set(ThreadGuard.protect(new FirefoxDriver(firefoxOptions)));
			break;
		case "edge":
			if (useWebDriverManager)
				WebDriverManager.edgedriver().setup();
			else
				System.setProperty("webdriver.edge.driver", ConstantPath.EDGEDRIVER);
			webDriver.set(ThreadGuard.protect(new EdgeDriver(edgeOptions)));
			break;
		default:
			if (useWebDriverManager)
				WebDriverManager.edgedriver().setup();
			else
				System.setProperty("webdriver.edge.driver", ConstantPath.EDGEDRIVER);
			webDriver.set(ThreadGuard.protect(new EdgeDriver(edgeOptions)));
			break;
		}
	}

	public void openWebSite(String url) throws IOException, XmlPullParserException {
		String browserName = AutomationHooks.browserName;
		boolean useWebdriverManager = AutomationHooks.useWebdriverManager;
		boolean runHeadless = AutomationHooks.runHeadless;
		configureSelenium(browserName, useWebdriverManager, runHeadless);
		getDriver().manage().window().maximize();
		getDriver().get(url);
	}

	public void start() throws IOException, XmlPullParserException {
		openWebSite(ConstantPath.CONNECT_URL);
	}

	public void tearDown(){
		getDriver().quit();
	}

	private By getLocatorBy(String locator) {
		String[] temp = locator.split("]:-");
		String locatorType = temp[0].replace("[", "").toUpperCase();
		String locatorValue = temp[1];
		
		switch (locatorType) {
		case "XPATH":
			return By.xpath(locatorValue);
		case "ID":
			return By.id(locatorValue);
		case "CLASS":
			return By.className(locatorValue);		
		case "CSS":
			return By.cssSelector(locatorValue);
		default:
			throw new InvalidLocatorType(locatorType + " is not valid");
		}
	}

	protected WebElement getElement(String locator, boolean isWaitRequired) {
		WebElement element = null;
		By by = getLocatorBy(locator);
		if (isWaitRequired) {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} else
			element = getDriver().findElement(by);
		return element;
	}
	
	



	protected List<WebElement> getAllElements(String locator, boolean isWaitRequired) {
		By by = getLocatorBy(locator);
		List<WebElement> elements = new ArrayList<>();
		if (isWaitRequired)
			try {
				WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
				elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
			} catch (Exception ae) {
			}

		else
			elements = getDriver().findElements(by);
		return elements;
	}
	
	protected WebElement getElementByValue(String value, boolean isWaitRequired) {
	    WebElement element = null;
	    By by = By.xpath("//*[normalize-space()='" + value + "']");
	    if (isWaitRequired) {
	        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
	        element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	    } else {
	        element = getDriver().findElement(by);
	    }
	    return element;
	}
	
	


	public String getAttribute(String locator, boolean isWaitRequired, String attributeName) {
		return getElement(locator, isWaitRequired).getAttribute(attributeName);
	}

	public void setText(String locator, boolean isWaitRequired, String text) throws InterruptedException {
		WebElement element = getElement(locator, isWaitRequired);
		System.out.println(element+"is");
		if (element.isEnabled()) {
			
			element.clear();
			element.sendKeys(text);
			element.sendKeys(Keys.COMMAND+"A");
			System.out.println(text);

		} else
			System.out.println(locator + " element is not enabled");
		
		  
		}
	
	public void setTextUsingJS(String locator, boolean isWaitRequired, String text) {
	    WebElement element = getElement(locator, isWaitRequired);
	    JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    js.executeScript("arguments[0].innerHTML = arguments[1];", element, text);
	}
	

	public void setText(WebElement element, boolean isWaitRequired, String text) {
		if (element.isEnabled()) {
			element.sendKeys(text);

		} else
			System.out.println("element is not enabled");
	}

	public boolean waitUntilElementIsClickable(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5000));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	

	public boolean waitUntilElementIsVisible(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public boolean waitToShowCompose(WebElement element, int timeoutInSeconds) {
	    try {
	        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutInSeconds));
	        wait.until(ExpectedConditions.visibilityOf(element));
	        return true;
	    } catch (TimeoutException e) {
	        System.err.println("Element not visible within the timeout: " + timeoutInSeconds + " seconds");
	        return false;
	    }
	}
	
	


	public boolean isElementClickable(String locator, boolean isWaitRequired) {
		WebElement element = getElement(locator, isWaitRequired);
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnElement(String locator, boolean isWaitRequired) {
		WebElement element = getElement(locator, isWaitRequired);
		if (waitUntilElementIsClickable(element))
			element.click();
		else
			throw new ElementNotInteractableException(locator + " is not clickable");

	}
	


	public void clickOnElementAfterVisible(String locator, boolean isWaitRequired) {
		WebElement element = getElement(locator, isWaitRequired);
		if (waitUntilElementIsVisible(element))
			element.click();
		else
			throw new ElementNotInteractableException(locator + " is not visible");

	}

	public void clickOnElementUsingAction(String locator, boolean isWaitRequired) {
		WebElement element = getElement(locator, isWaitRequired);
		Actions actions = new Actions(getDriver());
		actions.moveToElement(element).click().build().perform();

	}
	
	public void HoverOnElementUsingAction(String locator, boolean isWaitRequired) {
		WebElement element = getElement(locator, isWaitRequired);
		Actions actions = new Actions(getDriver());
		actions.moveToElement(element).build().perform();

	}
	

	public void SelectAllText(String locator, boolean isWaitRequired) {
		WebElement element = getElement(locator, false);
		 element.click();
		Actions actions = new Actions(getDriver());
		  actions.keyDown(Keys.COMMAND).sendKeys("a").perform();
		
	}

	public void clickOnElementUsingJavaScript(String locator, boolean isWaitRequired) {
		WebElement element = getElement(locator, isWaitRequired);
		JavascriptExecutor executor = (JavascriptExecutor) getDriver();
		executor.executeScript("arguments[0].click();", element);

	}

	public void clickOnElement(WebElement element, boolean isWaitRequired) {
		if (waitUntilElementIsClickable(element))
			element.click();
		else
			throw new ElementNotInteractableException(" Element is not clickable");

	}

	public void pressEnterKey() { 
		Actions actions = new Actions(getDriver());
		actions.sendKeys(Keys.ENTER).perform();

	}

	public void pressDownArrowKey() {
		Actions actions = new Actions(getDriver());
		actions.sendKeys(Keys.ARROW_DOWN).perform();

	}
	
	public void pressRightArrowKey() {
		Actions actions = new Actions(getDriver());
		actions.sendKeys(Keys.ARROW_RIGHT).build().perform();

	}
	
	public void pressLeftArrowKey() {
		Actions actions = new Actions(getDriver());
		actions.sendKeys(Keys.ARROW_LEFT).build().perform();

	}
	
	public void pressBackSpace() {
		Actions actions = new Actions(getDriver());
		actions.sendKeys(Keys.BACK_SPACE).perform();

	}
	
	public void pressSpace() {
		Actions actions = new Actions(getDriver());
		actions.sendKeys(Keys.SPACE).perform();

	}
	

	
	public void pressWIndowAndAll() {
		Actions actions = new Actions(getDriver());
		
		  actions.keyDown(Keys.COMMAND).sendKeys("a").perform();

	}
	
	public void DoubleClick(String locator, boolean isWaitRequired) {
		 WebElement element = getElement(locator, isWaitRequired);
		Actions actions = new Actions(getDriver());
		  actions.doubleClick(element).perform();
	}

	protected boolean waitUntilPageTitalToBe(String tital) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		boolean titalFlag = wait.until(ExpectedConditions.titleIs(tital));
		return titalFlag;
	}

	protected List<WebElement> waitUntilNumberOfElementToBoMoreThan(String locator, int count) {
		By by = getLocatorBy(locator);
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		List<WebElement> elements = wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(by, count));
		return elements;
	}
	
	public void sleep(long time){
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

	protected boolean isElementDisplayed(String locator, boolean isWaitRequired) {
		try {
			WebElement element = getElement(locator, isWaitRequired);
			if (element.isDisplayed())
				return true;
			else
				// call method to scroll to element
				return element.isDisplayed();
		} catch (NoSuchElementException ne) {
			return false;
		}
	}
	
//	public void uploadFile(String filePath) {
//	    // Validate the file path before proceeding
//	    File file = new File(filePath);
//	    if (!file.exists()) {
//	        throw new IllegalArgumentException("File does not exist at specified path: " + filePath);
//	    }
//
//	    // Assuming there's an `input` element for file upload in the HTML
//	    WebElement fileInput = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
//	        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));
//
//	    // Send the file path to the input element (this will bypass the system popup)
//	    fileInput.sendKeys(filePath);
//	}

	public void uploadFileUsingJavaScript(String filePath, String locator, Boolean isWaitRequired) {
	    File file = new File(filePath);
	    if (!file.exists()) {
	        throw new IllegalArgumentException("File does not exist: " + filePath);
	    }

	    WebElement element = waitForElement(locator, isWaitRequired);

	    // Use JavaScript to reveal the hidden file input if necessary
	    JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    js.executeScript("arguments[0].style.display='block';", element);

	    // Attach the file using sendKeys
	    element.sendKeys(filePath);
	    System.out.println("File attached: " + filePath);
	}

	
	
	
	
	
	
	

	public WebElement waitForElement(String locator, Boolean isWaitRequired) {
	    By byLocator = getLocatorBy(locator); // Use the custom locator method

	    if (isWaitRequired) {
	        return new WebDriverWait(getDriver(), Duration.ofSeconds(10))
	                .until(ExpectedConditions.presenceOfElementLocated(byLocator));
	    } else {
	        return getDriver().findElement(byLocator);
	    }
	}




	public boolean waitUntilElementIsVisible(String locator) {
		return isElementDisplayed(locator, true);
	}

	public boolean isElementVisible(String locator) {
		return isElementDisplayed(locator, true);
	}

	public void waitUntilElementIsInVisible(String locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOf(getElement(locator, true)));
	}

	public boolean waitUntilElementIsVisibleOne(WebElement element) {
	    try {
	        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.visibilityOf(element));
	        return true;
	    } catch (Exception e) {
	        return false;
	    }
	}

	
	
	public String getElementText(String locator, boolean isWaitRequired) {
		return getElement(locator, isWaitRequired).getText();
	}

	public List<String> getAllElementsText(String locator, boolean isWaitRequired) {
		List<WebElement> elements = getAllElements(locator, isWaitRequired);
		List<String> AllElementstext = new ArrayList<String>();
		for (int i = 0; i < elements.size(); i++)
			AllElementstext.add(elements.get(i).getText());
		return AllElementstext;
	}

	public String getElementText(WebElement element) {
		return element.getText();
	}


	public void selectByText(WebElement element, String valueToSelect) {
		select = new Select(element);
		select.selectByVisibleText(valueToSelect);
		
	}
	

	

	public void ScrollPage(String locator) {
		 JavascriptExecutor js = (JavascriptExecutor) getDriver();
		 js.executeScript("arguments[0].scrollIntoView();",locator);
	}
	
//	public void scrollToElement() {
//		JavascriptExecutor js = (JavascriptExecutor) getDriver();
//		js.executeScript("scrollBy(0, 45000)");
//
//	}
	
//	public void scrollToElement() {
//	    JavascriptExecutor js = (JavascriptExecutor) getDriver();
//	    js.executeScript("scrollBy(0, 1000)");
//	}
	
	public void scrollToElement(WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	    sleep(1000); // Adjust sleep duration if necessary
	}




	public void scrollToBottom() {
	    JavascriptExecutor js = (JavascriptExecutor) getDriver();

	    long lastHeight = (long) js.executeScript("return document.body.scrollHeight");

	    while (true) {
	        js.executeScript("window.scrollBy(0, document.body.scrollHeight);");

	        try {
	            Thread.sleep(3000); // Adjust sleep time as needed
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        long newHeight = (long) js.executeScript("return document.body.scrollHeight");
	        if (newHeight == lastHeight) {
	            break;
	        }
	        lastHeight = newHeight;
	    }
	}


	public byte[] takeScreenshot() {
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		return ts.getScreenshotAs(OutputType.BYTES);
	}
	
	


	
	
	

}
