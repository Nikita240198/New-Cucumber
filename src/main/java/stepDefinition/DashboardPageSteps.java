package stepDefinition;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPageMethods;
import pages.LandingPageMethods;
import pages.LoginPageMethods;

public class DashboardPageSteps {
	
	DashboardPageMethods dashboardpagemethods = new DashboardPageMethods();

	@Then("On  Dashboard screen should get open with All selected")
	public void on_Dashboard_screen_should_get_open_with_All_selected() {
		Assert.assertTrue("Error message popup does npt appear", dashboardpagemethods.isAllSelected());

	}

	@Then("It should display Both email and chats in email list")
	public void it_should_display_Both_email_and_chats_in_email_list() {
		Assert.assertTrue("Error message popup does npt appear", dashboardpagemethods.isEmailVisible());
		Assert.assertTrue("Error message popup does npt appear", dashboardpagemethods.isChatVisible());
	}

	@When("User click on first tile or any tile it should get open in Third Pane")
	public void user_click_on_first_tile_or_any_tile_it_should_get_open_in_Third_Pane() {
		dashboardpagemethods.ClickOnFirstTile();
	}
	
	@When("user click on First mail mail should get open")
	public void user_click_on_First_mail_mail_should_get_open() {
	  dashboardpagemethods.OpenFirstmails();
	  Assert.assertTrue("mail is not opened", dashboardpagemethods.isMailOpen());
	}


	@When("On click on checkbox mail it should select mail")
	public void on_click_on_checkbox_mail_it_should_select_mail() {
		dashboardpagemethods.Selectmail();
	}

	@When("On Hover it should show tooltip with message")
	public void on_Hover_it_should_show_tooltip_with_message() {
		Assert.assertTrue("Tooltip message is not displayed as expected",
                dashboardpagemethods.HoverSpam("Report spam"));
	}

	@When("On click on Spam icon it should open a Popup with confirmation messgae")
	public void on_click_on_Spam_icon_it_should_open_a_Popup_with_confirmation_messgae() {
		dashboardpagemethods.ClickSpam();
		Assert.assertTrue("Tooltip message is not same", dashboardpagemethods.isConfirmationPopupComes());
	}

	@Then("On click on Ok the mail should move to spam")
	public void on_click_on_Ok_the_mail_should_move_to_spam() throws InterruptedException {
		dashboardpagemethods.SendSpam();
		
		Assert.assertTrue("Mail does not moved to spam", dashboardpagemethods.isSnackbarForInbox());
	}

	@Then("On click on Cancel the mail should not move to spam")
	public void on_click_on_Cancel_the_mail_should_not_move_to_spam() {
		dashboardpagemethods.NoSendSpam();
	}

	@When("On Hover it should show tooltip with message for Delete")
	public void on_Hover_it_should_show_tooltip_with_message_for_Delete() {
		dashboardpagemethods.HoverDelete();
	    String actualTooltipMessage = dashboardpagemethods.getTooltipMessage();
	    Assert.assertEquals("Tooltip message for delete is not as expected", "Delete", actualTooltipMessage);
	}

	@When("On click on Delete icon it should open a Popup with confirmation messgae")
	public void on_click_on_Delete_icon_it_should_open_a_Popup_with_confirmation_messgae() {
		
		dashboardpagemethods.ClickDelete();
		Assert.assertTrue("popup is not there", dashboardpagemethods.isConfirmationPopupComesforDelete());

	}

	@Then("On click on Ok the mail should get Delete")
	public void on_click_on_Ok_the_mail_should_get_Delete() {
		dashboardpagemethods.DeleteMail();
	}

	@Then("On clikc on Cancel the mail should not get Deleted")
	public void on_clikc_on_Cancel_the_mail_should_not_get_Deleted() {
		dashboardpagemethods.CancelDelete();
	}

