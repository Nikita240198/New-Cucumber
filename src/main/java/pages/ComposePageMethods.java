package pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class ComposePageMethods extends PredefinedActions {
	public PropOperation propOperation;

	public ComposePageMethods() {
		propOperation = new PropOperation(ConstantPath.ComposeLocator);
	}

	public void OpenCompose() {
		clickOnElement(propOperation.getValue("ComposeButton"), true);
		sleep(3000);
	}

	public boolean isComposeOpen() {

		return isElementDisplayed(propOperation.getValue("ComposeTitle"), true);
	}

	public void ClickOnSend() {
		clickOnElement(propOperation.getValue("SendButton"), true);
		sleep(7000);
	}

	public boolean isErrorPopupAppear() {
		return isElementDisplayed(propOperation.getValue("ErrorPopup"), true);
	}

	public void CloseErrorPopup() {
		clickOnElement(propOperation.getValue("OkButton"), true);
		sleep(3000);
	}

	public void ClickOutsidePopup() {
		clickOnElement(propOperation.getValue("OutsidePopup"), true);
		sleep(3000);
	}

	public void EnterRecipient() throws InterruptedException {
		setText(propOperation.getValue("ToField"), true, "dharmaraj@staging.blinkly.com");
		sleep(3000);
	}

	public void AutoSuggestion() throws InterruptedException {
		setText(propOperation.getValue("ToField"), true, "ccc");
		sleep(3000);

	}

	public boolean isRecipientDispaly() {
		return isElementDisplayed(propOperation.getValue("Recipient"), true);
	}

	public void PressEnter() {
		pressEnterKey();
		sleep(3000);
	}

	public void Clickbackspace() {
		clickOnElement(propOperation.getValue("ToField"), true);
		String data = getElementText(propOperation.getValue("Recipient"), true);
		for (int i = 0; i < data.length(); i++) {
			pressBackSpace();
		}

	}

	public boolean isEmailidgetsremoved() {
		return isElementDisplayed(propOperation.getValue("ToField"), true);
	}

	public void DoubleClickEmail() throws InterruptedException {

		DoubleClick(propOperation.getValue("Recipient"), true);
		sleep(3000);
	}

	public void EditEmail1() throws InterruptedException {
		clickOnElement(propOperation.getValue("ToField"), true);
		setText(propOperation.getValue("ToField"), true, "nivesh@staging.blinkly.com");
		sleep(3000);
	}

	public void CancelMail() {
		clickOnElement(propOperation.getValue("Cancel"), true);
	}

	public void OpenCC() {
		clickOnElement(propOperation.getValue("ClickCc"), true);
	}

	public boolean isCCfieldEnabled() {
		return isElementDisplayed(propOperation.getValue("inputCc"), true);
	}

	public void EnterCc() throws InterruptedException {
		setText(propOperation.getValue("inputCc"), true, "ankita@staging.blinkly.com");
	}

	public void ClickBackinCc() {
		clickOnElement(propOperation.getValue("inputCc"), true);
		pressBackSpace();

	}

	public void CcAutosuggetion() throws InterruptedException {
		setText(propOperation.getValue("inputCc"), true, "pra");
		sleep(3000);
	}

	public boolean isCCfieldRemoved() {
		return isElementDisplayed(propOperation.getValue("ClickCc"), true);

	}

	public void CcDoubleClick() {
		DoubleClick(propOperation.getValue("Recipient"), true);
		sleep(3000);
	}

	public void EditCcEmail() throws InterruptedException {
		clickOnElement(propOperation.getValue("inputCc"), true);
		setText(propOperation.getValue("inputCc"), true, "nivesh@staging.blinkly.com");
		sleep(3000);
	}

	public void OpenBcc() {
		clickOnElement(propOperation.getValue("ClickBcc"), true);
	}

	public boolean isBccFieldEnabled() {
		return isElementDisplayed(propOperation.getValue("inputBcc"), true);
	}

	public void EnterBcc() throws InterruptedException {
		setText(propOperation.getValue("inputBcc"), true, "ankita@staging.blinkly.com");
	}

	public void ClickBackinBcc() {
		clickOnElement(propOperation.getValue("inputBcc"), true);
		pressBackSpace();
	}

	public void BccAutosuggestion() throws InterruptedException {
		setText(propOperation.getValue("inputBcc"), true, "pra");
		sleep(3000);
	}

	public boolean isBccFieldRemoved() {
		return isElementDisplayed(propOperation.getValue("ClickBcc"), true);
	}

	public void BccDoubleClick() {
		DoubleClick(propOperation.getValue("Recipient"), true);
		sleep(3000);
	}

	public void EditBccEmail() throws InterruptedException {
		clickOnElement(propOperation.getValue("inputBcc"), true);
		setText(propOperation.getValue("inputBcc"), true, "nivesh@staging.blinkly.com");
		sleep(3000);
	}

	public String getSubjectPlaceholder() {
		return getAttribute(propOperation.getValue("Subject"), true, "placeholder");
	}

	public void EnterSubject() throws InterruptedException {
		setText(propOperation.getValue("Subject"), true, "Test 1");
		sleep(3000);
	}

	public void Enterbody() throws InterruptedException {
		clickOnElement(propOperation.getValue("Body"), true);
		sleep(3000);
		setText(propOperation.getValue("Body"), true,
				"This is an automatic generated mail \n design by Nikita \n We are using Selenium with java \n we also learning Cucumber BDD");

		sleep(3000);
	}

	public void HoverScheduleSend() {
		HoverOnElementUsingAction(propOperation.getValue("ScheduleSendButton"), true);
		sleep(3000);
	}

	public void OpenSechduleSend() {
		clickOnElement(propOperation.getValue("ScheduleSendButton"), true);
		sleep(3000);
	}

	public boolean isDatePickerOpen() {
		return isElementDisplayed(propOperation.getValue("DatePicker"), true);
	}

	public boolean isTodaydateisPresent() {
		return isElementDisplayed(propOperation.getValue("DatePicker"), true);
	}

	public void ClickonSaveOnScheduleSend() {
		clickOnElement(propOperation.getValue("SaveonSchedule"), true);
		sleep(3000);
	}

	public void OpenCalendar() {
		clickOnElement(propOperation.getValue("DatePicker"), true);
		sleep(3000);
	}

	public void SelectFutureDate() {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);

		LocalDate nextDate = currentDate.plusDays(1);

		System.out.println("Next Date: " + nextDate);

		String nextDateStr = nextDate.format(DateTimeFormatter.ofPattern("d"));

		System.out.println("value of nextDateStr is " + nextDateStr);

		WebElement nextDateElement = getElementByValue(nextDateStr, true); // Adjust boolean parameter as needed
		nextDateElement.click();
		sleep(3000);

	}

	public void SelectPastDate() {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);

		LocalDate previousDate = currentDate.plusDays(-1);

		System.out.println("Previous Date: " + previousDate);

		String nextDateStr = previousDate.format(DateTimeFormatter.ofPattern("d"));

		System.out.println("value of nextDateStr is " + nextDateStr);

		WebElement nextDateElement = getElementByValue(nextDateStr, true); // Adjust boolean parameter as needed

		nextDateElement.click();

		sleep(3000);

	}

	public boolean isTodayTimeisPresent() {
		return isElementDisplayed(propOperation.getValue("VisibleTime"), true);
	}

	public void OpenTime() {
		clickOnElement(propOperation.getValue("VisibleTime"), true);
		sleep(3000);
	}

	public void SelectNextTimeSlot() {
		// Click on the time field to open the dropdown
		String timeString = getAttribute(propOperation.getValue("VisibleTime"), false, "value");
		System.out.println(" Time in field --> " + timeString);

		SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm a");
		SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		try {
			// Parse the input time string
			Date date = inputFormat.parse(timeString);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);

			int hour = calendar.get(Calendar.HOUR_OF_DAY);
			int minute = calendar.get(Calendar.MINUTE);
			String amPm = hour < 12 ? "AM" : "PM";

			System.out.println("Hour: " + hour);
			System.out.println("Minute: " + minute);
			System.out.println("AM/PM: " + amPm);

			int newHour;
			int newMinute;

			if (minute >= 30) {
				newHour = hour + 1;
				newMinute = 0; // Reset minutes for the next hour
			} else {
				newHour = hour;
				newMinute = 30; // Round up to the next half-hour
			}

			String formattedTime;
			if (newHour >= 12) {
				amPm = "PM";
				if (newHour > 12) {
					newHour -= 12; // Convert to 12-hour format
				}
			} else {
				amPm = "AM";
				if (newHour == 0) {
					newHour = 12; // Midnight (0) should be represented as 12 AM
				}
			}

			// formattedTime = String.format("%02d:%02d %s", newHour, newMinute, amPm);
			formattedTime = String.format("%d:%02d %s", newHour, newMinute, amPm);

			System.out.println("Formatted Time: " + formattedTime);

			// Click on the time element and select the next time slot
			WebElement timeElement = getElementByValue(formattedTime, true);
			timeElement.click();
			sleep(3000); // Optional sleep for demonstration
		} catch (ParseException e) {
			System.out.println("Invalid time format");
			e.printStackTrace();
		}
	}

	public void SelectPastTimeSlot() {
		String timeString = getAttribute(propOperation.getValue("VisibleTime"), false, "value");
		System.out.println("Time in field --> " + timeString);

		SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm a");
		SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		try {
			// Parse the input time string
			Date date = inputFormat.parse(timeString);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);

			int hour = calendar.get(Calendar.HOUR_OF_DAY);
			int minute = calendar.get(Calendar.MINUTE);
			String amPm = hour < 12 ? "AM" : "PM";

			// Subtract 30 minutes from the current time
			calendar.add(Calendar.MINUTE, -30);

			int newHour = calendar.get(Calendar.HOUR_OF_DAY);
			int newMinute = calendar.get(Calendar.MINUTE);
			if (newHour >= 12) {
				amPm = "PM";
				if (newHour > 12) {
					newHour -= 12; // Convert to 12-hour format
				}
			} else {
				amPm = "AM";
				if (newHour == 0) {
					newHour = 12; // Midnight (0) should be represented as 12 AM
				}
			}

			String formattedTime = String.format("%d:%02d %s", newHour, newMinute, amPm);
			System.out.println("Formatted Time: " + formattedTime);

			// Click on the time element and select the next time slot
			WebElement timeElement = getElementByValue(formattedTime, true);
			timeElement.click();
			sleep(3000); // Optional sleep for demonstration
		} catch (ParseException e) {
			System.out.println("Invalid time format");
			e.printStackTrace();
		}

	}

	public void CloseSelectTimePopup() {
		clickOnElement(propOperation.getValue("CloseTimePopup"), true);
		sleep(3000);
	}

	public void CancelScheduleSend() {
		clickOnElement(propOperation.getValue("CancelOnSchedule"), true);
		sleep(3000);
	}

	public void CloseSchedulePopup() {
		clickOnElement(propOperation.getValue("ClickOutsideclaendar"), true);
		sleep(3000);

	}

	public boolean isElementDisplayed() {
		return isElementDisplayed(propOperation.getValue("SavedScheduleTimeAndDate"), true);

	}

	public void EditScheduledTimeandDate() {
		clickOnElement(propOperation.getValue("EditSchedule"), true);
		sleep(3000);
	}

	public void CrossSchedule() {
		clickOnElement(propOperation.getValue("RemoveSchedule"), true);
		sleep(3000);
	}

	public void HoverOnExpire() {
		HoverOnElementUsingAction(propOperation.getValue("ExpireButton"), true);
		sleep(3000);
	}

	public String isTootlipMessageissame() {
		WebElement message = getElement(propOperation.getValue("ExpireTootlip"), true);
		return message.getText();
	}

	public void ClickSetToExpire() {
		clickOnElementAfterVisible(propOperation.getValue("ExpireButton"), true);

		sleep(3000);

	}

	public boolean isPopupvisible() {
		return isElementDisplayed(propOperation.getValue("ExpirePopup"), true);
	}

	public void OpenExpirationDropdown() {
		clickOnElement(propOperation.getValue("ExpirationTime"), true);
		sleep(3000);

	}

	public boolean isExpireTimePopupOpen() {
		return isElementDisplayed(propOperation.getValue("ExpireDropDownLocator"), true);
	}

	public void SelectOneHour() {

		clickOnElement(propOperation.getValue("ExpireDropDownLocator"), true);
		sleep(2000);

	}

	public void EnterPassword() throws InterruptedException {
		clickOnElement(propOperation.getValue("Password"), true);
		setText(propOperation.getValue("Password"), true, "123");
		sleep(2000);
	}

	public void SaveDateAndTime() {
		clickOnElement(propOperation.getValue("SaveSetToExpire"), true);

		sleep(2000);
	}

	public boolean isDateAndTimeisGettingSaved() {
		return isElementDisplayed(propOperation.getValue("DateAndTimeOnsSave"), true);
	}

	public void cancelExpirationPopup() {
		clickOnElement(propOperation.getValue("CancelSetToExpire"), true);

		sleep(2000);
	}

	public void OpenEditSetToExpire() {
		clickOnElement(propOperation.getValue("EditExpirationTime"), true);

		sleep(2000);
	}

	public boolean isDateVisible() {
		return isElementDisplayed(propOperation.getValue("ExpirationTime"), true);

	}

	public boolean isPasswordVisible() {
		return isElementDisplayed(propOperation.getValue("Password"), true);
	}

	public void SelectNewTime() throws InterruptedException {
		clickOnElement(propOperation.getValue("NewExpiringTime"), true);
		sleep(2000);

	}

	public void ChangePassword() throws InterruptedException {
		clickOnElement(propOperation.getValue("Password"), true);

		setText(propOperation.getValue("Password"), true, "Qwerty@123");
		sleep(2000);
	}

	public void ViewPassword() throws InterruptedException {
		clickOnElement(propOperation.getValue("Password"), true);

		setText(propOperation.getValue("Password"), true, "Qwerty@123");
		sleep(3000);

		clickOnElement(propOperation.getValue("ShowPassword"), true);
	}

	public void RemoveExpirationTime() {
		clickOnElement(propOperation.getValue("CancelOnCross"), true);
	}

	public void HoveronVC() {
		HoverOnElementUsingAction(propOperation.getValue("VC"), true);
		sleep(3000);
	}

	public String isMessageSame() {
		WebElement message = getElement(propOperation.getValue("VC"), true);
		return message.getText();
	}

	public void EnableVc() {
		clickOnElement(propOperation.getValue("VC"), true);
	}

	public boolean isVcEnabled() {
		return isElementDisplayed(propOperation.getValue("DisabledVc"), true);
	}

	public void DisableVc() {
		clickOnElement(propOperation.getValue("VC"), true);
	}

	public void CancelVc() {
		clickOnElement(propOperation.getValue("CancelOnCross"), true);

	}

	public void HoveronD2I() {
		HoverOnElementUsingAction(propOperation.getValue("D2I"), true);
		sleep(3000);
	}

	public String isD2IMessageSame() {
		WebElement message = getElement(propOperation.getValue("D2I"), true);
		return message.getText();
	}

	public void EnableD2I() {
		clickOnElement(propOperation.getValue("D2I"), true);
	}

	public boolean isD2IEnabled() {
		return isElementDisplayed(propOperation.getValue("EnableD2I"), true);
	}

	public void DisableD2I() {
		clickOnElement(propOperation.getValue("D2I"), true);
	}

	public String HoverTextFormat() {
		HoverOnElementUsingAction(propOperation.getValue("TextFormatIcon"), true);
		sleep(3000);
		return null;
	}

	public String IsFormatMessageSame() {
		WebElement message = getElement(propOperation.getValue("TextFormatIcon"), true);
		return message.getText();
	}

	public void ClickTextFormat() {
		clickOnElement(propOperation.getValue("TextFormatIcon"), true);
		sleep(2000);
	}

	public boolean isTextformatOpen() {
		return isElementDisplayed(propOperation.getValue("Undo"), true);
	}

	public String HoverUndo() {
		HoverOnElementUsingAction(propOperation.getValue("Undo"), true);
		sleep(3000);
		return null;
	}

	public String isMessageUndosame() {
		WebElement message = getElement(propOperation.getValue("Undo"), true);
		return message.getText();
	}

	public void ClickUndo() {
		clickOnElementUsingAction(propOperation.getValue("Undo"), true);
		sleep(3000);
	}

	public String HoverRedo() {
		HoverOnElementUsingAction(propOperation.getValue("Redo"), true);
		sleep(3000);
		return null;
	}

	public String isredomessagesame() {
		WebElement message = getElement(propOperation.getValue("Redo"), true);
		return message.getText();
	}

	public void ClickRedo() {
		clickOnElement(propOperation.getValue("Redo"), true);
		sleep(2000);
	}

	public String isTitleavailable() {
		WebElement message = getElement(propOperation.getValue("Title"), true);
		return message.getText();
	}

	public void CancelComposeFromCross() {
		clickOnElement(propOperation.getValue("CloseCompose"), true);
		sleep(3000);
	}

	public void minimizeCompose() {
		clickOnElement(propOperation.getValue("minimizeCompose"), true);
		sleep(2000);
	}

	public void MaximizeCompose() {
		clickOnElement(propOperation.getValue("MaximizeCompose"), true);
		sleep(2000);
	}

	public void DeleteCompose() {
		clickOnElement(propOperation.getValue("Delete"), true);
		sleep(3000);
	}

	public String HoverFontType() {
		HoverOnElementUsingAction(propOperation.getValue("FontTypeicon"), true);
		sleep(3000);
		return null;
	}

	public String isMessageFontTypesame() {
		WebElement message = getElement(propOperation.getValue("FontTypeicon"), true);
		return message.getText();
	}

	public void ChangeFontType() throws InterruptedException {
		clickOnElement(propOperation.getValue("FontTypeicon"), true);
		sleep(3000);
		setText(propOperation.getValue("FontTypeicon"), true, "Sans-serif");
	}

	public String HoverFontSize() {
		HoverOnElementUsingAction(propOperation.getValue("FontSizeicon"), true);
		sleep(3000);
		return null;
	}

	public String isMessageFontSizesame() {
		WebElement message = getElement(propOperation.getValue("FontSizeicon"), true);
		return message.getText();
	}

	public void ChangeFontSize() {
		clickOnElement(propOperation.getValue("FontSizeicon"), true);
		sleep(3000);

		clickOnElement(propOperation.getValue("SelectFontSize"), true);
		sleep(3000);

	}

	public String HoverB() {
		HoverOnElementUsingAction(propOperation.getValue("BoldIcon"), true);
		sleep(3000);
		return null;
	}

	public String isMessageforBissame() {
		WebElement message = getElement(propOperation.getValue("BoldIcon"), true);
		return message.getText();
	}

	public void ChangetoB() {
		clickOnElement(propOperation.getValue("BoldIcon"), true);
		sleep(3000);

	}

	public String HoverI() {
		HoverOnElementUsingAction(propOperation.getValue("ItalicIcon"), true);
		sleep(3000);
		return null;
	}

	public String isMessageforIissame() {
		WebElement message = getElement(propOperation.getValue("ItalicIcon"), true);
		return message.getText();
	}

	public void ChangetoI() {
		clickOnElement(propOperation.getValue("ItalicIcon"), true);
		sleep(3000);

	}

	public String HoverU() {
		HoverOnElementUsingAction(propOperation.getValue("UnderlineIcon"), true);
		sleep(3000);
		return null;
	}

	public String isMessageforUissame() {
		WebElement message = getElement(propOperation.getValue("UnderlineIcon"), true);
		return message.getText();
	}

	public void ChangetoU() {
		clickOnElement(propOperation.getValue("UnderlineIcon"), true);
		sleep(3000);

	}

	public String HoverS() {
		HoverOnElementUsingAction(propOperation.getValue("StrikethroughIcon"), true);
		sleep(3000);
		return null;
	}

	public String isMessageforSissame() {
		WebElement message = getElement(propOperation.getValue("StrikethroughIcon"), true);
		return message.getText();
	}

	public void ChangetoS() {
		clickOnElement(propOperation.getValue("StrikethroughIcon"), true);
		sleep(3000);

	}

	public String HoverAllignement() {
		HoverOnElementUsingAction(propOperation.getValue("AlignmentIcon"), true);
		sleep(3000);
		return null;
	}

	public String isMessageforAllignmentissame() {
		WebElement message = getElement(propOperation.getValue("AlignmentIcon"), true);
		return message.getText();
	}

	public void ChangeAlignment() {
		clickOnElement(propOperation.getValue("AlignmentIcon"), true);
		sleep(3000);
//		
//		List<WebElement> element =getAllElements(propOperation.getValue("AlignmentIcon"),true);
//		
//	if(element.size()>1) {
//		 WebElement secondElement = element.get(1);
//	        secondElement.click();
//	}
//	else{
//		 System.out.println("There is no element at the second index.");
//	}
		clickOnElement(propOperation.getValue("SelectAlignment"), true);
		sleep(3000);
		
		
		
	}
	
	public String HoverBulletList() {
		HoverOnElementUsingAction(propOperation.getValue("BulletList"), true);
		sleep(3000);
		return null;
	}

	public String isMessageforbulletlistissame() {
		WebElement message = getElement(propOperation.getValue("BulletList"), true);
		return message.getText();
	}

	public void AddbulletList() {
		clickOnElement(propOperation.getValue("BulletList"), true);
		sleep(3000);

		
	}
	
	public String HoverNumberList() {
		HoverOnElementUsingAction(propOperation.getValue("NumberList"), true);
		sleep(3000);
		return null;
	}

	public String isMessageforNumListissame() {
		WebElement message = getElement(propOperation.getValue("NumberList"), true);
		return message.getText();
	}

	public void AddNumberList() {
		clickOnElement(propOperation.getValue("NumberList"), true);
		sleep(3000);

		
	}
	
	public String HoverIndent() {
		HoverOnElementUsingAction(propOperation.getValue("Indendt"), true);
		sleep(3000);
		return null;
	}

	public String isMessageforIndentissame() {
		WebElement message = getElement(propOperation.getValue("Indendt"), true);
		return message.getText();
	}

	public void AddIndent() {
		clickOnElement(propOperation.getValue("Indendt"), true);
		sleep(3000);

		
	}
	
	public String HoverOutdent() {
		HoverOnElementUsingAction(propOperation.getValue("OutDent"), true);
		sleep(3000);
		return null;
	}

	public String isMessageforOutdentissame() {
		WebElement message = getElement(propOperation.getValue("OutDent"), true);
		return message.getText();
	}

	public void AddOutdent() {
		clickOnElement(propOperation.getValue("OutDent"), true);
		sleep(3000);

		
	}
	
	public String HoverBlockquote() {
		HoverOnElementUsingAction(propOperation.getValue("BlockQuote"), true);
		sleep(3000);
		return null;
	}

	public String isMessageforQuoteissame() {
		WebElement message = getElement(propOperation.getValue("BlockQuote"), true);
		return message.getText();
	}

	public void AddBlockQuote() {
		clickOnElement(propOperation.getValue("BlockQuote"), true);
		sleep(3000);

		
	}
	
	public String HoverTx() {
		HoverOnElementUsingAction(propOperation.getValue("ClearFormat"), true);
		sleep(3000);
		return null;
	}

	public String isMessageforTxissame() {
		WebElement message = getElement(propOperation.getValue("ClearFormat"), true);
		return message.getText();
	}

	public void ClearFormat() {
		clickOnElement(propOperation.getValue("ClearFormat"), true);
		sleep(3000);

		
	}
//	public void Attachments() throws AWTException {
//		clickOnElement(propOperation.getValue("OpenAttachment"), true);
//		sleep(3000);
//	
//		WebElement upload = getElement(propOperation.getValue("OpenAttachment"), true);
//		Screen screen = new Screen();
//
//		try {
//            // Capture the file chooser dialog
//			 screen.click("/Users/Mind/Documents/Upload Files.png");
//			  screen.type("/Users/Mind/Documents/Upload Files.png");
//	            screen.type(Key.ENTER);
//		
//	 Thread.sleep(5000);
//
//    } catch (Exception e) {
//        e.printStackTrace();
//    } 
//	}
	
	public void Subjetcone(int i) throws InterruptedException {
		setText(propOperation.getValue("Subject"), true, "Subject " + i);
		sleep(3000);
	}
	


	 public void EnterBodyInBulk(int count) throws InterruptedException {
	        for (int i =0; i < count; i++) {
	            OpenCompose();
	            EnterRecipient();
	            Subjetcone(i+1);
	            Enterbody();
	            ClickOnSend();
	        }
	    }

	
	
	

}
