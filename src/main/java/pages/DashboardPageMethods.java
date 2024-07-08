package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.PredefinedActions;
import constant.ConstantPath;
import stepDefinition.AutomationHooks;
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
		sleep(5000);
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
		clickOnElement(propOperation.getValue("Apply"), true);
		sleep(5000);

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
		sleep(7000);
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
		HoverOnElementUsingAction(propOperation.getValue("HoverOnMail"), true);
		sleep(3000);
		clickOnElement(propOperation.getValue("HovermailIocnclick"), true);
		sleep(2000);
	}

	public boolean OpenMail() {
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

	public boolean SendReplyFromIcon() {
		String replyIconLocator = propOperation.getValue("ReplyIcon");
		System.out.println("ReplyIcon Locator: " + replyIconLocator); // Debug statement
		clickOnElement(replyIconLocator, true);
		sleep(2000);

		return isElementDisplayed(propOperation.getValue("OpenEditor"), true);

	}

	public boolean scrolleditor() {
		waitUntilElementIsVisible("7000");
		scrollToElement(); // Scroll to send button
		waitUntilElementIsVisible("7000");
		return isElementDisplayed(propOperation.getValue("SendButton"), true);
	}

	public boolean IsMailPresent() {
		List<WebElement> EmailList = getAllElements(propOperation.getValue("EmailList"), true);
		System.out.println(EmailList);

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

		//getDriver().close();

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
	
	public void DeleteFromSeconellipse() {
		
	}
	
	
	
	
	
	
	
	
	
	
}