	@When("On Hover it should show tooltip with message for mark as read\\/unread")
	public void on_Hover_it_should_show_tooltip_with_message_for_mark_as_read_unread() {
		dashboardpagemethods.HoverMarkAsRead();
		String tooltipMessage = dashboardpagemethods.isMailboxShowsMessage();
		assertTooltipMessage(tooltipMessage);
	}

	private void assertTooltipMessage(String tooltipMessage) {
		// Check if the message is correct based on whether the mail is read or unread
		if (tooltipMessage.contains("read")) {
			Assert.assertEquals("Tooltip message should contain 'mark as unread'", "mark as unread", tooltipMessage);
		} else if (tooltipMessage.contains("unread")) {
			Assert.assertEquals("Tooltip message should contain 'mark as read'", "mark as read", tooltipMessage);
		}
	}

	@When("On click On Mailbox icon The email shoudld mark as read or unread")
	public void on_click_On_Mailbox_icon_The_email_shoudld_mark_as_read_or_unread() {
		dashboardpagemethods.ClickMailAsread();
	}

	@When("On Hover it should show tooltip with message for Add Lable")
	public void on_Hover_it_should_show_tooltip_with_message_for_Add_Lable() {
	Assert.assertTrue("Tooltip message is not displayed as expected",
                  dashboardpagemethods.hoverAndCheckTooltipLable("Labels"));
	}

	@When("On click On Add Lable it should open popup")
	public void on_click_On_Add_Lable_it_should_open_popup() {
		Assert.assertTrue("Popup is not getting open",dashboardpagemethods.OpenAddlable());
	}

	@Then("Click on Apply Lable")
	public void Click_on_Apply_Lable() {
		dashboardpagemethods.ClickApplyOnly();
	}
	

	@Then("It should show validation message")
	public void it_should_show_validation_message() {
		boolean validationMessage = dashboardpagemethods.isValidationForLabelVisible();
		Assert.assertEquals("Tooltip message should contain", "select at least one lable to apply ", validationMessage);
	}

	
	@When("create new label")
	public void create_new_label() throws InterruptedException {
		dashboardpagemethods.scrollToBottom();
		dashboardpagemethods.CreateNewLabel();
	}


	@When("Select label From List")
	public void select_label_From_List() {
		dashboardpagemethods.selectlabelfromList();
	}
	
	
	@Then("Close the Popup")
	public void close_the_Popup() {
		dashboardpagemethods.closePopup();
	}

	
	@When("user select global chekbox all mail shoul get selected")
	public void user_select_global_chekbox_all_mail_shoul_get_selected() {
		dashboardpagemethods.SelectGlobalCheckbox();
	}

	
	@When("User Hover on email tile it should show Delete icon and On click on Delete icon it should open a Popup with confirmation messgae")
	public void user_Hover_on_email_tile_it_should_show_Delete_icon_and_On_click_on_Delete_icon_it_should_open_a_Popup_with_confirmation_messgae() {
		Assert.assertTrue("Popup is not getting open",dashboardpagemethods.DeleteFromHover());
	}	
	
	
	@When("User Hover on email tile it should show Mail icon and On click on mail icon mail should mark as read or unread")
	public void user_Hover_on_email_tile_it_should_show_Mail_icon_and_On_click_on_mail_icon_mail_should_mark_as_read_or_unread() {
		dashboardpagemethods.MarkAsReadFromHover();
	}
	
	@When("user Click on first tile it should Open mail or message")
	public void user_Click_on_first_tile_it_should_Open_mail_or_message() {
		Assert.assertTrue("Subject message is not displayed as expected",
                dashboardpagemethods.OpenMail());
	}
	
	@When("On Hover it should show Tooltip Expand or Collapseand on Click it should expand mail or collapse mail")
	public void on_Hover_it_should_show_Tooltip_Expand_or_Collapseand_on_Click_it_should_expand_mail_or_collapse_mail() {
dashboardpagemethods.HoverExpandmail();
		
		String tooltipMessage = dashboardpagemethods.Expandmailmessage();
		assertTooltipMessage(tooltipMessage);
		
		dashboardpagemethods.ClickExpand();
	}


