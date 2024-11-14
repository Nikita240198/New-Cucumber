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

	@When("Click on Sign in button")
	public void click_on_Sign_in_button(){
	   loginPageMethods.ClickOnSignIn();
	}

	@Then("a validation message should be displayed")
	public void a_validation_message_should_be_displayed() {
	    Assert.assertTrue("validation message does not appear",loginPageMethods.isValidationMessageAppear());
	    
	}

	@When("the user clicks in the username field and it is empty")
	public void the_user_clicks_in_the_username_field_and_it_is_empty() throws InterruptedException {
		loginPageMethods.ClickOnSignIn();
	}


	@When("the user enters only spaces in the username field")
	public void the_user_enters_only_spaces_in_the_username_field() throws InterruptedException {
		loginPageMethods.EnterSpaceUsername();
	}
	

	@When("the user enters an invalid password")
	public void the_user_enters_an_invalid_password() throws InterruptedException {
		loginPageMethods.EnterInValidPassword();
		
	}


	@When("the user clicks and the password field is empty")
	public void the_user_clicks_and_the_password_field_is_empty() throws InterruptedException {

		loginPageMethods.EmptyPassword();
	}


	@When("the user enters only spaces in the password field")
	public void the_user_enters_only_spaces_in_the_password_field() throws InterruptedException {
		loginPageMethods.EnterSpacePassword();
	}


	@When("the user enters valid Username")
	public void the_user_enters_valid_Username() throws InterruptedException {
		loginPageMethods.ValidUserName();
	}

	@When("user enters vaild Password")
	public void user_enters_vaild_Password() throws InterruptedException {
		loginPageMethods.ValidPassword();
	}
	
	@When("user should be able to view password")
	public void user_should_be_able_to_view_password() throws InterruptedException {
		loginPageMethods.EnabledPassword();
	}
	
	@When("password is getting disabled or not")
	public void password_is_getting_disabled_or_not() throws InterruptedException {
		loginPageMethods.DisablePassword();
	}
	
	@When("the user slides the slider to the given number")
	public void the_user_slides_the_slider_to_the_given_number() throws InterruptedException {
		loginPageMethods.MoveSlider();
	}


	@Then("user should login Successfully and navigate to Dashboard Screen")
	public void user_should_login_Successfully_and_navigate_to_Dashboard_Screen() {
		  Assert.assertTrue("Dashboard is not vidsible",loginPageMethods.isComposeButtonVisible());
		
		  
	}

	@Then("user selects incorrect slider value")
	public void user_selects_incorrect_slider_value() {
		loginPageMethods.MoveSliderRandomly();
	}

	
}
