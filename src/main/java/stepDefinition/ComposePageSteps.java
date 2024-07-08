package stepDefinition;

import java.awt.AWTException;
import java.util.Arrays;
import java.util.List;

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
	public void the_user_enters_an_email_address_in_the_To_field() throws InterruptedException {
		composePageMethods.EnterRecipient();
		//composePageMethods.PressEnter();
	}


	@When("the user enters few letters of email address in the To field")
	public void the_user_enters_few_letters_of_email_address_in_the_To_field() throws InterruptedException {
		composePageMethods.AutoSuggestion();
		composePageMethods.PressEnter();
	}

	@Then("the autosuggestion should work")
	public void the_autosuggestion_should_work() {
		  Assert.assertTrue("Autosuggetion did not worked ", composePageMethods.isRecipientDispaly());
	}

	@When("the user clicks on the backspace key")
	public void the_user_clicks_on_the_backspace_key() {
		composePageMethods.Clickbackspace();
	}
	
	@Then("On click on Enter email id should get enter")
	public void on_click_on_Enter_email_id_should_get_enter() {
		//  Assert.assertTrue("Autosuggetion did not worked ", composePageMethods.isRecipientDispaly());
		composePageMethods.PressEnter();
	}


	@Then("the email address should be removed")
	public void the_email_address_should_be_removed() {
		composePageMethods.isEmailidgetsremoved();
	}

	@When("the user double clicks on the email address")
	public void the_user_double_clicks_on_the_email_address() throws InterruptedException {
		composePageMethods.DoubleClickEmail();
	}

	@Then("the email address should be editable")
	public void the_email_address_should_be_editable() throws InterruptedException {
		composePageMethods.Clickbackspace();
		composePageMethods.EditEmail1();
	}

	@When("the user clicks on the Cancel button")
	public void the_user_clicks_on_the_Cancel_button() {
		composePageMethods.CancelMail();
	}
	
	@When("the user clicks on the CC field")
	public void the_user_clicks_on_the_CC_field() {
		composePageMethods.OpenCC();
	}

	@Then("the CC field should open for input")
	public void the_CC_field_should_open_for_input() {
		composePageMethods.isCCfieldEnabled();
	}

	@When("the user enters an email address in the CC field")
	public void the_user_enters_an_email_address_in_the_CC_field() throws InterruptedException {
		composePageMethods.EnterCc();
		composePageMethods.PressEnter();
	}

	@When("the user clicks on backspace after entering an email address in the CC field")
	public void the_user_clicks_on_backspace_after_entering_an_email_address_in_the_CC_field() {
		composePageMethods.ClickBackinCc();
	}

	@When("the user enters few letters of email address in the Cc field")
	public void the_user_enters_few_letters_of_email_address_in_the_Cc_field() throws InterruptedException {
		composePageMethods.CcAutosuggetion();
	}


	@Then("the email address should be removed from the CC field")
	public void the_email_address_should_be_removed_from_the_CC_field() {
		composePageMethods.isCCfieldRemoved();
	}

	@When("the user double clicks on an email address in the CC field")
	public void the_user_double_clicks_on_an_email_address_in_the_CC_field() throws InterruptedException {
		composePageMethods.DoubleClickEmail();
	}

	@Then("the email address should become editable")
	public void the_email_address_should_become_editable() throws InterruptedException {
		composePageMethods. ClickBackinCc();
		composePageMethods.EditCcEmail();
		composePageMethods.PressEnter();
	}

	@When("the user clicks on the Bcc field")
	public void the_user_clicks_on_the_Bcc_field() {
		composePageMethods.OpenBcc();
	}

	@Then("the Bcc field should open for input")
	public void the_Bcc_field_should_open_for_input() {
		Assert.assertTrue("Bcc field does not get open", composePageMethods.isBccFieldEnabled());
	}

	@When("the user enters an email address in the Bcc field")
	public void the_user_enters_an_email_address_in_the_Bcc_field() throws InterruptedException {
		composePageMethods.EnterBcc();
	}

	@Then("the user clicks on backspace after entering an email address in the Bcc field")
	public void the_user_clicks_on_backspace_after_entering_an_email_address_in_the_Bcc_field() {
		composePageMethods.ClickBackinBcc();
	}

	@When("the user enters few letters of email address in the Bcc field")
	public void the_user_enters_few_letters_of_email_address_in_the_Bcc_field() throws InterruptedException {
		composePageMethods.BccAutosuggestion();
	}

	@Then("the email address should be removed from the Bcc field")
	public void the_email_address_should_be_removed_from_the_Bcc_field() {
		Assert.assertTrue("Bcc field does not get open", composePageMethods.isBccFieldRemoved());

	}

	@When("the user double clicks on an email address in the Bcc field")
	public void the_user_double_clicks_on_an_email_address_in_the_Bcc_field() {
		composePageMethods.BccDoubleClick();
	}
	
	
	@Then("the Bccemail address should become editable")
	public void the_Bccemail_address_should_become_editable() throws InterruptedException {
		composePageMethods. ClickBackinBcc();
		composePageMethods.EditBccEmail();
		composePageMethods.PressEnter();
	}
	
	@Then("Veify Placeholder of subject field")
	public void veify_Placeholder_of_subject_field() {
		 Assert.assertEquals("Place holder of Subject field is incorrect", "Subject",composePageMethods.getSubjectPlaceholder()); 
	}

	@When("Enter the subject")
	public void enter_the_subject()  throws InterruptedException {
		
		composePageMethods.EnterSubject();
	}

	@When("Enter the Body")
	public void enter_the_Body() throws InterruptedException {
		composePageMethods.Enterbody();
	}

	@When("Verify on Hover it should show tooltip for Schedule send")
	public void verify_on_Hover_it_should_show_tooltip_for_Schedule_send() {
		composePageMethods.HoverScheduleSend();
	}

	@When("Verify schedule send dropdown gets open on click")
	public void verify_schedule_send_dropdown_gets_open_on_click() {
		composePageMethods.OpenSechduleSend();
	}

	@When("Open date picker")
	public void open_date_picker() {
	Assert.assertTrue("Date picker is not getting opened", composePageMethods.isDatePickerOpen());
	}

	@Then("the current date should be displayed in the date picker")
	public void the_current_date_should_be_displayed_in_the_date_picker() {
	Assert.assertTrue("Date picker is not getting opened", composePageMethods.isDatePickerOpen());

	}

