package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class EmailsPageMethods extends PredefinedActions {
	public PropOperation propOperation;
	

	public EmailsPageMethods() {
		propOperation = new PropOperation(ConstantPath.EmailPageLocator);
	}

	public void ClickEmail() {
		clickOnElement(propOperation.getValue("Emails"), true);
		sleep(3000);
	}

	public boolean isMessageVisible() {
		return isElementDisplayed(propOperation.getValue("Nomails"), true);
	}

	public boolean isListVisible() {
		return isElementDisplayed(propOperation.getValue("emailLIst"), true);
	}

	public boolean isinboxPresent() {
		return isElementDisplayed(propOperation.getValue("inboxinList"), true);
	}

	public boolean isDraftPresent() {
		return isElementDisplayed(propOperation.getValue("DraftinList"), true);
	}

	public boolean isSentMailPresent() {
		return isElementDisplayed(propOperation.getValue("SentinList"), true);
	}

	public boolean isSpamPresent() {
		return isElementDisplayed(propOperation.getValue("SpaminList"), true);
	}

	public void HandlePrintWindow() {
		clickOnElement(propOperation.getValue("NewWindowLocator"), true);
		sleep(3000);
		Set<String> handler = getDriver().getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		System.out.println("parent window id:" + parentWindowId);

		String childWindowId = it.next();
		System.out.println("Child window id:" + childWindowId);

		getDriver().switchTo().window(childWindowId);

		sleep(3000);
		System.out.println("child window pop up title" + getDriver().getTitle());

		getDriver().close();

		getDriver().switchTo().window(parentWindowId);

		sleep(3000);

		System.out.println("parent window title" + getDriver().getTitle());

	}
	
	
public void LoadAllmail() {
	HoverOnElementUsingAction(propOperation.getValue("FirstTile"), true);
	 sleep(3000);
	 clickOnElement(propOperation.getValue("Scroller"), true);
		sleep(3000);
		
		
		scrollToBottom();
	 
	 
}


}
