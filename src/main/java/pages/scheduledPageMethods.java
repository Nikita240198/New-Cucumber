package pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class scheduledPageMethods  extends PredefinedActions {
	public PropOperation propOperation;
	
	public scheduledPageMethods() {
		propOperation = new PropOperation(ConstantPath.SchedulePageLocator);
	}

	public boolean isScheduleMailListavailable() { 
		return isElementDisplayed(propOperation.getValue("FirstScheduleMail"), true);
	}
	
	public void clickFirstScheduleMail() {
		clickOnElement(propOperation.getValue("FirstScheduleMail"), true);
		sleep(3000);
	}
	
	public void clickEditScheduleMail() {
		
		clickOnElement(propOperation.getValue("EditSchedule"), true);
		sleep(3000);
	}
	
	
	public boolean isMailConentListavailable() { 
		return isElementDisplayed(propOperation.getValue("FirstScheduleMail"), true);
	}
	
	
	public void clickEditInScheduleMailBox() {
		clickOnElement(propOperation.getValue("EditScheduleinCompose"), true);
		sleep(3000);
	}
	

	
	public void editParticularDate() {
		clickOnElement(propOperation.getValue("SelectParticularDate"), true);
		sleep(3000);
	}
	
	public void editSubject() throws InterruptedException {
		clickOnElement(propOperation.getValue("subjectLocator"), true);
		sleep(5000);
		String data = getAttribute(propOperation.getValue("subjectLocator"), true,"value");
		for (int i = 0; i < data.length(); i++) {
			pressBackSpace();
			
		}
		sleep(3000);
		setText(propOperation.getValue("subjectLocator"), true, "Edit Subject-2");
		sleep(3000);
	}
	

	
	
	public void editBody() throws InterruptedException {
		clickOnElement(propOperation.getValue("bodyLocator"), true);
		sleep(3000);
		pressWIndowAndAll();
			pressBackSpace();
		sleep(3000);
		setText(propOperation.getValue("bodyLocator"), true, "Reflecting on my experiences with music and writing now, though,"
				+ " I will say that there is simply no way I could possibly write my dissertation without music."
				+ " (This is for a different blog post, but I also want to note here that there’s also no way "
				+ "I could write without my constant cat companion, whom I also call my writing “Mews,” Cappuccino.)");
		
		sleep(3000);
		
	}
	
	
	public void cancelScheduledDraft() {
		clickOnElement(propOperation.getValue("cancelSchedule"), true);
		sleep(3000);
	}
	
	public boolean isScheduledGetRemoved() {
		return isElementDisplayed(propOperation.getValue("mailInDraft"), true);
	}
	
	
	public void clickDropDown() {
		clickOnElement(propOperation.getValue("dropdownIcon"), true);
		sleep(3000);
	}
	
	public void clickDetailDropDown() {
		clickOnElement(propOperation.getValue("detailDropDown"), true);
		sleep(3000);
	}
	
	public void openComposeFrom() {
		clickOnElement(propOperation.getValue("openComposeFrom"), true);
		sleep(3000);
	}
	public boolean isComposeOpen() {
		return isElementDisplayed(propOperation.getValue("Compose"), true);
	}
	
	public void copyMailFrom() {
		clickOnElement(propOperation.getValue("fromCopy"),true);
	}
	
	public void openComposeTo() {
		clickOnElement(propOperation.getValue("openComposeFrom"), true);
		sleep(3000);
	}
	
	public void copyMailTo() {
		clickOnElement(propOperation.getValue("toCopy"),true);
	}
	
	public void crossSchedule() {
		clickOnElement(propOperation.getValue("crossSchedule"), true);
		sleep(3000);
	}
	
}
