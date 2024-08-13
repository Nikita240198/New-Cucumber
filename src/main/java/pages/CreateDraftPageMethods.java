package pages;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class CreateDraftPageMethods extends PredefinedActions {
	public PropOperation propOperation; 
	
	public CreateDraftPageMethods() {
		propOperation = new PropOperation(ConstantPath.CreateDraftPageLocator);
	}
	
	
	public void ClickOnEmail() {
		clickOnElement(propOperation.getValue("Emails"), true);
		sleep(5000); 
	}
	
	
	public void ClickOnDrafts() {
		clickOnElement(propOperation.getValue("MenuDraft"), true);
		sleep(3000); 
	}
	
	
	public boolean isListPresent() {
		return isElementDisplayed(propOperation.getValue("DraftList"), true);
	}
	
	
	public void OpenFirstDrafts() {
		clickOnElement(propOperation.getValue("FirstDraft"), true);
		sleep(3000); 
	}
	
	public boolean isDraftOpeninPopup() {
		return isElementDisplayed(propOperation.getValue("DraftList"), true);
	}
	
	
	
}
