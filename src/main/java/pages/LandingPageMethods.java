package pages;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class LandingPageMethods extends PredefinedActions {

	public PropOperation propOperation;

	public LandingPageMethods() {
		propOperation = new PropOperation(ConstantPath.LandingLocator);
	}

	// Method to check if the logo is visible
	public boolean isLogoVisible() {
		return isElementDisplayed(propOperation.getValue("LogoIcon"), true);
	}

	// Method to click on the Blinkly logo
	public void BlinklyLogoClick() {
		clickOnElement(propOperation.getValue("LogoIcon"), true);
	}

	public boolean isLightmodeVisible() {
		return isElementDisplayed(propOperation.getValue("Lighticon"), true);
	}
	
	public void clickOnDarkModeIcon() {
		clickOnElement(propOperation.getValue("ClickDark"),true);
	}
public boolean isDarkModeSelected() {
	return isElementDisplayed(propOperation.getValue("DarkIcon"),true);
			
}
public void clickOnLightModeIcon() {
	clickOnElement(propOperation.getValue("LightModeIcon"),true);
}

public boolean isLightModeSelected() {
	return isElementDisplayed(propOperation.getValue("Lighticon"), true);
}

public void clickOnAccessButton() throws InterruptedException {
	clickOnElement(propOperation.getValue("AccessButton"),true);
	Thread.sleep(3000);
}

public boolean isLoginPageDisplayed() {
	return isElementDisplayed(propOperation.getValue("LoginPage"), true);
}




}
