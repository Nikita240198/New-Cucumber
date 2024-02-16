package pages;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class ComposePageMethods extends PredefinedActions {
	public PropOperation propOperation;

	public ComposePageMethods() {
		propOperation = new PropOperation(ConstantPath.ComposeMailLocator);
	}
	
	public void OpenCompose() {
		clickOnElement(propOperation.getValue("ComposeButton"),true);
		sleep(3000);
	}
	
	public boolean isComposeOpen() {
		return isElementVisible(propOperation.getValue("ToField"));
	}
	public void ClickOnSend() {
		clickOnElement(propOperation.getValue("SendButton"),true);
	}
	
	public boolean isErrorPopupAppear() {
		return isElementVisible(propOperation.getValue("ErrorPopup"));
	}
	
	public void CloseErrorPopup() {
		clickOnElement(propOperation.getValue("OkButton"),true);
	}
	
	
	
	
}
