package com.automationFramework.AccountSignUp;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationFramework.Base.TestBase;
import com.automationFramework.Utils.Utils;

public class RandomEmailRegister extends TestBase {
	
	public RandomEmailRegister() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(15);
	}
	
	@FindBy(id = "email_create")
	WebElement email;

	@FindBy(id = "SubmitCreate")
	WebElement submitBtn;
	
	public void emailAddress() {
		Random r = new Random();
		String emailRandom = "email" + r.nextInt() + "@gmail.com";
		email.sendKeys(emailRandom);
		
		

	}

	public UserProfileDetails submitButton() {
		//submitBtn.click();
		Utils.clickOnElement(submitBtn);
		return new UserProfileDetails();

	}

}
