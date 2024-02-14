package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPageMethods;
import pages.LoginPageMethods;

public class loginPageSteps {
	LoginPageMethods loginPageMethods= new LoginPageMethods();
	LandingPageMethods landingPageMethods= new LandingPageMethods();
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() throws InterruptedException {
		landingPageMethods.clickOnAccessButton();
		
	}

	@When("the user enters an incorrect email ID in the username field")
	public void the_user_enters_an_incorrect_email_ID_in_the_username_field() throws InterruptedException {
		loginPageMethods.EnterInValidUserName();
	}

	@When("Click on Sign in Button")
	public void click_on_Sign_in_Button() throws InterruptedException {
	   loginPageMethods.ClickOnSignIn();
	}

	@Then("a validation message should be displayed indicating that the email ID is incorrect")
	public void a_validation_message_should_be_displayed_indicating_that_the_email_ID_is_incorrect() {
	    Assert.assertTrue("validation message does not appear",loginPageMethods.isValidationMessageAppear());
	}

	@When("the user clicks backspace in the username field until it's empty")
	public void the_user_clicks_backspace_in_the_username_field_until_it_s_empty() throws InterruptedException {
		loginPageMethods.FnameBackspace();
		loginPageMethods.ClickOnSignIn();
	}

	@Then("a validation message for empty username should be displayed")
	public void a_validation_message_for_empty_username_should_be_displayed() {
		 Assert.assertTrue("validation message does not appear",loginPageMethods.isValidationMessageAppear());
	}

	@When("the user enters only spaces in the username field")
	public void the_user_enters_only_spaces_in_the_username_field() throws InterruptedException {
		loginPageMethods.EnterSpaceUsername();
		loginPageMethods.ClickOnSignIn();
	}
	
	@Then("a validation message for Spaces in  username should be displayed")
	public void a_validation_message_for_spaces_in_username_Field() {
		Assert.assertTrue("validation message does not appear",loginPageMethods.isValidationMessageAppear());
	}


	@When("the user enters an invalid password")
	public void the_user_enters_an_invalid_password() throws InterruptedException {
		loginPageMethods.EnterInValidPassword();
		loginPageMethods.ClickOnSignIn();
	}

	@Then("a validation message for invalid password should be displayed")
	public void a_validation_message_for_invalid_password_should_be_displayed() {
		Assert.assertTrue("validation message does not appear",loginPageMethods.isValidationMessageAppear());
	}

	@When("the user clicks backspace in the password field until it's empty")
	public void the_user_clicks_backspace_in_the_password_field_until_it_s_empty() throws InterruptedException {
		loginPageMethods.PasswordBackSpace();
		loginPageMethods.ClickOnSignIn();
	}

	@Then("a validation message for empty password should be displayed")
	public void a_validation_message_for_empty_password_should_be_displayed() {
		Assert.assertTrue("validation message does not appear",loginPageMethods.isValidationMessageAppear());
	}

	@When("the user enters only spaces in the password field")
	public void the_user_enters_only_spaces_in_the_password_field() throws InterruptedException {
		loginPageMethods.EnterSpacePassword();
		loginPageMethods.ClickOnSignIn();
	}

	@Then("a validation message for password with only spaces should be displayed")
	public void a_validation_message_for_password_with_only_spaces_should_be_displayed() {
		Assert.assertTrue("validation message does not appear",loginPageMethods.isValidationMessageAppear());
	}

	@When("the user enters valid Username")
	public void the_user_enters_valid_Username() throws InterruptedException {
		loginPageMethods.ValidUserName();
	}

	@When("user enters vaild Password")
	public void user_enters_vaild_Password() throws InterruptedException {
		loginPageMethods.ValidPassword();
		loginPageMethods.ClickOnSignIn();
	}
}
