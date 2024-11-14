package pages;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class SentMailPageMethods extends PredefinedActions{
	
public PropOperation propOperation;
	

	public SentMailPageMethods() {
		propOperation = new PropOperation(ConstantPath.SentPageLocator);
	}
	
	public void clickSentEmail() {
		clickOnElement(propOperation.getValue("Sent"), true);
		sleep(3000); 
	}
	
	public boolean isSentMailListvisble() {
		return isElementDisplayed(propOperation.getValue("SentList"), true); 
	}

	public void clickSpamIcon() {
		clickOnElement(propOperation.getValue("SpamIcon"), true);
		sleep(3000); 
		
	}
	
	public String getSpamErrorMessage() {
		String ErrorElement = getElementText(propOperation.getValue("SentSpamError"), true);
		return ErrorElement;
		
	}
	
}
