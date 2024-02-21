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
	public void the_user_enters_an_email_address_in_the_To_field() {
	  
	}


	@When("the user enters few letters of email address in the To field")
	public void the_user_enters_few_letters_of_email_address_in_the_To_field() {
	
	}

	@Then("the autosuggestion should work")
	public void the_autosuggestion_should_work() {
	   
	}

	@When("the user clicks on the backspace key")
	public void the_user_clicks_on_the_backspace_key() {
	   
	}


	@Then("the email address should be removed")
	public void the_email_address_should_be_removed() {
	  
	}

	@When("On click on Enter email id should get enter")
	public void on_click_on_Enter_email_id_should_get_enter() {
	    
	}

	@When("the user double clicks on the email address")
	public void the_user_double_clicks_on_the_email_address() {
	  
	}

	@Then("the email address should be editable")
	public void the_email_address_should_be_editable() {
	   
	}

	@When("the user clicks on the Cancel button")
	public void the_user_clicks_on_the_Cancel_button() {
	   
	}

}
