package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class DashboardPageMethods extends PredefinedActions { 
	public PropOperation propOperation;

	public DashboardPageMethods() {
		propOperation = new PropOperation(ConstantPath.DashboardLocator);
	}

	public boolean isAllSelected() {
		return isElementDisplayed(propOperation.getValue("AllActive"), true);
	}

	public boolean isEmailVisible() {
		return isElementDisplayed(propOperation.getValue("mailIcon"), true);
	}

	public boolean isChatVisible() {
		return isElementDisplayed(propOperation.getValue("ChatIcon"), true);

	}

	public void ClickOnFirstTile() {
		clickOnElement(propOperation.getValue("FirstTile"), true);
		sleep(3000);
	}

	public void Selectmail() {
		clickOnElement(propOperation.getValue("mailIcon"), true);
		sleep(3000);
	}

	public boolean HoverSpam(String expectedTooltipMessage) {
		HoverOnElementUsingAction(propOperation.getValue("ReportspamHeader"), true);
		sleep(3000);
		return isElementDisplayed(propOperation.getValue("ReportspamHeader"), true)
				&& getElementText(propOperation.getValue("ReportSpamMessage"), true).equals(expectedTooltipMessage);

	}
	

	public void ClickSpam() {
		clickOnElement(propOperation.getValue("ReportspamHeader"), true);
		sleep(3000);
	}

	public boolean isConfirmationPopupComes() {
		return isElementDisplayed(propOperation.getValue("SpamConfirmationPopup"), true);
	}

	public void SendSpam() {
		clickOnElement(propOperation.getValue("YesSpam"), true); 
		sleep(13000);
	}

	public boolean isSnackbarForInbox() {
		
		   WebElement locator = getElement(propOperation.getValue("MovedToInboxSnackbar"), false);
		   
		   waitUntilElementIsVisible(locator);
		   
		return isElementDisplayed(propOperation.getValue("MovedToInboxSnackbar"), true);
	}
	
	public void NoSendSpam() {
		clickOnElement(propOperation.getValue("NoSpam"), true);
		sleep(3000);
	}

	public void HoverDelete() {
		HoverOnElementUsingAction(propOperation.getValue("DeleteHeder"), true);
		sleep(3000);
	}

	public String getTooltipMessage() {
		String tooltipElement = getElementText(propOperation.getValue("DeleteMessage"), true);
		return tooltipElement;
	}

	public void ClickDelete() {
		clickOnElement(propOperation.getValue("DeleteHeder"), true);
		sleep(3000);
	}

	public boolean isConfirmationPopupComesforDelete() {
		return isElementDisplayed(propOperation.getValue("DeleteConfirmationPopup"), true);
	}

	public void DeleteMail() {
		clickOnElement(propOperation.getValue("YesDelete"), true);
		sleep(5000);
	}
	
	public void deleteFromSecondEllipsis() {
		clickOnElement(propOperation.getValue("DeleteFromSecondEllipsis"), true);
		sleep(5000);
	}

	public void CancelDelete() {
		clickOnElement(propOperation.getValue("CancelDelete"), true);
		sleep(3000);
	}

	public void HoverMarkAsRead() {
		HoverOnElementUsingAction(propOperation.getValue("MarkAsReadHeader"), true);
		sleep(3000);

	}

	public String isMailboxShowsMessage() {
		String tooltipMessage = getAttribute(propOperation.getValue("Mailicon"), true, "title");
		System.out.println(tooltipMessage);
		return tooltipMessage;

	}

	public void ClickMailAsread() {
		clickOnElement(propOperation.getValue("MarkAsReadHeader"), true);
		sleep(5000);
	}

//	public void HoverLabel() {
//		HoverOnElementUsingAction(propOperation.getValue("LabelHeader"), true);
//		sleep(3000);
//
//	}

//	public boolean ismessagelableDisplay() {
//		return isElementDisplayed(propOperation.getValue("AddLAbel"), true);
//	}
	
	public boolean isValidationForLabelVisible() {
		return isElementDisplayed(propOperation.getValue("AddLAbel"), true);
	}

	public boolean hoverAndCheckTooltipLable(String expectedTooltipMessage) {
		HoverOnElementUsingAction(propOperation.getValue("LabelHeader"), true);
		sleep(3000);
		return isElementDisplayed(propOperation.getValue("LabelHeader"), true)
				&& getElementText(propOperation.getValue("LabelHeader"), true).equals(expectedTooltipMessage);
	}

	public boolean OpenAddlable() {
		clickOnElement(propOperation.getValue("LabelHeader"), true);
		sleep(5000);
		return isElementDisplayed(propOperation.getValue("AddLabelPopup"), true);

	}

	public void ClickApplyOnly() {
		clickOnElement(propOperation.getValue("ApplyLabel"), true);
		sleep(5000);

	}
	
	public void scrollToBottom() {
		 WebElement createElementElement = getElement(propOperation.getValue("CreatenewLabel"), false); // Initially, no wait

		    if (createElementElement == null) {
		        System.out.println("Send button element not found.");
		        return;
		    }

		    scrollToElement(createElementElement);

		    // Wait for the element to be visible after scrolling
		    if (!waitUntilElementIsVisibleOne(createElementElement)) {
		        // Handle the scenario where the element is not visible
		        System.out.println("Send button is not visible after scrolling.");
		    }
	}
	
	

	public void CreateNewLabel() throws InterruptedException {
		// click on create label button
		clickOnElement(propOperation.getValue("CreatenewLabel"), true);
		sleep(2000);

		// Enter Lable name
		clickOnElement(propOperation.getValue("LabelInputField"), true);
		sleep(2000);
		setText(propOperation.getValue("LabelInputField"), true, "label1");

		// Select color from List
		clickOnElement(propOperation.getValue("LabelColor"), true);
		sleep(2000);

		// Create Label
		clickOnElement(propOperation.getValue("CreatelabelButton"), true);
		sleep(2000);

	}

	public void selectlabelfromList() {
		sleep(7000);
		getElement(propOperation.getValue("SelectLabelfromCheckbox"), false).click();
		sleep(7000);
	}

	public void closePopup() {

		clickOnElementUsingAction(propOperation.getValue("CancelLabel"), true);
		sleep(2000);
	}

	public void SelectGlobalCheckbox() {

		getElement(propOperation.getValue("SelectAll"), false).click();
		;
		sleep(2000);
	}

	public boolean DeleteFromHover() {
		HoverOnElementUsingAction(propOperation.getValue("HoverOnMail"), true);
		sleep(3000);

		clickOnElement(propOperation.getValue("DeleteonMail"), true);
		sleep(2000);
		return isElementDisplayed(propOperation.getValue("DeleteConfirmationPopup"), true);

	}

	public void MarkAsReadFromHover() {
		HoverOnElementUsingAction(propOperation.getValue("FirstTile"), true);
		sleep(3000);
		clickOnElement(propOperation.getValue("HovermailIocnclick"), true);
		sleep(2000);
	}

	public boolean OpenMail() {
		clickOnElement(propOperation.getValue("FirstTile"), true);
		sleep(2000);
		return isElementDisplayed(propOperation.getValue("SubjectPresent"), true);

	}
	
	public void OpenFirstmails() {
		clickOnElement(propOperation.getValue("FirstMail"), true);
		sleep(2000);
	}
	
	public boolean isMailOpen() {
		clickOnElement(propOperation.getValue("FirstTile"), true);
		sleep(2000);
		return isElementDisplayed(propOperation.getValue("SubjectPresent"), true);

	}

	public void HoverExpandmail() {
		HoverOnElementUsingAction(propOperation.getValue("ExpandAll"), true);
	}

	public String Expandmailmessage() {

		String tooltipMessage = getAttribute(propOperation.getValue("ExpandAllmessage"), true, "title");
		System.out.println(tooltipMessage);
		return tooltipMessage;

	}

	public void ClickExpand() {
		clickOnElement(propOperation.getValue("ExpandAll"), true);
		sleep(5000);
	}

	public boolean HoverPrint(String expectedTooltipMessage) {
		HoverOnElementUsingAction(propOperation.getValue("Print"), true);
		sleep(3000);
		return isElementDisplayed(propOperation.getValue("Print"), true)
				&& getElementText(propOperation.getValue("printmessage"), true).equals(expectedTooltipMessage);

	}

	public void ClickonPrint() {
		clickOnElement(propOperation.getValue("Print"), true);
		sleep(5000);
	}

	public boolean HoverNewWindow(String expectedTooltipMessage) {
		HoverOnElementUsingAction(propOperation.getValue("NewWindow"), true);
		sleep(3000);
		return isElementDisplayed(propOperation.getValue("NewWindow"), true)
				&& getElementText(propOperation.getValue("NewWindowMessage"), true).equals(expectedTooltipMessage);

	}

	public void ClickonNewwindow() {
		String mainWindowHandle = getDriver().getWindowHandle();

		clickOnElement(propOperation.getValue("NewWindow"), true);
		sleep(5000);

	}

	public boolean isWindowOpened() {
		// Get all window handles
		Set<String> allWindowHandles = getDriver().getWindowHandles();

		// Return true if the count of window handles is greater than 1, indicating a
		// new window is opened
		return allWindowHandles.size() > 1;

	}

	public void SearchLable() throws InterruptedException {
		clickOnElement(propOperation.getValue("SearchInputField"), true);
		sleep(5000);

		setText(propOperation.getValue("SearchInputField"), true, "Lab");

	}

	public boolean OpenEllipses(String expectedTooltipMessage) {
		HoverOnElementUsingAction(propOperation.getValue("Ellipses"), true);
		sleep(3000);

		return isElementDisplayed(propOperation.getValue("Ellipses"), true)
				&& getElementText(propOperation.getValue("EllipsesMessage"), true).equals(expectedTooltipMessage);

	}

	public boolean ClickEllipses() {
		clickOnElement(propOperation.getValue("Ellipses"), true);
		sleep(2000);
		return isElementDisplayed(propOperation.getValue("SpamFromEllipses"), true);
	}

	public void ClickSpaminEllipses() {
		clickOnElement(propOperation.getValue("SpamFromEllipses"), true);
		sleep(2000);

	}

	public void ClickDeleteinEllipses() {
		clickOnElement(propOperation.getValue("DeleteFromEllipses"), true);
		sleep(2000);

	}

//
//	public String gettextkMarkAsReadEllipse() {
//		String tooltipMessage = getAttribute(propOperation.getValue("MarkAsReadUnread"), true, "title");
//		System.out.println(tooltipMessage);
//		return tooltipMessage;
//	}

	public void ClikcMarkAsReadEllipses() {
		clickOnElement(propOperation.getValue("MarkAsReadUnread"), true);
		sleep(2000);
	}

	public void ClickLabel() {
		clickOnElement(propOperation.getValue("Ellipselable"), true);
		sleep(2000);
	}

	public boolean AddFromEllipses() {
		clickOnElement(propOperation.getValue("LabelsEllipse"), true);
		sleep(2000);
		return isElementDisplayed(propOperation.getValue("LabelsEllipsePopup"), true);

	}

	public void SelectLabelFromEllipse() {
		clickOnElement(propOperation.getValue("FirstLableEllipses"), true);
		sleep(2000);
	}

	public void ChangeListView() {
		clickOnElement(propOperation.getValue("ListView"), true);
		sleep(2000);
	}

//	public boolean scrolleditor() {
//		waitUntilElementIsVisible("7000");
//		scrollToElement(); // Scroll to send button
//		waitUntilElementIsVisible("7000");
//		return isElementDisplayed(propOperation.getValue("SendButton"), true);
//	}

	public boolean IsMailPresent() {
		List<WebElement> EmailList = getAllElements(propOperation.getValue("EmailList"), true);
		System.out.println("Emails list size"+EmailList);

		return !EmailList.isEmpty();

	}

	public boolean getMessageElement() {
		if (IsMailPresent()) {
			return isElementDisplayed(propOperation.getValue("EmailList"), true);
		} else {
			return isElementDisplayed(propOperation.getValue("NoMail"), true);
		}

	}

	public void SpamFromSecondEliiplse() {
		HoverOnElementUsingAction(propOperation.getValue("SecondEllipse"), true);
		sleep(3000);
		clickOnElement(propOperation.getValue("SecondEllipse"), true);
		sleep(2000);

	}

	public void ClikcReportSpamSecondEllipse() {
		clickOnElement(propOperation.getValue("SecondReportSpam"), true);
		sleep(2000);

	}

	public void ClikcPrintSecondEllipse() {
		clickOnElement(propOperation.getValue("SecondEllipsePrint"), true);
		sleep(2000);

		Set<String> handler = getDriver().getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		System.out.println("parent window id:" + parentWindowId);

		String childWindowId = it.next();
		System.out.println("Child window id:" + childWindowId);

		getDriver().switchTo().window(childWindowId);

		sleep(3000);
		System.out.println("child window pop up title" + getDriver().getTitle());

		// getDriver().close();

		getDriver().switchTo().window(parentWindowId);

		System.out.println("parent window title" + getDriver().getTitle());
	}

	public void ClickOnOriginal() throws AWTException {
		clickOnElement(propOperation.getValue("original"), true);
		sleep(2000);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		sleep(2000);
	}

//	public void GetFirstMailOnRightClick() throws InterruptedException {
//		HoverOnElementUsingAction(propOperation.getValue("FirstTile"), true);
//
//		scrollToBottom();
//		WebElement element = getElement(propOperation.getValue("FirstMail"), true);
//		Actions actions = new Actions(getDriver());
//		actions.contextClick(element).perform();
//		Thread.sleep(2000); // Sleep after the action if necessary
//	}

	public void GetFirstMailOnRightClick() throws InterruptedException {
	    // Hover over the first tile
	    HoverOnElementUsingAction(propOperation.getValue("FirstTile"), true);

	    // Try to locate the first mail without scrolling
	    WebElement mailElement = null;
	    try {
	        mailElement = getElement(propOperation.getValue("FirstMail"), false); // Don't wait too long initially
	    } catch (NoSuchElementException e) {
	        // Mail not found initially, so scroll to bottom
	        scrollToBottom();
	        mailElement = getElement(propOperation.getValue("FirstMail"), true); // Now try again with wait
	    }

	    if (mailElement != null) {
	        // Perform right-click action on the first mail
	        Actions actions = new Actions(getDriver());
	        actions.contextClick(mailElement).perform();
	        Thread.sleep(5000); // Optional delay after right-click
	    } else {
	        System.out.println("No mail element found.");
	    }
	}
	
	public void waitUntilPopupIsVisible() {
	    String popupLocator = propOperation.getValue("PopupOnRightClick");
	    System.out.println(popupLocator);
	    waitUntilElementIsVisible(popupLocator); // Ensure popup is visible before continuing
	}
	
//	public void waitUntilPopupIsVisible() {
//	    String popupLocator = propOperation.getValue("PopupOnRightClick");
//	    System.out.println("Waiting for popup: " + popupLocator);
//
//	    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
//	    wait.until(driver -> isElementDisplayed(popupLocator, false)); // Check popup visibility dynamically
//	}
	
	
	public boolean isPopUpVisible() {
		List<WebElement> elements = getAllElements(propOperation.getValue("PopupOnRightClick"), true);
		for (WebElement element : elements) {
			System.out.println(element.getText());
		}

		return isElementDisplayed(propOperation.getValue("PopupOnRightClick"), true);

	}

	public void SendTospamFromRightClick() {
		clickOnElement(propOperation.getValue("ReportSpamFromPopup"), true);
		sleep(2000);

	}

	public void DeleteAfterRightClick() {
		clickOnElement(propOperation.getValue("DeletefromPopup"), true);
		sleep(2000);
	}

	public void MarkAsReadAfterRightClick() {
		clickOnElement(propOperation.getValue("Markasreadfrompopup"), true);
		sleep(2000);
	}

	public void SelectLabelFroRightClick() {
		clickOnElement(propOperation.getValue("Addlabelfrompopup"), true);
		sleep(2000);
	}

	public boolean isLablepopupvisible() {
		return isElementDisplayed(propOperation.getValue("AddLabelPopup"), true);

	}

	public void clickReplyiCon() {
		clickOnElement(propOperation.getValue("ReplyIcon"), true);
		sleep(3000);

	}

	public void ScrollPage() {
	    WebElement sendButtonElement = getElement(propOperation.getValue("SendButton"), false); // Initially, no wait

	    if (sendButtonElement == null) {
	        System.out.println("Send button element not found.");
	        return;
	    }

	    scrollToElement(sendButtonElement);

	    // Wait for the element to be visible after scrolling
	    if (!waitUntilElementIsVisibleOne(sendButtonElement)) {
	        // Handle the scenario where the element is not visible
	        System.out.println("Send button is not visible after scrolling.");
	    }
	}


	public void AddAnotherRecipient() throws InterruptedException {
		clickOnElement(propOperation.getValue("ClickSideRecipient"), true);
		sleep(3000);
		
		 setText(propOperation.getValue("AnotherRecipient"), false,"pramod@staging.blinkly.com");
		 pressEnterKey();
		 
		 sleep(2000);
			
		 setText(propOperation.getValue("AnotherRecipient"), false,"ankita@staging.blinkly.com");
		 pressEnterKey();
		 
	}
	
	public void ClickReplyButton() {
		clickOnElement(propOperation.getValue("ReplyButton"), true);
		sleep(3000);
	}
	
	
	
	public void ClickForwardIcon() { 
		clickOnElement(propOperation.getValue("ForwardIcon"), true);
		sleep(3000);
	}
	
	
	public void ClickForwardButton() { 
		clickOnElement(propOperation.getValue("ForwardButton"), true);
		sleep(3000);
	}
	
	
	
	
	
	

}
