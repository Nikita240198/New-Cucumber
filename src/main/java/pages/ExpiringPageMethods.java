package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class ExpiringPageMethods extends PredefinedActions {
	public PropOperation propOperation;

	public ExpiringPageMethods() {
		propOperation = new PropOperation(ConstantPath.ExpiryLocator);
	}

	public void clickExpiring() {
		clickOnElement(propOperation.getValue("ExpiringTab"), true);
		sleep(3000);
	}

	public boolean IsMailPresent() {
		List<WebElement> EmailList = getAllElements(propOperation.getValue("emailLIst"), true);
		System.out.println("Emails list size" + EmailList);

		return !EmailList.isEmpty();

	}

	public boolean getMessageElement() {
		if (IsMailPresent()) {
			return isElementDisplayed(propOperation.getValue("emailLIst"), true);
		} else {
			return isElementDisplayed(propOperation.getValue("Nomails"), true);
		}

	}

	public String getNoMailnMessage() {
		String tooltipElement = getElementText(propOperation.getValue("Nomails"), true);
		return tooltipElement;
	}

	public boolean isIconPresent() {
		return isElementDisplayed(propOperation.getValue("ExpiryIcon"), true);
	}

	public boolean isTimerPresent() {
		return isElementDisplayed(propOperation.getValue("ExpiryTime"), true);

	}

	public String getExpiryErrorMessage() {
		String ErrorElement = getElementText(propOperation.getValue("ExpirySpamError"), true);
		return ErrorElement;

	}

	public boolean isTimerPresentinThirdPane() {
		return isElementDisplayed(propOperation.getValue("ThirdPaneTimer"), true);
	}

	public boolean isConetentPresent() {
		return isElementDisplayed(propOperation.getValue("MailContent"), true);
	}

	public void isReplyButtonPresent() {
		String element = getAttribute(propOperation.getValue("ReplyButton"), true, "value");

		if (element != null) {

			System.out.println("The button displayed" + element + " button");

		} else {
			System.out.println("No button found.");
		}
	}

}
