package com.automationFramework.AccountSignUp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationFramework.Base.TestBase;
import com.automationFramework.Utils.Utils;


public class AccountSignInPage extends TestBase {
	
	public AccountSignInPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(15);
	
	}
		
	
	@FindBy(css = "div.header_user_info")
	WebElement signIn;
	
	public RandomEmailRegister clickOnSignInBtn() {
		//signIn.click();
		Utils.clickOnElement(signIn);
		return new RandomEmailRegister();
	}
}


