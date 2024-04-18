package pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
		sleep(3000);
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
		setText(propOperation.getValue("ToField"), true, "ankita@staging.blinkly.com");
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
	return isElementDisplayed(propOperation.getValue("DisabledD2I"), true);
}


public void DisableD2I() {
	clickOnElement(propOperation.getValue("D2I"), true);
}



}