//	@Then("the user should be able to select the current date")
//	public void the_user_should_be_able_to_select_the_current_date() {
//		composePageMethods.ClickonSaveOnScheduleSend();
//	}

	@Then("the user should be able to select any future date from the date picker")
	public void the_user_should_be_able_to_select_any_future_date_from_the_date_picker() {
		composePageMethods.OpenCalendar();
		composePageMethods.SelectFutureDate();
	}

	@Then("the user should not be able to select any past date from the date picker")
	public void the_user_should_not_be_able_to_select_any_past_date_from_the_date_picker() {
		composePageMethods.OpenCalendar();
		composePageMethods.SelectPastDate(); 
		
	}

	@Then("clicking outside the date picker should close it")
	public void clicking_outside_the_date_picker_should_close_it() {
		composePageMethods.OpenCalendar();
		composePageMethods.CloseSchedulePopup();
	}
	
	@Then("the current time should be displayed in the date picker")
	public void the_current_time_should_be_displayed_in_the_date_picker() {
		composePageMethods.isTodayTimeisPresent();
	}

	@Then("the user should be able to select the current Date and Time on Save")
	public void the_user_should_be_able_to_select_the_current_Date_and_Time_on_Save() {
		composePageMethods.ClickonSaveOnScheduleSend();
	}
	
	@When("Open Time picker")
	public void open_Time_picker() {
		composePageMethods.OpenTime();
	}

	@Then("the user should be able to select any future Time from the Calendar")
	public void the_user_should_be_able_to_select_any_future_Time_from_the_Calendar() {
		composePageMethods.SelectNextTimeSlot();
	}

	@Then("the user should not be able to select any past Time from the Calendar")
	public void the_user_should_not_be_able_to_select_any_past_Time_from_the_Calendar() {
		composePageMethods.SelectPastTimeSlot();
	}

	
	@Then("clicking outside the Time picker should close it")
	public void clicking_outside_the_Time_picker_should_close_it() {
		composePageMethods.CloseSelectTimePopup();
	}

	
	@Then("On clicking on Cancel the Popup Should get closes")
	public void on_clicking_on_Cancel_the_Popup_Should_get_closes() {
		composePageMethods.CancelScheduleSend();
	}

	@When("the user should be able to Save")
	public void the_user_should_be_able_to_Save() {
		composePageMethods.ClickonSaveOnScheduleSend();
	}

	@Then("On save The time and date should get display on Compose Box")
	public void on_save_The_time_and_date_should_get_display_on_Compose_Box() {
		Assert.assertTrue("Schedule Date and Time is not getting showed", composePageMethods.isElementDisplayed());
	}

	@Then("On Click on Edit the schedule box should reopen")
	public void on_Click_on_Edit_the_schedule_box_should_reopen() {
		composePageMethods.EditScheduledTimeandDate();
	}

	@Then("On Click on Cross icon the scheedule time should get canceled")
	public void on_Click_on_Cross_icon_the_scheedule_time_should_get_canceled() {
		composePageMethods.CrossSchedule();
	}

	
	@Then("user Hover on it should show tootlip with message")
	public void user_Hover_on_it_should_show_tootlip_with_message() {
		composePageMethods.HoverOnExpire();
		Assert.assertEquals("Tooltip message is not same", "Toggle to set expiration", composePageMethods.isTootlipMessageissame());
	
	}
	
	@When("The User click on Set to Expire button a popup should get Open")
	public void the_User_click_on_Set_to_Expire_button_a_popup_should_get_Open() {
		composePageMethods.ClickSetToExpire();
		Assert.assertTrue("popup does not get open", composePageMethods.isPopupvisible());
		
		
	}
	
	@Then("the User Clicks on Expiration Time Filed a list should get open")
	public void the_User_Clicks_on_Expiration_Time_Filed_a_list_should_get_open() {
		composePageMethods.OpenExpirationDropdown();
		Assert.assertTrue("List is ot getting displayed", composePageMethods.isExpireTimePopupOpen());
	}

	@Then("User Should be able to select expiration time for one hour")
	public void user_Should_be_able_to_select_expiration_time_for_one_hour() {
		composePageMethods.SelectOneHour();
	}


		@Then("User should be able Enter Password")
			public void user_should_be_able_Enter_Password() throws InterruptedException {
				composePageMethods.EnterPassword();
					}

		@Then("user should be able to Save")
		public void user_should_be_able_to_Save() {
			composePageMethods.SaveDateAndTime();
		}

		@Then("On save Expiration date and time should get displayed")
		public void on_save_Expiration_date_and_time_should_get_displayed() {
			composePageMethods.isDateAndTimeisGettingSaved();
		}
	
		@Then("On Click on Cancel the popup should get closed")
		public void on_Click_on_Cancel_the_popup_should_get_closed() {
			composePageMethods.cancelExpirationPopup();
		}

		@Then("On Click Edit The same Set to expiry popup should get open with saved value")
		public void on_Click_Edit_The_same_Set_to_expiry_popup_should_get_open_with_saved_value() {
			composePageMethods.OpenEditSetToExpire();
			Assert.assertTrue(" Date is not there", composePageMethods.isDateVisible());
			Assert.assertTrue(" Date is not there", composePageMethods.isPasswordVisible());
		}

		@Then("User Should be able to select expiration time for one week")
		public void user_Should_be_able_to_select_expiration_time_for_one_week() throws InterruptedException {
			composePageMethods.SelectNewTime();
		}

		@Then("User should be able Change Password")
		public void user_should_be_able_Change_Password() throws InterruptedException {
			composePageMethods.ChangePassword();
		}
	
		@Then("On click on cross icon saved expiring time should get removed")
		public void on_click_on_cross_icon_saved_expiring_time_should_get_removed() {
			composePageMethods.RemoveExpirationTime();
		}
		
		
		@When("On Hover Tooltip message should show for Vc")
		public void on_Hover_Tooltip_message_should_show_for_Vc() {
			composePageMethods.HoveronVC();
			Assert.assertEquals("message is not same","Toggle visual cryptography",composePageMethods.isMessageSame());
		}


		@When("The User click on VC icon the icon should get enabled")
		public void the_User_click_on_VC_icon_the_icon_should_get_enabled() {
			composePageMethods.EnableVc();
			 Assert.assertTrue("Vc is not enaled", composePageMethods.isVcEnabled());
		}

		@When("On click on VC icon again the icon should get disabled")
		public void on_click_on_VC_icon_again_the_icon_should_get_disabled() {
			composePageMethods.DisableVc();
		}

		@When("On Hover Tooltip message should show for D2I icon")
		public void on_Hover_Tooltip_message_should_show_for_D2I_icon() {
			composePageMethods.HoveronD2I();
		//	Assert.assertEquals("message is not same","Toggle direct to inbox (unencrypted)",composePageMethods.isD2IMessageSame());
		}

		@When("The User click on D2I icon the icon should get enabled")
		public void the_User_click_on_D2I_icon_the_icon_should_get_enabled() {
			composePageMethods.EnableD2I();		
			 Assert.assertTrue("Vc is not enaled", composePageMethods.isD2IEnabled());
		}

		@When("On click on D2I icon again the icon should get disabled")
		public void on_click_on_D2I_icon_again_the_icon_should_get_disabled() {
			composePageMethods.DisableD2I();
		}
		
		@Then("Click on Cancel buttton Of Vc")
		public void click_on_Cancel_buttton_Of_Vc() {
			composePageMethods.RemoveExpirationTime();
		}

		@Then("Click on Cancel buttton Of D2I")
		public void click_on_Cancel_buttton_Of_D2I() {
			composePageMethods.RemoveExpirationTime();
		}
		
		@Then("Verify title is present")
		public void verify_title_is_present() {
			Assert.assertEquals("Text Format messageis not same","Compose email",composePageMethods.isTitleavailable());
		}
		
		@Then("Verify Close Compose from Cancel")
		public void verify_Close_Compose_from_Cancel() {
			composePageMethods.CancelComposeFromCross();
		}

		
		@When("On Hover Tooltip message should show for Text Format")
		public void on_Hover_Tooltip_message_should_show_for_Text_Format() {
			composePageMethods.HoverTextFormat();
			Assert.assertEquals("Text Format messageis not same","Text format",composePageMethods.IsFormatMessageSame());
		}

		@When("On Click on text Format it should Open a popup")
		public void on_Click_on_text_Format_it_should_Open_a_popup() {
			composePageMethods.ClickTextFormat();
			//Assert.assertTrue("Text format is not getting opened", composePageMethods.isTextformatOpen());
		}

		@When("On Hover Undo it should show tooltip with message")
		public void on_Hover_Undo_it_should_show_tooltip_with_message() {
			composePageMethods.HoverUndo();
			Assert.assertEquals("Undo Message is not same","Undo", composePageMethods.isMessageUndosame());
		}

		@When("On Click on Undo it will undo action")
		public void on_Click_on_Undo_it_will_undo_action() {
		  composePageMethods.ClickUndo();
		 
		}

		@When("On Hover Redo it will show tooltip with message")
		public void on_Hover_Redo_it_will_show_tooltip_with_message() {
			composePageMethods.HoverRedo();
			Assert.assertEquals("Redo mesage is not same", "Redo", composePageMethods.isredomessagesame());
		}

		@When("on click on Redo it will redo action")
		public void on_click_on_Redo_it_will_redo_action() {
			composePageMethods.ClickRedo();
		}

		@When("Verify Compose gets minimize")
		public void verify_Compose_gets_minimize() {
		   
			composePageMethods.minimizeCompose();
			
		}

		@Then("On click on Maximize Compose should reopen")
		public void on_click_on_Maximize_Compose_should_reopen() {
			composePageMethods.MaximizeCompose();
			
		}

		@When("On click on Cross Compose box should get closed")
		public void on_click_on_Cross_Compose_box_should_get_closed() {
		   
			composePageMethods.CancelComposeFromCross();
		}


		@Then("On click on Delete icon Compose box should get closed")
		public void on_click_on_Delete_icon_Compose_box_should_get_closed() {
			composePageMethods.DeleteCompose();
		}

