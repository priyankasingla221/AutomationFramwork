package com.automationFramework.ContactUs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationFramework.Base.TestBase;
import com.automationFramework.Utils.Utils;

public class ContactUS extends TestBase {

	public ContactUS(){
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(15);
	}
	
	@FindBy(id = "contact-link")
	WebElement contactUs;
	
	public ContactUsHomePage clickOnContactUsBtn() {
		Utils.clickOnElement(contactUs);
		return new ContactUsHomePage();
	}
}
