package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPageMethods;
import pages.EmailsPageMethods;
import pages.LandingPageMethods;
import pages.LoginPageMethods;

public class EmailsPageSteps {

	EmailsPageMethods emailsPageMethod = new EmailsPageMethods();  

	@When("On click on Emails Tab")
	public void on_click_on_Emails_Tab() {
	emailsPageMethod.ClickEmail();
}
	
	@When("On click on Emails Tab it should navigate to emails page")
	public void on_click_on_Emails_Tab_it_should_navigate_to_emails_page() { 
		emailsPageMethod.ClickEmail();
		if(emailsPageMethod.isListVisible()) {
			 Assert.assertTrue("mail is present",emailsPageMethod.isListVisible() );
		}
		else {
			Assert.assertTrue(" message is not same", emailsPageMethod.isMessageVisible());
		}
		
		 Assert.assertTrue("mail is present",emailsPageMethod.isinboxPresent() );
		 
		 Assert.assertTrue("mail is present",emailsPageMethod.isDraftPresent() );
		 Assert.assertTrue("mail is present",emailsPageMethod.isSentMailPresent() );
		 Assert.assertTrue("mail is present",emailsPageMethod.isSpamPresent() );
		 
		
		
	}	
	
	
	
	@Then("On Click On newindow it should navigate to next tab")
	public void on_Click_On_newindow_it_should_navigate_to_next_tab() {
		emailsPageMethod.HandlePrintWindow();
	}

	@When("Load all mail")
	public void load_all_mail() {
		emailsPageMethod.LoadAllmail();
		
		 Assert.assertTrue("mail is present",emailsPageMethod.isListVisible() );
	}
	

}
