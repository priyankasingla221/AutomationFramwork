package com.automationFramework.ProductDeletion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationFramework.Base.TestBase;
import com.automationFramework.Utils.Utils;

public class HomePage extends TestBase{
	
	public HomePage() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(15);
	}
	@FindBy(css ="div.header_user_info")
	WebElement signInBtn;
	
	public LoginPage  clickSignInButton() {
		//signInBtn.click();
		Utils.clickOnElement(signInBtn);
		//return object of new page which needs to be loaded
		//Utils.sleep(5000);
		return new LoginPage();
	}
}
