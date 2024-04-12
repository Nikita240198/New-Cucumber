package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ComposePageMethods;
import pages.LandingPageMethods;
import pages.LoginPageMethods;

public class ComposePageSteps {
	LoginPageMethods loginPageMethods= new LoginPageMethods();
	LandingPageMethods landingPageMethods= new LandingPageMethods();
	ComposePageMethods composePageMethods = new ComposePageMethods();
	
	
	@Given("the user is logged in")
	public void the_user_is_logged_in() throws InterruptedException {
		landingPageMethods.clickOnAccessButton();
		loginPageMethods.ValidUserName();
		loginPageMethods.ValidPassword();
		loginPageMethods.MoveSlider();
		loginPageMethods.ClickOnSignIn();
	}

	@When("the user clicks on the Compose Email button")
	public void the_user_clicks_on_the_Compose_Email_button() {
		composePageMethods.OpenCompose();
	}

	@Then("the email compose editor should open")
	public void the_email_compose_editor_should_open() {
		Assert.assertTrue("Compose is not getting open", composePageMethods.isComposeOpen());
	}

	@When("the user clicks on the Send button without entering any content")
	public void the_user_clicks_on_the_Send_button_without_entering_any_content() {
	   composePageMethods.ClickOnSend();
	}

	@Then("an alert popup should be displayed")
	public void an_alert_popup_should_be_displayed() {
	    Assert.assertTrue("Error message popup does npt appear", composePageMethods.isErrorPopupAppear());
	}

	@When("the user clicks on the OK button")
	public void the_user_clicks_on_the_OK_button() {
		composePageMethods.CloseErrorPopup();
	}

	@Then("the alert popup should be closed")
	public void the_alert_popup_should_be_closed() {
		Assert.assertTrue("Compose is not getting open", composePageMethods.isComposeOpen());
	}

	@When("the user clicks anywhere outside the popup")
	public void the_user_clicks_anywhere_outside_the_popup() {
		composePageMethods.ClickOutsidePopup();
	}

	@When("the user enters an email address in the To field")
	public void the_user_enters_an_email_address_in_the_To_field() throws InterruptedException {
		composePageMethods.EnterRecipient();
		//composePageMethods.PressEnter();
	}


	@When("the user enters few letters of email address in the To field")
	public void the_user_enters_few_letters_of_email_address_in_the_To_field() throws InterruptedException {
		composePageMethods.AutoSuggestion();
		composePageMethods.PressEnter();
	}

	@Then("the autosuggestion should work")
	public void the_autosuggestion_should_work() {
		  Assert.assertTrue("Autosuggetion did not worked ", composePageMethods.isRecipientDispaly());
	}

	@When("the user clicks on the backspace key")
	public void the_user_clicks_on_the_backspace_key() {
		composePageMethods.Clickbackspace();
	}
	
	@Then("On click on Enter email id should get enter")
	public void on_click_on_Enter_email_id_should_get_enter() {
		//  Assert.assertTrue("Autosuggetion did not worked ", composePageMethods.isRecipientDispaly());
		composePageMethods.PressEnter();
	}


	@Then("the email address should be removed")
	public void the_email_address_should_be_removed() {
		composePageMethods.isEmailidgetsremoved();
	}

	@When("the user double clicks on the email address")
	public void the_user_double_clicks_on_the_email_address() throws InterruptedException {
		composePageMethods.DoubleClickEmail();
	}

	@Then("the email address should be editable")
	public void the_email_address_should_be_editable() throws InterruptedException {
		composePageMethods.Clickbackspace();
		composePageMethods.EditEmail1();
	}

	@When("the user clicks on the Cancel button")
	public void the_user_clicks_on_the_Cancel_button() {
		composePageMethods.CancelMail();
	}
	
	@When("the user clicks on the CC field")
	public void the_user_clicks_on_the_CC_field() {
		composePageMethods.OpenCC();
	}

	@Then("the CC field should open for input")
	public void the_CC_field_should_open_for_input() {
		composePageMethods.isCCfieldEnabled();
	}

	@When("the user enters an email address in the CC field")
	public void the_user_enters_an_email_address_in_the_CC_field() throws InterruptedException {
		composePageMethods.EnterCc();
		composePageMethods.PressEnter();
	}

	@When("the user clicks on backspace after entering an email address in the CC field")
	public void the_user_clicks_on_backspace_after_entering_an_email_address_in_the_CC_field() {
		composePageMethods.ClickBackinCc();
	}

	@When("the user enters few letters of email address in the Cc field")
	public void the_user_enters_few_letters_of_email_address_in_the_Cc_field() throws InterruptedException {
		composePageMethods.CcAutosuggetion();
	}


	@Then("the email address should be removed from the CC field")
	public void the_email_address_should_be_removed_from_the_CC_field() {
		composePageMethods.isCCfieldRemoved();
	}

	@When("the user double clicks on an email address in the CC field")
	public void the_user_double_clicks_on_an_email_address_in_the_CC_field() throws InterruptedException {
		composePageMethods.DoubleClickEmail();
	}

