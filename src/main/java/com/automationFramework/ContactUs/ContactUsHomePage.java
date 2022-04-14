package com.automationFramework.ContactUs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automationFramework.Base.TestBase;
import com.automationFramework.Utils.Utils;

public class ContactUsHomePage extends TestBase {
	public ContactUsHomePage() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(15);
	}

	@FindBy(id = "id_contact")
	WebElement subjectHeading;

	@FindBy(id = "email")
	WebElement emailAddress;

	@FindBy(id = "id_order")
	WebElement orderReference;

	@FindBy(id = "message")
	WebElement message;

	@FindBy(id = "submitMessage")
	WebElement sendBtn;

	@FindBy(css = "p[class ='alert alert-success']")
	WebElement greenSuccessMsg;

	public void subjectheading() {
		//Select select = new Select(subjectHeading);
		// Selected visible text
		//select.selectByVisibleText("Webmaster");
		Utils.selectFromDropDownUsingVisibleText(subjectHeading, "Webmaster");

	}

	public void emailaddress(String email) {
		emailAddress.sendKeys(email);
		
	

	}

	public void orderReferenceNo(String OrderNo) {
		orderReference.sendKeys(OrderNo);

	}

	public void EnquiryMessage(String enquiryMessage) {
		message.sendKeys(enquiryMessage);

	}

	public String greenSuccessTextMsg() {
		return greenSuccessMsg.getText();

	}

	public ContactUsHomePage sendButton() {
		sendBtn.click();
		return new ContactUsHomePage();

	}

}
