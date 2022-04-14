package com.automationFramework.ProductDeletion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.automationFramework.Base.TestBase;
import com.automationFramework.Utils.Utils;

public class LoginPage extends TestBase{
	
	public LoginPage() {
		//Using page factory to initizalize web driver and elements on page
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(5);
	}
	
	//Identifying the elements using Find by Annotation
	@FindBy(css ="input[id='email'][name='email']")
	WebElement emailAddress;
	
	@FindBy(css ="input[id='passwd'][name='passwd']")
	WebElement inputpassword;
	
	@FindBy(id= "SubmitLogin")
	WebElement signInBtn;
	
	//Creating independent methods For each action
	
	public void enterEmail(String email) {
		emailAddress.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		inputpassword.sendKeys(password);
		
		
	}
	public WomenTabSelection clickSignInbtn() {
		//signInBtn.click();
		//special smart method from Util class
		Utils.clickOnElement(signInBtn);
		return new WomenTabSelection();
		
	}

}
