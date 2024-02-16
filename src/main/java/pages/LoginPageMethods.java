package pages;

import java.util.Random;

import org.openqa.selenium.Keys;

import Blinkly.Locator.LoginLocator;
import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class LoginPageMethods extends PredefinedActions {
	public PropOperation propOperation;

	public LoginPageMethods() {
		propOperation = new PropOperation(ConstantPath.LoginLocator);
	}

	public void EnterInValidUserName() throws InterruptedException {
		clickOnElement(propOperation.getValue("Username"), true);

		setText(propOperation.getValue("Username"), true, "ABCD");

	}

	public void ClickOnSignIn() {
		clickOnElement(propOperation.getValue("Sign-In"), true);
		sleep(5000);

	}

	public boolean isValidationMessageAppear() {
		return isElementDisplayed(propOperation.getValue("Errormessage"), true);
	}

	public void FnameBackspace() {
		clickOnElement(propOperation.getValue("Username"), true);
	}

	public void EnterSpaceUsername() throws InterruptedException {
		clickOnElement(propOperation.getValue("Username"), true);
		for (int i = 0; i < 4; i++) {
			pressSpace();
		}
		Thread.sleep(3000);
	}

	public void EnterInValidPassword() throws InterruptedException {
		setText(propOperation.getValue("Password"), true, "1234");
		Thread.sleep(3000);
	}

	public void EmptyPassword() throws InterruptedException {
		setText(propOperation.getValue("Username"), true, "dharmaraj");
		Thread.sleep(3000);
		clickOnElement(propOperation.getValue("Password"), true);
	}

	public void EnterSpacePassword() throws InterruptedException {
		clickOnElement(propOperation.getValue("Username"), true);
		setText(propOperation.getValue("Username"), true, "dharmaraj");
		Thread.sleep(3000);
		clickOnElement(propOperation.getValue("Password"), true);
		for (int i = 0; i < 4; i++) {
			pressSpace();
		}
		Thread.sleep(3000);
	}

	public void ValidUserName() throws InterruptedException {
		clickOnElement(propOperation.getValue("Username"), true);
		setText(propOperation.getValue("Username"), true, "dharmaraj");
		sleep(3000);
	}

	public void ValidPassword() throws InterruptedException {
		clickOnElement(propOperation.getValue("Password"), true);
		setText(propOperation.getValue("Password"), true, "Qwerty@123");
		sleep(2000);
	}

	public void EnabledPassword() throws InterruptedException {
		clickOnElement(propOperation.getValue("Eye"), true);
		Thread.sleep(2000);

	}

	public void DisablePassword() throws InterruptedException {
		clickOnElement(propOperation.getValue("EyeOff"), true);
		Thread.sleep(2000);

	}

	public void MoveSlider() throws InterruptedException {

		clickOnElement(propOperation.getValue("Slider"), true);
		String temp[] = getElementText(propOperation.getValue("SliderNo"), true).split(" ");
		String t = temp[3];
		int k = Integer.parseInt(t);
		for (int i = 0; i < k; i++) {
			pressRightArrowKey();

		}
		Thread.sleep(2000);
	}

	public boolean isComposeButtonVisible() {

		return isElementDisplayed(propOperation.getValue("ComposeButton"), true);
	}

	public void MoveSliderRandomly() {
		clickOnElement(propOperation.getValue("Slider"), true);
		String temp[] = getElementText(propOperation.getValue("SliderNo"), true).split(" ");
		String t = temp[3];
		int k = Integer.parseInt(t);

		int incorrectSliderValue = generateRandomValue(2, 15);

		if (incorrectSliderValue == k) {
			// If the incorrect value matches the current value, generate a new one
			incorrectSliderValue = generateRandomValue(0, 15);
		}

		int difference = k - incorrectSliderValue;

		if (difference > 0) {
			// Move left
			for (int i = 0; i < difference; i++) {
				pressLeftArrowKey();
			}
		} else if (difference < 0) {
			// Move right
			for (int i = 0; i < Math.abs(difference); i++) {
				pressRightArrowKey();
			}
		}

	}

	private int generateRandomValue(int min, int max) {
		Random rand = new Random();
		return rand.nextInt((max - min) + 1) + min;
	}

}
