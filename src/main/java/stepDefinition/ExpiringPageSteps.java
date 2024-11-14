package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ExpiringPageMethods;

public class ExpiringPageSteps {

	ExpiringPageMethods expiryPage = new ExpiringPageMethods();

	@When("User Click on Expiring Tab it should navigate to expiring Page")
	public void user_Click_on_Expiring_Tab_it_should_navigate_to_expiring_Page() {
		expiryPage.clickExpiring();
	}

	@Then("Verify if there is no mail or mail in list")
	public void verify_if_there_is_no_mail_or_mail_in_list() {
		if (expiryPage.IsMailPresent()) {

			Assert.assertTrue("There are no mail", expiryPage.getMessageElement());

			System.out.println("Messages are present.");
		} else {
			String actualTooltipMessage = expiryPage.getNoMailnMessage();
			Assert.assertEquals("There is no message on Page", "There are no messages to read", actualTooltipMessage);
		}
	}

	@Then("If mail is present it should show Timer and icon")
	public void if_mail_is_present_it_should_show_Timer_and_icon() {
		Assert.assertTrue("There are no mail", expiryPage.isIconPresent());
		Assert.assertTrue("There are no mail", expiryPage.isTimerPresent());
	}

	@Then("Timer and mail content should be present in Third Pane")
	public void timer_and_mail_content_should_be_present_in_Third_Pane() {
		expiryPage.isTimerPresentinThirdPane();
		expiryPage.isConetentPresent();
		expiryPage.isReplyButtonPresent();
	}

	@Then("it should not let user to move Expiring mail to spam")
	public void it_should_not_let_user_to_move_Expiring_mail_to_spam() {
		String actualErrorMessage = expiryPage.getExpiryErrorMessage();
		Assert.assertEquals("Error message for expiring is not as expected", "Not allowed from expiring",
				actualErrorMessage);
	}

}
