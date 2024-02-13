package stepDefination;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPageMethods;

public class landingPageSteps {
	
	LandingPageMethods landingPageMethods= new LandingPageMethods();

	

	@Given("the user is on the Landing screen")
	public void the_user_is_on_the_Landing_screen() {
		Assert.assertTrue(landingPageMethods.isLogoVisible(), "Logo is not visible");
	    
	}

	@When("they click on the Blinkly logo at the top right corner")
	public void they_click_on_the_Blinkly_logo_at_the_top_right_corner() {
		landingPageMethods.BlinklyLogoClick();
	}


	@Then("the screen should refresh")
	public void the_screen_should_refresh() {
		Assert.assertTrue(landingPageMethods.isLogoVisible(), "Logo is not visible");
	}

	@Given("the default theme should be light mode")
	public void the_default_theme_should_be_light_mode()  {
	    Assert.assertTrue(landingPageMethods.isLightmodeVisible(), "Default theme is not light mode");
	}

	@When("the user clicks on the dark mode icon")
	public void the_user_clicks_on_the_dark_mode_icon() {
	    landingPageMethods.clickOnDarkModeIcon();
	}

	@Then("the page should switch to dark mode")
	public void the_page_should_switch_to_dark_mode() {
		Assert.assertTrue(landingPageMethods.isDarkModeSelected(), "Page did not switch to dark mode");
	}

	@When("the user clicks on the light mode icon")
	public void the_user_clicks_on_the_light_mode_icon() {
		landingPageMethods.clickOnLightModeIcon();
	}

	@Then("the page should switch to light mode")
	public void the_page_should_switch_to_light_mode(){
		Assert.assertTrue(landingPageMethods.isLightModeSelected(), "Page did not switch to light mode");
	}

	@When("they click on the Access button")
	public void they_click_on_the_Access_button() {
		landingPageMethods.clickOnAccessButton();
	}


@Then("they should be redirected to the login screen")
public void they_should_be_redirected_to_the_login_screen() {
		 Assert.assertTrue(landingPageMethods.isLoginPageDisplayed(), "Not redirected to login screen");
	}
	

}
