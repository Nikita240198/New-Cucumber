package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ComposePageMethods;
import pages.scheduledPageMethods;

public class schedulePageSteps {
	
	scheduledPageMethods schedulePageMethod = new scheduledPageMethods(); 
	
	
	@Then("Schedule mail should get present in list")
	public void schedule_mail_should_get_present_in_list() {
		Assert.assertTrue("There is no scheduled mail present", schedulePageMethod.isScheduleMailListavailable());
		
	}
	
	@Then("On Click first scheduled mail")
	public void on_Click_first_scheduled_mail() {
		schedulePageMethod.clickFirstScheduleMail();
	}
	
	
	@When("Click on Edit it should open Copmose box with prefilled content")
	public void click_on_Edit_it_should_open_Copmose_box_with_prefilled_content() {
		schedulePageMethod.clickEditScheduleMail();	
		Assert.assertTrue("Body is not there for Scheduled mail", schedulePageMethod.isMailConentListavailable());
	}

	
	@When("Click on Edit Saved schedule Date and Time in compose")
	public void click_on_Edit_Saved_schedule_Date_and_Time_in_compose() {
		schedulePageMethod.clickEditInScheduleMailBox();
	}

	@When("user should be able to select any future date from the date picker")
	public void user_should_be_able_to_select_any_future_date_from_the_date_picker() {
		schedulePageMethod.editParticularDate();
	}
	
	@When("Edit Subject of schedule mail")
	public void edit_Subject_of_schedule_mail() throws InterruptedException {
		schedulePageMethod.editSubject();
	}

	@When("Edit Body Content")
	public void edit_Body_Content() throws InterruptedException {
		schedulePageMethod.editBody();
	}

	
	@When("User click on cancel")
	public void user_click_on_cancel() {
	   schedulePageMethod.cancelScheduledDraft();
	}

	@Then("Schedule mail gets removed from scheduled list and gets addded in draft list")
	public void schedule_mail_gets_removed_from_scheduled_list_and_gets_addded_in_draft_list() {
		Assert.assertTrue("mail is not there in draft list", schedulePageMethod.isScheduledGetRemoved());
	}

	@When("User click on dropdown icon")
	public void user_click_on_dropdown_icon() {
		schedulePageMethod.clickDropDown();
	}

	@Then("Click on dropdown icon again")
	public void click_on_dropdown_icon_again() {
		schedulePageMethod.clickDropDown();
	}
	
	@When("User click on detail dropdown icon of schedule mail")
	public void user_click_on_detail_dropdown_icon_of_schedule_mail() {
		schedulePageMethod.clickDetailDropDown();
	}

	@Then("User Click on compose icon should Open Compose")
	public void user_Click_on_compose_icon_should_Open_Compose() {
		schedulePageMethod.openComposeFrom();
		Assert.assertTrue("mail is not there in draft list", schedulePageMethod.isComposeOpen());
	}
	

	@Then("User Copied recipient email address of From user")
	public void user_Copied_recipient_email_address_of_From_user() {
		schedulePageMethod.copyMailFrom();
}
	
	@Then("User Click on compose icon of To then should Open Compose")
	public void user_Click_on_compose_icon_of_To_then_should_Open_Compose() {
		schedulePageMethod.openComposeTo();
		Assert.assertTrue("mail is not there in draft list", schedulePageMethod.isComposeOpen());
	}
	
	
	@Then("User Copied recipient email address of To user")
	public void user_Copied_recipient_email_address_of_To_user() {
		schedulePageMethod.copyMailTo();
	}

	@When("Click on cross icon")
	public void click_on_cross_icon() {
		schedulePageMethod.crossSchedule();
	}

}
