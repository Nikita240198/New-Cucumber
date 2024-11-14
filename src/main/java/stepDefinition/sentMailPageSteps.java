package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SentMailPageMethods;

public class sentMailPageSteps {
	SentMailPageMethods sentMailPageMethod = new SentMailPageMethods();  
	
	@When("user click on Sent")
	public void user_click_on_Sent() {
		sentMailPageMethod.clickSentEmail();
	}

	@Then("it should show all mails sent by user")
	public void it_should_show_all_mails_sent_by_user() {
		Assert.assertTrue("There is no scheduled mail present", sentMailPageMethod.isSentMailListvisble());
	}
	
	@When("On click on Spam icon")
	public void on_click_on_Spam_icon() {
		sentMailPageMethod.clickSpamIcon();
	}

	@Then("it should not let user to move sent mail to spam")
	public void it_should_not_let_user_to_move_sent_mail_to_spam() {
		String actuaSpamErrorMessage = sentMailPageMethod.getSpamErrorMessage();
	    Assert.assertEquals("Error message for delete is not as expected", "Not allowed from Sent Mail", actuaSpamErrorMessage);
	}

	@When("Search Label on Prod")
	public void search_Label_on_Prod() {
	  
	}


}