	private void ExpandMessage(String tooltipMessage) { 
		// Check if the message is correct based on whether the mail is read or unread
		if (tooltipMessage.contains("Collapse all")) {
			Assert.assertEquals("Tooltip message should contain 'Expand all'", "Expand all", tooltipMessage);
		} else if (tooltipMessage.contains("Expand all")) {
			Assert.assertEquals("Tooltip message should contain 'Collapse all'", "Collapse all", tooltipMessage);
		}
		
		dashboardpagemethods.ClickExpand();
		
		
	}
	@When("On Hover it should show Tooltip Print on Click it should open new page")
	public void on_Hover_it_should_show_Tooltip_Print_on_Click_it_should_open_new_page() {
		Assert.assertTrue("Tooltip message is not displayed as expected",
                dashboardpagemethods.HoverPrint("Print"));
		dashboardpagemethods.ClickonPrint();
		Assert.assertTrue("A new window did not open as expected",
				 dashboardpagemethods.isWindowOpened());
		
	}

	@When("On Hover it should show Tooltip NewWindow")
	public void on_Hover_it_should_show_Tooltip_NewWindow_on_Click_it_should_open_new_page() {
		Assert.assertTrue("Tooltip message is not displayed as expected",
                dashboardpagemethods.HoverNewWindow("In new window"));
		
//		dashboardpagemethods.ClickonNewwindow();
//		 Assert.assertTrue("A new window did not open as expected",
//				 dashboardpagemethods.isWindowOpened());
		 
	}

	@When("Search Label")
	public void search_Label() throws InterruptedException {
		dashboardpagemethods.SearchLable(); 
	}

	@When("On Hover it should show Tooltip Ellipses on Click it should open popup")
	public void on_Hover_it_should_show_Tooltip_Ellipses_on_Click_it_should_open_popup() {
		Assert.assertTrue("Tooltip message is not displayed as expected",
                dashboardpagemethods.OpenEllipses("More"));
		dashboardpagemethods.ClickEllipses();
		
	}

	@When("Click Report Spam")
	public void click_Report_Spam() {
		dashboardpagemethods.ClickSpaminEllipses();
		
	}

	@When("On Click Delete")
	public void on_Click_Delete() {
		dashboardpagemethods.ClickDeleteinEllipses();
		Assert.assertTrue("popup is not there", dashboardpagemethods.isConfirmationPopupComesforDelete());
	}

	
	@When("On Click Mark as read or unread mail should mark as read\\/unread")
	public void on_Click_Mark_as_read_or_unread_mail_should_mark_as_read_unread() {
//		String Message = dashboardpagemethods.gettextkMarkAsReadEllipse();
//		assertTooltipMessage(Message);
//		if (Message.contains("Mark as read")) {
//			Assert.assertEquals("Tooltip message should contain 'Mark as unread'", "Mark as unread", Message);
//		} else if (Message.contains("Mark as unread")) {
//			Assert.assertEquals("Tooltip message should contain 'Mark as read'", "Mark as read", Message);
//		}
//			
		
		dashboardpagemethods.ClikcMarkAsReadEllipses();
		
	}

	@When("Clikc Lables and Add from ellipses")
	public void clikc_Lables_and_Add_from_ellipses() {
		Assert.assertTrue("popup is not there", dashboardpagemethods.AddFromEllipses());	
		dashboardpagemethods.SelectLabelFromEllipse();
	}
	
	@When("user Click on list view it should convert to list view")
	public void user_Click_on_list_view_it_should_convert_to_list_view() {
		dashboardpagemethods.ChangeListView();
	}

	@When("On Click on Reply iocn user should be able to send reply")
	public void on_Click_on_Reply_iocn_user_should_be_able_to_send_reply() {
	
		dashboardpagemethods.clickReplyiCon();
	}
	@When("Scroll page")
	public void scroll_page() {
		dashboardpagemethods.ScrollPage();
	}
	
