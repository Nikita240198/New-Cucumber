package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateDraftPageMethods;
import pages.DashboardPageMethods;
import pages.EmailsPageMethods;

public class CreateDraftPageSteps {
	
	CreateDraftPageMethods draftsPageMethod = new CreateDraftPageMethods(); 

@When("On click on Drafts user should navigate to draft screen")
public void on_click_on_Drafts_user_should_navigate_to_draft_screen() throws InterruptedException {
	
	Assert.assertTrue("There is no list", draftsPageMethod.isDashboardEnable());
	Thread.sleep(3000);
	
	draftsPageMethod.ClickOnEmail();	
	draftsPageMethod.ClickOnDrafts();

}


@Then("Created Draft should be present in list")
public void created_Draft_should_be_present_in_list() {
	Assert.assertTrue("There is no list", draftsPageMethod.isListPresent());
}


@Then("User Open First Draft in list")
public void user_Open_First_Draft_in_list() {
	draftsPageMethod.OpenFirstDrafts();
	Assert.assertTrue("There is no list", draftsPageMethod.isDraftOpeninPopup());
}

@Then("Email should be present in Cc Field")
public void email_should_be_present_in_Cc_Field() {
	Assert.assertTrue("There is no list", draftsPageMethod.isDraftinCc());
}

@Then("Email should be present in BCc Field")
public void email_should_be_present_in_BCc_Field() {
	Assert.assertTrue("There is no list", draftsPageMethod.isDraftinBCc());
}

@Then("Subject should be present")
public void subject_should_be_present() {
    Assert.assertTrue("There is no list", draftsPageMethod.isSubjectPresent());
}

@Then("Body should be present")
public void body_should_be_present() {
	Assert.assertTrue("There is no body ", draftsPageMethod.isBodyPresent());
}

@Then("Saved schedule save date and time should be present")
public void saved_schedule_save_date_and_time_should_be_present() {
	Assert.assertTrue("There is no scheduled date and time shown", draftsPageMethod.isScheduletimeDisplayed());
}

@Then("Saved Expiration time should be present")
public void saved_Expiration_time_should_be_present() {

    Assert.assertTrue("There is no expiration message is shown", draftsPageMethod.isExpirationTImeDisplayed()); 
   
}

@Then("VC should be Enabled with notification")
public void vc_should_be_Enabled_with_notification() {
	 Assert.assertTrue("There is no expiration message is shown", draftsPageMethod.isVCDisplayed()); 
}

@Then("D2I should be enbled with notification")
public void d2i_should_be_enbled_with_notification() {
	 Assert.assertTrue("There is no expiration message is shown", draftsPageMethod.isD2IDisplayed()); 
}

@Then("On Click on Font Type a dropdown font type should be selected")
public void on_Click_on_Font_Type_a_dropdown_font_type_should_be_selected() {
	 draftsPageMethod.ClickTextFormat();
	 draftsPageMethod.clickFontTypeIcon();
	    Assert.assertTrue("Font type is not selected after clicking the font type icon", draftsPageMethod.isFontTypeSelected());
	
}

@Then("On Click on Font Size a dropdown font size should be selected")
public void on_Click_on_Font_Size_a_dropdown_font_size_should_be_selected() {
	 draftsPageMethod.ClickTextFormat();
	 draftsPageMethod.OpenChnageFont();
	 Assert.assertTrue("Font type is not selected after clicking the font type icon", draftsPageMethod.isFontSizeChanged());
}


@Then("Link should be present")
public void link_should_be_present() {
	 Assert.assertTrue("Font type is not selected after clicking the font type icon", draftsPageMethod.isLinkPresent());
}

@When("the user enters another recipient")
public void the_user_enters_another_recipient() throws InterruptedException {
   draftsPageMethod.EnteranotherRecipient();
}

@When("Edit Subject")
public void edit_Subject() throws InterruptedException {
	draftsPageMethod.ChangeSubject();
}

@When("Edit Body")
public void edit_Body() {
	draftsPageMethod.ChangeBody();
}

@When("On click on cancel schedule date and time it should get removed")
public void on_click_on_cancel_schedule_date_and_time_it_should_get_removed() {
	draftsPageMethod.CancelScheduleDandT();
}


@When("User clicks on collapse icon draft list should get collpase or expand")
public void user_clicks_on_collapse_icon_draft_list_should_get_collpase_or_expand() {
	draftsPageMethod.CollapseExpandDraftList();
}

@Then("Scroll page to Bottom")
public void scroll_page_to_Bottom() {
	draftsPageMethod.SCrollDraftList();
}


@When("On click on Spam icon it should show validation message")
public void on_click_on_Spam_icon_it_should_show_validation_message() {
	draftsPageMethod.ClickSpam();
	
	String validationMessage = draftsPageMethod.isValidationMessageVisible();
	
	Assert.assertEquals("Validation messge is not same", "Not allowed from Drafts", validationMessage);

}

@Then("Select Move to inbox")
public void select_Move_to_inbox() {
	draftsPageMethod.clickMoveToInbox();
}

@When("User click on dropdown icon in draft list")
public void user_click_on_dropdown_icon_in_draft_list() {
	draftsPageMethod.clickDropDown();
}

@Then("Click on dropdown icon again in draft list")
public void click_on_dropdown_icon_again_in_draft_list() {
	draftsPageMethod.clickDropDown();
}




}
