package stepDefinition;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LabelPageMethod;


public class LabelPageStep {
	
	  private int initialCount; 
	
	LabelPageMethod labelPageMethod = new LabelPageMethod();  
	
	@When("User Hover on Cretae Label should show Tooltip message")
	public void user_Hover_on_Cretae_Label_should_show_Tooltip_message() {
		labelPageMethod.hoverCreateLabel();
		String actualTooltipMessage = labelPageMethod.getTooltipMessage();
		Assert.assertEquals("Tooltip message for create Label is not as expected", "Create new label", actualTooltipMessage);
		
	}
	
	

	@Then("On click on create Label it should show Create Label popup")
	public void on_click_on_create_Label_it_should_show_Create_Label_popup() {
		labelPageMethod.clickCretaeLabel();
		 Assert.assertTrue("Create new label popup is not present",labelPageMethod.isConfirmationPopupComesforlabel() );
	}

	@Then("User Create New Label and it should get added in List")
	public void user_Create_New_Label_and_it_should_get_added_in_List() throws InterruptedException {
		labelPageMethod.getLabelPresentinList();
		
		String labelName = labelPageMethod.CreateNewLabel();
		
		
		Assert.assertTrue("Label was not added successfully", labelPageMethod.isLabelPresentInList(labelName));
	}
	
	@When("On click on custom color it should open color selector popup")
	public void on_click_on_custom_color_it_should_open_color_selector_popup() throws InterruptedException {
		
	    labelPageMethod.clickCustomColor();
	    Assert.assertTrue("Custom color popup is not there", labelPageMethod.isCustomColorPopupDisplayed());
	    
	}

	@When("User select backgroung color")
	public void user_select_backgroung_color() {
	   labelPageMethod.selectColor();
	}

	@When("User select text color")
	public void user_select_text_color() {
		labelPageMethod.selectTextColor();
	}

	@When("On click on Add custom color should get added")
	public void on_click_on_Add_custom_color_should_get_added() {
	    labelPageMethod.addColor();
	}

	@Then("click on Create CTA it will Create New Label and it should get added in List")
	public void click_on_Create_CTA_it_will_Create_New_Label_and_it_should_get_added_in_List() throws InterruptedException {
	  labelPageMethod.clickOnCreate();
	  String labelName = labelPageMethod.clickCustomColor();
	  Assert.assertTrue("Label was not added successfully", labelPageMethod.isLabelPresentInList(labelName));
	}

	
	@Then("click on Cancel CTA it will Not Create New color and it should not get added in List")
	public void click_on_Cancel_CTA_it_will_Not_Create_New_color_and_it_should_not_get_added_in_List() {
	  labelPageMethod.cancelColor();
	}

	
	@Then("click on Cancel button it will Not Create New Label and it should not get added in List")
	public void click_on_Cancel_button_it_will_Not_Create_New_Label_and_it_should_not_get_added_in_List() {
	   labelPageMethod.cancelLabel();
	}
	
	@When("User Enter Label Name")
	public void user_Enter_Label_Name() throws InterruptedException {
	   labelPageMethod.enterRandomLabelName();
	}


	@When("User select Nest label it should show all lables and User Select any one label from dropdown")
	public void user_select_Nest_label_it_should_show_all_lables_and_User_Select_any_one_label_from_dropdown() {
	labelPageMethod.selectNestLabel();
	
	}


	@Then("User Create New Label")
	public void user_Create_New_Label() {
		labelPageMethod.clickOnCreate();
	 
	}

	@Then("User Open Parent Label new sub label should be present")
	public void user_Open_Parent_Label_new_sub_label_should_be_present() {
	  labelPageMethod.openSublabel();
	  Assert.assertTrue("Label was not added successfully", labelPageMethod.isSubLabelListPresent());
	}
	
	@When("User select label")
	public void user_select_label() {
	    labelPageMethod.selectLabel();
	}

	@Then("it will show labels otherwise show messages")
	public void it_will_show_labels_otherwise_show_messages() {
		if(labelPageMethod.IsMailPresent()) {
			Assert.assertTrue("There are no messages in list" ,labelPageMethod.getMessageElement());
		
	            System.out.println("Messages are present.");
		}
		else {
			  System.out.println("There are no messages to read.");
		}
	}
	
	
	@Then("User Should be able to remove label from list and It should show confirmation popup")
	public void user_Should_be_able_to_remove_label_from_list_and_It_should_show_confirmation_popup() {
	    labelPageMethod.removeLabel();
	    Assert.assertTrue("Label was not added successfully", labelPageMethod.isSubLabelLRemoved());
	}
	
	@Then("User Should be able to remove label from Third Pane and It should show confirmation popup")
	public void user_Should_be_able_to_remove_label_from_Third_Pane_and_It_should_show_confirmation_popup() {
		 labelPageMethod.removeLabelFromThirdPane();
		    Assert.assertTrue("Label was not added successfully", labelPageMethod.isSubLabelLRemoved());
	}
	
	@Then("it should show Tooltip message label is already added")
	public void it_should_show_Tooltip_message_label_is_already_added() {
		 String actualTooltipMessage = labelPageMethod.getConfirmationMessage();
		    Assert.assertEquals("Tooltip message for delete is not as expected", "Label already added.", actualTooltipMessage);
	}
	
	@Then("user select next Checkbox on List and Label should get added")
	public void user_select_next_Checkbox_on_List_and_Label_should_get_added() {
	    // Get the initial count of labels and store it in the class-level variable
	    initialCount = labelPageMethod.getLabelCount();
	    
	    // Select the next checkbox
	    labelPageMethod.nextCheckBox();
	}
	

	@When("User Click on Cancel to close popup")
	public void user_Click_on_Cancel_to_close_popup() {
	    // Click on cancel to close the popup
	    labelPageMethod.cancelLabel();
	    
	    // Get the new label count after adding the label
	    int newCount = labelPageMethod.checkLabelGetsAdded();
	    
	    // Assert that the new count is one more than the initial count
	 // Correct the order of parameters in the assertEquals method
	    Assert.assertEquals("The label count did not increase as expected.", initialCount + 1, newCount);

	}
	
	@When("User Hover on ellipsis it shows tooltip More")
	public void user_Hover_on_ellipsis_it_shows_tooltip_More() {
	    labelPageMethod.hoverEllipsis();
	    String actualEllipsisMessage = labelPageMethod.getEllipsisrMessage();
	    Assert.assertEquals("Ellipsis message is not as expected", "More", actualEllipsisMessage);
	}

	@Then("On Click on Ellipsis it shows all options")
	public void on_Click_on_Ellipsis_it_shows_all_options() {
	   labelPageMethod.clickEllipsis();
	   
	}




}
