package pages;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class ComposePageMethods extends PredefinedActions {
	public PropOperation propOperation;

	public ComposePageMethods() {
		propOperation = new PropOperation(ConstantPath.ComposeLocator);
	}
	
	public void OpenCompose() {
		clickOnElement(propOperation.getValue("ComposeButton"),true);
		sleep(3000);
	}
	
	public boolean isComposeOpen() {
		
		return isElementDisplayed(propOperation.getValue("ComposeTitle"), true);
	}
	
	public void ClickOnSend() {
		clickOnElement(propOperation.getValue("SendButton"),true);
		sleep(3000);
	}
	
	public boolean isErrorPopupAppear() {
		return isElementDisplayed(propOperation.getValue("ErrorPopup"),true);
	}
	
	public void CloseErrorPopup() {
		clickOnElement(propOperation.getValue("OkButton"),true);
		sleep(3000);
	}
	
	
	public void ClickOutsidePopup() {
		clickOnElement(propOperation.getValue("OutsidePopup"),true);
		sleep(3000);
	}
	
}