	@Then("the email address should become editable")
	public void the_email_address_should_become_editable() throws InterruptedException {
		composePageMethods. ClickBackinCc();
		composePageMethods.EditCcEmail();
		composePageMethods.PressEnter();
	}

	@When("the user clicks on the Bcc field")
	public void the_user_clicks_on_the_Bcc_field() {
		composePageMethods.OpenBcc();
	}

	@Then("the Bcc field should open for input")
	public void the_Bcc_field_should_open_for_input() {
		Assert.assertTrue("Bcc field does not get open", composePageMethods.isBccFieldEnabled());
	}

	@When("the user enters an email address in the Bcc field")
	public void the_user_enters_an_email_address_in_the_Bcc_field() throws InterruptedException {
		composePageMethods.EnterBcc();
	}

	@Then("the user clicks on backspace after entering an email address in the Bcc field")
	public void the_user_clicks_on_backspace_after_entering_an_email_address_in_the_Bcc_field() {
		composePageMethods.ClickBackinBcc();
	}

	@When("the user enters few letters of email address in the Bcc field")
	public void the_user_enters_few_letters_of_email_address_in_the_Bcc_field() throws InterruptedException {
		composePageMethods.BccAutosuggestion();
	}

	@Then("the email address should be removed from the Bcc field")
	public void the_email_address_should_be_removed_from_the_Bcc_field() {
		Assert.assertTrue("Bcc field does not get open", composePageMethods.isBccFieldRemoved());

	}

	@When("the user double clicks on an email address in the Bcc field")
	public void the_user_double_clicks_on_an_email_address_in_the_Bcc_field() {
		composePageMethods.BccDoubleClick();
	}
	
	
	@Then("the Bccemail address should become editable")
	public void the_Bccemail_address_should_become_editable() throws InterruptedException {
		composePageMethods. ClickBackinBcc();
		composePageMethods.EditBccEmail();
		composePageMethods.PressEnter();
	}
	
	@Then("Veify Placeholder of subject field")
	public void veify_Placeholder_of_subject_field() {
		 Assert.assertEquals("Place holder of Subject field is incorrect", "Subject",composePageMethods.getSubjectPlaceholder()); 
	}

	@When("Enter the subject")
	public void enter_the_subject()  throws InterruptedException {
		composePageMethods.EnterSubject();
	}

	@When("Enter the Body")
	public void enter_the_Body() throws InterruptedException {
		composePageMethods.Enterbody();
	}

	@When("Verify on Hover it should show tooltip for Schedule send")
	public void verify_on_Hover_it_should_show_tooltip_for_Schedule_send() {
		composePageMethods.HoverScheduleSend();
	}

	@When("Verify schedule send dropdown gets open on click")
	public void verify_schedule_send_dropdown_gets_open_on_click() {
		composePageMethods.OpenSechduleSend();
	}

	@When("Open date picker")
	public void open_date_picker() {
	Assert.assertTrue("Date picker is not getting opened", composePageMethods.isDatePickerOpen());
	}

	@Then("the current date should be displayed in the date picker")
	public void the_current_date_should_be_displayed_in_the_date_picker() {
	Assert.assertTrue("Date picker is not getting opened", composePageMethods.isDatePickerOpen());

	}

	@Then("the user should be able to select the current date")
	public void the_user_should_be_able_to_select_the_current_date() {
		composePageMethods.ClickonSaveOnScheduleSend();
	}

	@Then("the user should be able to select any future date from the date picker")
	public void the_user_should_be_able_to_select_any_future_date_from_the_date_picker() {
		composePageMethods.OpenCalendar();
		composePageMethods.SelectFutureDate();
	}

	@Then("the user should not be able to select any past date from the date picker")
	public void the_user_should_not_be_able_to_select_any_past_date_from_the_date_picker() {
		composePageMethods.OpenCalendar();
		composePageMethods.SelectPastDate(); 
		
	}

	@Then("clicking outside the date picker should close it")
	public void clicking_outside_the_date_picker_should_close_it() {
		composePageMethods.OpenCalendar();
		composePageMethods.CloseSchedulePopup();
	}
	
	@Then("the current time should be displayed in the date picker")
	public void the_current_time_should_be_displayed_in_the_date_picker() {
		composePageMethods.isTodayTimeisPresent();
	}

	@Then("the user should be able to select the current Date and Time on Save")
	public void the_user_should_be_able_to_select_the_current_Date_and_Time_on_Save() {
		composePageMethods.ClickonSaveOnScheduleSend();
	}
	
	@When("Open Time picker")
	public void open_Time_picker() {
		composePageMethods.OpenTime();
	}

	@Then("the user should be able to select any future Time from the Calendar")
	public void the_user_should_be_able_to_select_any_future_Time_from_the_Calendar() {
		composePageMethods.SelectNextTimeSlot();
	}

	@Then("the user should not be able to select any past Time from the Calendar")
	public void the_user_should_not_be_able_to_select_any_past_Time_from_the_Calendar() {
	    
	}

	
	
	
	
	
	

}
