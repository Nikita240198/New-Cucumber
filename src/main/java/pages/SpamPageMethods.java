package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class SpamPageMethods extends PredefinedActions {

public PropOperation propOperation;
	

	public SpamPageMethods() {
		propOperation = new PropOperation(ConstantPath.SpamPageLocator);
	}
	
	public void clickSpam() {
		clickOnElement(propOperation.getValue("Spam"), true);
		sleep(15000);
		
	}
	
	public boolean IsMailPresent() {
		List<WebElement> EmailList = getAllElements(propOperation.getValue("MailinSpan"), true);
		System.out.println(EmailList);

		return !EmailList.isEmpty();

	}

	public boolean getMessageElement() {
		if (IsMailPresent()) {
			return isElementDisplayed(propOperation.getValue("MailinSpan"), true);
		} else {
			return isElementDisplayed(propOperation.getValue("NomailInspam"), true);
		}
		

	}
	
	
	public boolean HoverSpam(String expectedTooltipMessage) {
		HoverOnElementUsingAction(propOperation.getValue("ReportspamHeader"), true);
		sleep(3000);
		return isElementDisplayed(propOperation.getValue("ReportInboxMessage"), true)
				&& getElementText(propOperation.getValue("ReportInboxMessage"), true).equals(expectedTooltipMessage);

	}
	
	public void clickReportSpamFromRightClick() {
		clickOnElement(propOperation.getValue("MoveInboxRightClick"), true);
		sleep(15000);
	}
	
	public boolean isConfirmationPopupComes() {
		return isElementDisplayed(propOperation.getValue("SpamConfirmationPopup"), true);
	}
	
	public void clickInbox() {
		clickOnElement(propOperation.getValue("Inbox"), true);
		sleep(15000);
	}
	
	public boolean isinboxPresent() {
		return isElementDisplayed(propOperation.getValue("inboxinList"), true);
	}
	
	public void clickMoveToInbox() {
		clickOnElement(propOperation.getValue("MoveInbox"), true);
		sleep(15000);
	}

}
