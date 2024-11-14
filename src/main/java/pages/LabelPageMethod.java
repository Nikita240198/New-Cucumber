package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class LabelPageMethod extends PredefinedActions {
	public PropOperation propOperation;
	 

	public LabelPageMethod() {

		propOperation = new PropOperation(ConstantPath.LabelLocator);
	}

	public void hoverCreateLabel() {
		HoverOnElementUsingAction(propOperation.getValue("CreateLabel"), true);
		sleep(3000);
	}

	public String getTooltipMessage() {
		String tooltipElement = getElementText(propOperation.getValue("CretaeLabelTooltip"), true);
		return tooltipElement;
	}

	public void clickCretaeLabel() {
		clickOnElement(propOperation.getValue("CreateLabel"), true);
		sleep(15000);
	}

	public boolean isConfirmationPopupComesforlabel() {
		return isElementDisplayed(propOperation.getValue("CreateNewLabelPopup"), true);
	}

	public boolean getLabelPresentinList() {
		List<WebElement> LabelList = getAllElements(propOperation.getValue("LabelinList"), true);
		System.out.println(LabelList);

		return !LabelList.isEmpty();
	}

	public String CreateNewLabel() throws InterruptedException {

		String labelName = "Label_" + System.currentTimeMillis();
		// Enter Lable name
		sleep(2000);
//		setText(propOperation.getValue("LabelInputField"), true, "label1");

		setText(propOperation.getValue("LabelInputField"), true, labelName);

		System.out.println("label name is --> " + labelName);

		// Select color from List
		clickOnElement(propOperation.getValue("LabelColor"), true);
		sleep(2000);

		// Create Label
		clickOnElement(propOperation.getValue("CreatelabelButton"), true);
		sleep(2000);

		return labelName;

	}

	public boolean isLabelPresentInList(String labelName) {
		// Use a dynamic XPath to locate the specific label in the list
		String labelLocator = propOperation.getValue("LabelinList").replace("LABEL_NAME", labelName);

		List<WebElement> labelElements = getAllElements(labelLocator, true);

		// Print the list for debugging
		System.out.println(labelElements);

		// Return true if the label is found, otherwise false
		return !labelElements.isEmpty();

	}

	public String clickCustomColor() throws InterruptedException {
		String labelName = "Label_" + System.currentTimeMillis();
		// Enter Lable name
		sleep(2000);
//		setText(propOperation.getValue("LabelInputField"), true, "label1");

		setText(propOperation.getValue("LabelInputField"), true, labelName);

		System.out.println("label name is --> " + labelName);

		clickOnElement(propOperation.getValue("CustomColorCTA"), true);
		sleep(2000);

		return labelName;
	}

	public boolean isCustomColorPopupDisplayed() {
		return isElementDisplayed(propOperation.getValue("CustomColorPopup"), true);
	}

	public void selectColor() {
		clickOnElement(propOperation.getValue("SelectColor"), true);
		sleep(2000);
	}

	public void selectTextColor() {
		clickOnElement(propOperation.getValue("TextColor"), true);

	}

	public void addColor() {
		clickOnElement(propOperation.getValue("AddColor"), true);

	}

	public void clickOnCreate() {
		clickOnElement(propOperation.getValue("CreatelabelButton"), true);
		sleep(2000);
	}

	public void cancelColor() {
		clickOnElement(propOperation.getValue("CancelColor"), true);

	}

	public void cancelLabel() {
		clickOnElement(propOperation.getValue("CancelLabel"), true);
		sleep(3000);

	}

	public void selectNestLabel() {
		clickOnElement(propOperation.getValue("NestLabel"), true);
		
		 List<WebElement> options = getAllElements(propOperation.getValue("NestList"), true);
		 
		 System.out.println(options);
		 
		 clickOnElement(propOperation.getValue("SelectLabel"), true);


	}
	
	public void openSublabel() {
		clickOnElement(propOperation.getValue("LabelIcon"), true);
		sleep(3000);
		
	}
	public boolean isSubLabelListPresent() {
		return isElementDisplayed(propOperation.getValue("SubLabelList"), true);
	}
	
	
	public void enterRandomLabelName()throws InterruptedException {
		
		String labelName = "Label_" + System.currentTimeMillis();
		// Enter Lable name
		sleep(2000);
//		setText(propOperation.getValue("LabelInputField"), true, "label1");

		setText(propOperation.getValue("LabelInputField"), true, labelName);

		System.out.println("label name is --> " + labelName);
	}
	
	public void selectLabel() {
		clickOnElement(propOperation.getValue("FirstLabel"), true);
		sleep(2000);
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
	
	public void removeLabel() {
		clickOnElement(propOperation.getValue("RemoveLabel"), true);
		sleep(2000);
	}
	
	public void removeLabelFromThirdPane() {
		clickOnElement(propOperation.getValue("RemoveLabelThirdPane"), true);
		sleep(2000);
	}
	
	public boolean isSubLabelLRemoved() {
		return isElementDisplayed(propOperation.getValue("CancelLabelConfirmation"), true);
	}
	
	public String getConfirmationMessage() {
		String tooltipElement = getElementText(propOperation.getValue("CancelLabelConfirmation"), true);
		return tooltipElement;
	}
	
	public int getLabelCount() {
        List<WebElement> initialLabels = getAllElements(propOperation.getValue("LabelWithEmail"), true);
        int initialLabelCount = initialLabels.size();
        System.out.println("Initial label count: " + initialLabelCount);
        return initialLabelCount;
    }
	
	public void nextCheckBox() {
		
		sleep(5000);
		getElement(propOperation.getValue("AnotherCheckBox"), false).click();
		sleep(5000);

	}
	
    public int checkLabelGetsAdded() {
        List<WebElement> updatedLabels = getAllElements(propOperation.getValue("LabelWithEmail"), true);
        int newLabelCount = updatedLabels.size();
        System.out.println("New label count: " + newLabelCount);
        return newLabelCount;
    }
    
    public void hoverEllipsis() {
    	 HoverOnElementUsingAction(propOperation.getValue("FirstEllipsis"), true);
    }
    
    public String getEllipsisrMessage() {
		String EllipsisElement = getElementText(propOperation.getValue("FirstEllipsis"), true);
		return EllipsisElement;
		
	}
    
    public void clickEllipsis() {
    	clickOnElement(propOperation.getValue("FirstEllipsis"), true);
		sleep(2000);
    }


}