//		@Then("On click on Attachment icon system Files Popup should get open")
//		public void on_click_on_Attachment_icon_system_Files_Popup_should_get_open() throws AWTException {
//			composePageMethods.Attachments();
//		}


		@When("On Hover Font type should show Tooltip message")
		public void on_Hover_Font_type_should_show_Tooltip_message() {
			composePageMethods.HoverFontType();
			Assert.assertEquals("Font type mesage is not same", "Font type", composePageMethods.isMessageFontTypesame());

		}

		@Then("On Click on Font Type a dropdown should get open and  on select any option font type should get changed")
		public void on_Click_on_Font_Type_a_dropdown_should_get_open_and_on_select_any_option_font_type_should_get_changed() throws InterruptedException {
			composePageMethods.ChangeFontType();
		}


		@When("On Hover Font size should show Tooltip message")
		public void on_Hover_Font_size_should_show_Tooltip_message() {
			composePageMethods.HoverFontSize();
			Assert.assertEquals("Font type mesage is not same", "Font size", composePageMethods.isMessageFontSizesame());
		}

		@When("On Click on Font size a dropdown should get open and  on select any option font size should get changed")
		public void on_Click_on_Font_size_a_dropdown_should_get_open_and_on_select_any_option_font_size_should_get_changed() {
			composePageMethods.ChangeFontSize();
		}

		@When("On Hover B Icon should show Tooltip message")
		public void on_Hover_B_Icon_should_show_Tooltip_message() {
			composePageMethods.HoverB();
			Assert.assertEquals("Font type mesage is not same", "Font weight", composePageMethods.isMessageforBissame());
		}

		@When("On Click on B Icon  text should change to Bold")
		public void on_Click_on_B_Icon_text_should_change_to_Bold() {
			composePageMethods.ChangetoB();
		}

		@When("On Hover I Icon should show Tooltip message")
		public void on_Hover_I_Icon_should_show_Tooltip_message() {
			composePageMethods.HoverI();
			Assert.assertEquals("Font type mesage is not same", "Font style", composePageMethods.isMessageforIissame());
		}

		@Then("On Click on I icon the text should change to Italic")
		public void on_Click_on_I_icon_the_text_should_change_to_Italic() {
			composePageMethods.ChangetoI();
		}

		@When("On Hover U icon should show Tooltip message")
		public void on_Hover_U_icon_should_show_Tooltip_message() {
			composePageMethods.HoverU();
			Assert.assertEquals("Font type mesage is not same", "Underline", composePageMethods.isMessageforUissame());
		}

		@Then("On Click on U icon the text should change to Underline")
		public void on_Click_on_U_icon_the_text_should_change_to_Underline() {
			composePageMethods.ChangetoU();
		}

		@When("On Hover S icon should show Tooltip message")
		public void on_Hover_S_icon_should_show_Tooltip_message() {
			composePageMethods.HoverS();
			Assert.assertEquals("Font type mesage is not same", "Underline", composePageMethods.isMessageforSissame());
		}

		@Then("On Click on S icon the text should change to StrikeThrough")
		public void on_Click_on_S_icon_the_text_should_change_to_StrikeThrough() {
			composePageMethods.ChangetoS();
			
		}
		
		@When("On Hover Alignment icon should show Tooltip message")
		public void on_Hover_Alignment_icon_should_show_Tooltip_message() {
			composePageMethods.HoverAllignement();
			Assert.assertEquals("Font type mesage is not same", "Align", composePageMethods.isMessageforAllignmentissame());
		}

		@When("On Click on Alignment it should open a dropdown and Alignment should get changed")
		public void on_Click_on_Alignment_it_should_open_a_dropdown_and_Alignment_should_get_changed() {
			composePageMethods.ChangeAlignment();
		}
		
		@When("On Hover Bullet List icon should show Tooltip message")
		public void on_Hover_Bullet_List_icon_should_show_Tooltip_message() {
			composePageMethods.HoverBulletList();
			Assert.assertEquals("Font type mesage is not same", "List", composePageMethods.isMessageforbulletlistissame()); 
		}

		@When("On Click on Bullet List icon it should add bullets")
		public void on_Click_on_Bullet_List_icon_it_should_add_bullets() {
			composePageMethods.AddbulletList();
		}

		@When("On Hover Number List icon should show Tooltip message")
		public void on_Hover_Number_List_icon_should_show_Tooltip_message() {
			composePageMethods.HoverNumberList();
			Assert.assertEquals("Font type mesage is not same", "List", composePageMethods.isMessageforNumListissame()); 
		}

		@When("On Click on Number List icon it should add Number")
		public void on_Click_on_Number_List_icon_it_should_add_Number() {
			composePageMethods.AddNumberList();
		}

		@When("On Hover indent icon should show Tooltip message")
		public void on_Hover_indent_icon_should_show_Tooltip_message() {
			composePageMethods.HoverIndent();
			Assert.assertEquals("Font type mesage is not same", "Indent", composePageMethods.isMessageforIndentissame()); 
		}

		@When("On Click on indent  icon it should add moves toward right")
		public void on_Click_on_indent_icon_it_should_add_moves_toward_right() {
			composePageMethods.AddIndent();
		}

		@When("On Hover outdent icon should show Tooltip message")
		public void on_Hover_outdent_icon_should_show_Tooltip_message() {
			composePageMethods.HoverOutdent();
			Assert.assertEquals("Font type mesage is not same", "Outdent", composePageMethods.isMessageforOutdentissame());  
		}

		@When("On Click on outdent List icon it should moves toward left")
		public void on_Click_on_outdent_List_icon_it_should_moves_toward_left() {
			composePageMethods.AddOutdent();
		}

		@When("On Hover BLockquote icon should show Tooltip message")
		public void on_Hover_BLockquote_icon_should_show_Tooltip_message() {
			composePageMethods.HoverBlockquote();
			Assert.assertEquals("Font type mesage is not same", "Blockquote", composePageMethods.isMessageforQuoteissame());  
		}

		@When("On Click on BLockquote icon it should add BlockQuote")
		public void on_Click_on_BLockquote_icon_it_should_add_BlockQuote() {
			composePageMethods.AddBlockQuote();
		}

		@When("On Hover Tx icon should show Tooltip message")
		public void on_Hover_Tx_icon_should_show_Tooltip_message() {
			composePageMethods.HoverTx();
			Assert.assertEquals("Font type mesage is not same", "Clear", composePageMethods.isMessageforTxissame());  
		}

		@When("On Click on Tx icon it should add clear latest Text format")
		public void on_Click_on_Tx_icon_it_should_add_clear_latest_Text_format() {
			composePageMethods.ClearFormat();
		}
		
//		@Then("User Should be able to add attachmetns")
//		public void user_Should_be_able_to_add_attachmetns() throws AWTException {
//			composePageMethods.Attachments();
//		}
		
		
		
		@Then("Sent Email in bulk")
		public void sent_Email_in_bulk() throws InterruptedException {
		        int count = 500; // Number of times to send the email
		        composePageMethods.EnterBodyInBulk(count);

			
		}

		
}
