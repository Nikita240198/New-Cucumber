package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.PredefinedActions;
import constant.ConstantPath;
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

	public boolean isTooltipMessageSame() {
		return isElementDisplayed(propOperation.getValue("DeleteMessage"), true);
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
		getElement(propOperation.getValue("SelectLabelfromCheckbox"),false).click();
		sleep(7000);
}
	
	
	public void closePopup() {
		
		clickOnElementUsingAction(propOperation.getValue("CancelLabel"), true);
		sleep(7000);
}
	
	
	public void SelectGlobalCheckbox() {
		
		getElement(propOperation.getValue("SelectAll"), false).click();;
		sleep(2000);
	}
	
	public boolean DeleteFromHover() {
		HoverOnElementUsingAction(propOperation.getValue("HoveronMail"), true);
		sleep(3000);
		clickOnElement(propOperation.getValue("HoverDeleteonMail"), true);
		sleep(2000);
		return isElementDisplayed(propOperation.getValue("DeleteConfirmationPopup"),true);
		
	}
	
	
	public void	MarkAsReadFromHover(){
		HoverOnElementUsingAction(propOperation.getValue("HoverIcon"), true);
		sleep(3000);
		clickOnElement(propOperation.getValue("HovermailIocnclick"), true);
		sleep(2000);
	}
	
	public boolean OpenMail() {
		clickOnElement(propOperation.getValue("FirstTile"), true);
		sleep(2000);
		return isElementDisplayed(propOperation.getValue("SubjectPresent"), true);
				
	}
	
	public void HoverExpandmail(){
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
		clickOnElement(propOperation.getValue("NewWindow"), true);
		sleep(5000);
	}
	
	
	
}