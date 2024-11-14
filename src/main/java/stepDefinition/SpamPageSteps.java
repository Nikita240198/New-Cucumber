package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SpamPageMethods;


public class SpamPageSteps {
	
	SpamPageMethods spamMailPageMethod = new SpamPageMethods();  
	
	@When("user click on Spam")
	public void user_click_on_Spam() {
		spamMailPageMethod.clickSpam();
	}

	@Then("it should show all mails if user sent any mails otherwise shows message")
	public void it_should_show_all_mails_if_user_sent_any_mails_otherwise_shows_message() {
		
			if(spamMailPageMethod.IsMailPresent()) {
				Assert.assertTrue("There are no messages to read" ,spamMailPageMethod.getMessageElement());
			
		            System.out.println("Messages are present.");
			}
			else {
				  System.out.println("There are no messages to read.");
			}
		}
	
	@When("On Hover it should show tooltip with message to move in inox")
	public void on_Hover_it_should_show_tooltip_with_message_to_move_in_inox() {
		
		Assert.assertTrue("Tooltip message is not displayed as expected",spamMailPageMethod.HoverSpam("Move to inbox"));
	}

	
	@When("user select Report spam after right click it should show confirmation popup")
	public void user_select_Report_spam_after_right_click_it_should_show_confirmation_popup() {
		spamMailPageMethod.clickReportSpamFromRightClick();
		
		Assert.assertTrue("Tooltip message is not same", spamMailPageMethod.isConfirmationPopupComes());
		
		
	}
	

	@Then("On click on Inbox It should navigate to emails page")
	public void on_click_on_Inbox_It_should_navigate_to_emails_page() {
	   spamMailPageMethod.clickInbox();
	   
	   Assert.assertTrue("Tooltip message is not same", spamMailPageMethod.isinboxPresent());
	}
	
	@When("user select Move to inbox after right click it should show confirmation popup")
	public void user_select_Move_to_inbox_after_right_click_it_should_show_confirmation_popup() {
	    spamMailPageMethod.clickMoveToInbox();
	}
	
	
	}

