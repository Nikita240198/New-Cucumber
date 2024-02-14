package pages;
import java.util.List;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class LoginPageMethods extends PredefinedActions {
	public PropOperation propOperation;
	
	public LoginPageMethods() {
		propOperation = new PropOperation(ConstantPath.LoginLocator);
	}
	
	public void EnterInValidUserName() throws InterruptedException {
		clickOnElement(propOperation.getValue("Username"),true);
		Thread.sleep(3000);
		setText(propOperation.getValue("Username"),true,"ABCD");
		Thread.sleep(3000);
	}
	
	public void ClickOnSignIn() throws InterruptedException {
		clickOnElement(propOperation.getValue("Sign-In"), true);
		Thread.sleep(3000);
	}
	
	public boolean isValidationMessageAppear() {
		return isElementDisplayed(propOperation.getValue("Errormessage"),true);
	}
	
	public void FnameBackspace() throws InterruptedException {
		List<String> value = getAllElementsText("Username",true);
		
		for(int i=0;i< value.size();i++) {
			pressBackSpace();
		}
		Thread.sleep(3000);
		}
	
	public void EnterSpaceUsername() throws InterruptedException {
		clickOnElement(propOperation.getValue("Username"),true);
		for(int i=0;i<4;i++) {
			pressSpace();
		}
		Thread.sleep(3000);
		}
		
		
	public void EnterInValidPassword() throws InterruptedException {
		setText(propOperation.getValue("Password"),true,"1234");
		Thread.sleep(3000);
	}
	
	public void PasswordBackSpace() throws InterruptedException {
		List<String> value = getAllElementsText("Password",true);
		for(int i=0;i< value.size();i++) {
			pressBackSpace();
		}
		Thread.sleep(3000);
	}
	
	
	public void EnterSpacePassword() throws InterruptedException {
		clickOnElement(propOperation.getValue("Username"),true);
		for(int i=0;i<4;i++) {
			pressSpace();
		}
		Thread.sleep(3000);
		}
	
	public void ValidUserName() throws InterruptedException {
		setText(propOperation.getValue("Username"),true,"dharmaraj");
		Thread.sleep(3000);
	}
	
	
	public void ValidPassword() throws InterruptedException {
		setText(propOperation.getValue("Username"),true,"Qwerty@123");
		Thread.sleep(3000);
	}
	

	
	
	
	
	
}
