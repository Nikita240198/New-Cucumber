package pages;

import org.openqa.selenium.WebElement;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class CreateDraftPageMethods extends PredefinedActions {
	public PropOperation propOperation;

	public CreateDraftPageMethods() {
		propOperation = new PropOperation(ConstantPath.CreateDraftPageLocator);
	}

	
	public boolean isDashboardEnable() {
		sleep(7000);
		return isElementDisplayed(propOperation.getValue("Emails"), true);
		
	}
	
	
	public void ClickOnEmail() {
//		WebElement Emails= getElement(propOperation.getValue("Emails"),true);
//		
//		 waitUntilElementIsClickable(Emails);
//		 
//		 Emails.click();
		
		clickOnElement(propOperation.getValue("Emails"), true);
		sleep(3000);
		 
//		 clickOnElementUsingAction(propOperation.getValue("Emails"),true);
	 sleep(3000);
		 
		 
		 
	}

	public void ClickOnDrafts() {
		clickOnElement(propOperation.getValue("MenuDraft"), true);
		sleep(3000);
	}

	public boolean isListPresent() {
		
		
		waitUntilElementIsVisible(propOperation.getValue("DraftList"));
		
		return isElementDisplayed(propOperation.getValue("DraftList"), true);
	}

	public void OpenFirstDrafts() {
		clickOnElement(propOperation.getValue("FirstDraft"), true);
		sleep(3000);
	}

	public boolean isDraftOpeninPopup() {
		return isElementDisplayed(propOperation.getValue("DraftList"), true);
	}

	public boolean isDraftinCc() {
		return isElementDisplayed(propOperation.getValue("DraftInCc"), true);
	}

	public boolean isDraftinBCc() {
		return isElementDisplayed(propOperation.getValue("DraftInBCc"), true);
	}

	public boolean isSubjectPresent() {
		return isElementDisplayed(propOperation.getValue("SubjectDraft"), true);
	}

	public boolean isBodyPresent() {
		return isElementDisplayed(propOperation.getValue("BodyDraft"), true);
	}

	public boolean isScheduletimeDisplayed() {
		return isElementDisplayed(propOperation.getValue("ScheduleDraft"), true);

	}

	public boolean isExpirationTImeDisplayed() {
		return isElementDisplayed(propOperation.getValue("ScheduleDateandTime"), true);

	}

	public boolean isVCDisplayed() {
		return isElementDisplayed(propOperation.getValue("VCDraft"), true);

	}

	public boolean isD2IDisplayed() {
		return isElementDisplayed(propOperation.getValue("VCDraft"), true);

	}

	public void clickFontTypeIcon() {
		clickOnElement(propOperation.getValue("FontTypeicon"), true);
		sleep(5000);
	}

	public void ClickTextFormat() {
		clickOnElement(propOperation.getValue("TextFormatIcon"), true);
		sleep(2000);
	}

	public boolean isFontTypeSelected() {
		return isElementDisplayed(propOperation.getValue("SelctFont"), true);
	}

	public void OpenChnageFont() {
		clickOnElement(propOperation.getValue("FontSizeicon"), true);
		sleep(3000);
	}

	public boolean isFontSizeChanged() {
		return isElementDisplayed(propOperation.getValue("ChangeFontSize"), true);
	}

	public boolean isLinkPresent() {
		return isElementDisplayed(propOperation.getValue("CreatedLink"), true);
	}

	public void ChangeSubject() throws InterruptedException {
		SelectAllText(propOperation.getValue("SubjectDraft"), true);
		sleep(3000);
		pressBackSpace();
		
		String subjectLocator = propOperation.getValue("SubjectDraft");
		
		setTextUsingJS(subjectLocator, true, "Edited Subject");
	
		sleep(3000);

	}

	public void EnteranotherRecipient() throws InterruptedException {
		setText(propOperation.getValue("ToField"), true, "veer@staging.blinkly.com");
		sleep(3000);
	}

	public void ChangeBody() {
		SelectAllText(propOperation.getValue("BodyDraft"), true);
		pressBackSpace();
		String bodyLocator = propOperation.getValue("BodyDraft");

		String largeText = "Although most people consider piranhas to be quite dangerous, they are, "
				+ "for the most part, entirely harmless. Piranhas rarely feed on large animals; they "
				+ "eat smaller fish and aquatic plants. When confronted with humans, piranhas’ "
				+ "first instinct is to flee, not attack";

		setTextUsingJS(bodyLocator, true, largeText);

	}

	public void CancelScheduleDandT() {
		clickOnElement(propOperation.getValue("CancelSchedule"), true);
		sleep(3000);
	}

	public void CollapseExpandDraftList() {
		clickOnElement(propOperation.getValue("Collapsedraft"), true);
		sleep(3000);
	}
	
	public void SCrollDraftList() {
	
		    WebElement List = getElement(propOperation.getValue("Srollarcontainer"), false); // Initially, no wait

		    if (List == null) {
		        System.out.println("List is not found.");
		        return;
		    }

		    scrollToElement(List);

		    // Wait for the element to be visible after scrolling
		    if (!waitUntilElementIsVisibleOne(List)) {
		        // Handle the scenario where the element is not visible
		        System.out.println("Send button is not visible after scrolling.");
		}
	}
	
	public void ClickSpam() {
		clickOnElement(propOperation.getValue("ReportspamHeader"), true);
		sleep(3000);
	}
	
	public String isValidationMessageVisible() {
		sleep(5000);
		 String validationMessage = getElementText(propOperation.getValue("SpamValidation"), true);
		 
		System.out.println(validationMessage);
		return validationMessage;
	
	}
	
	
	public void clickMoveToInbox() {
		clickOnElement(propOperation.getValue("MoveToInbox"), true);
		sleep(3000);
	}
	
	public void clickDropDown() {
		clickOnElement(propOperation.getValue("dropdownIcon"), true);
		sleep(3000);
	}
	
	

}