	@When("if there is no mail in list it should show message")
	public void if_there_is_no_mail_in_list_it_should_show_message() {
		if(dashboardpagemethods.IsMailPresent()) {
			
			Assert.assertTrue("There are no messages to read" ,dashboardpagemethods.getMessageElement());
		
	            System.out.println("Messages are present.");
		}
		else {
			  System.out.println("There are no messages to read.");
		}
	}
	
	@When("On Hover on second ellipses it should show Tooltip on Click it should open popup")
	public void and_On_Hover_on_second_ellipses_it_should_show_Tooltip_on_Click_it_should_open_popup() {
		dashboardpagemethods.SpamFromSecondEliiplse();
		
	}
	
	@When("on Click on report spam")
	public void on_Click_on_report_spam() {
		dashboardpagemethods.ClikcReportSpamSecondEllipse();
	}

	
	@Then("On click on print It should open Popup")
	public void on_click_on_print_It_should_open_Popup() {
		dashboardpagemethods.ClikcPrintSecondEllipse();
	}
	
	@Then("On click on Original It should open save Popup")
	public void on_click_on_Original_It_should_open_save_Popup() throws AWTException {
		dashboardpagemethods.ClickOnOriginal();
	}
	
	@When("On click on Delete It should Confirmation popup")
	public void on_click_on_Delete_It_should_Confirmation_popup() {
		dashboardpagemethods.deleteFromSecondEllipsis();
		Assert.assertTrue("popup is not there", dashboardpagemethods.isConfirmationPopupComesforDelete());
		
	}

	@When("user right click on any Mail")
	public void user_right_click_on_any_Mail() throws InterruptedException {
		dashboardpagemethods.GetFirstMailOnRightClick();
		dashboardpagemethods.waitUntilPopupIsVisible();
	}

	@When("It should show popup with all options present")
	public void it_should_show_popup_with_all_options_present() {
		Assert.assertTrue("popup is not there", dashboardpagemethods.isPopUpVisible());
		
	}


	
	@When("user select Report spam")
	public void user_select_Report_spam() {
		dashboardpagemethods.SendTospamFromRightClick();
	}

	@When("after right click it should show confirmation popup")
	public void after_right_click_it_should_show_confirmation_popup() {
		Assert.assertTrue("popup is not there", dashboardpagemethods.isConfirmationPopupComes());
	}

	@When("Click on Delete After rightClick it should open a Popup with confirmation messgae")
	public void click_on_Delete_After_rightClick_it_should_open_a_Popup_with_confirmation_messgae() {
		dashboardpagemethods.DeleteAfterRightClick();
		Assert.assertTrue("popup is not there", dashboardpagemethods.isConfirmationPopupComesforDelete());
	}
	
	@Then("on Clikc on Mark as read mail should mark as read")
	public void on_Clikc_on_Mark_as_read_mail_should_mark_as_read() {
		dashboardpagemethods.MarkAsReadAfterRightClick();
	}
	
	@When("User Select Add label after right click and it should open popup")
	public void user_Select_Add_label_after_right_click_and_it_should_open_popup() {
		dashboardpagemethods.SelectLabelFroRightClick();
		Assert.assertTrue("Popup is not getting open",dashboardpagemethods.isLablepopupvisible());
	}
	
	@When("Enter another Recipient")
	public void enter_another_Recipient() throws InterruptedException {
		dashboardpagemethods.AddAnotherRecipient();
	}


	@When("On Click on Reply button")
	public void on_Click_on_Reply_button() {
	  dashboardpagemethods.ClickReplyButton();
	}

	
	@When("On Click on Forward icon")
	public void on_Click_on_Forward_icon() {
	   dashboardpagemethods.ClickForwardIcon();
	}
	
	
	@When("On Click on Forward button")
	public void on_Click_on_Forward_button() {
		 dashboardpagemethods.ClickForwardButton();
	}
	
	


}
