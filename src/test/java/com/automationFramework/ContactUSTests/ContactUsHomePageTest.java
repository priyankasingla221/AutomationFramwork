package com.automationFramework.ContactUSTests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.automationFramework.Base.TestBase;
import com.automationFramework.ContactUs.ContactUS;
import com.automationFramework.ContactUs.ContactUsHomePage;

public class ContactUsHomePageTest extends TestBase {

	public ContactUS contactus;
	public ContactUsHomePage homePage;
	SoftAssert softAssert;

	@BeforeMethod
	public void setUp() {
		initialsation();
		contactus = new ContactUS();
		softAssert = new SoftAssert();
		homePage = contactus.clickOnContactUsBtn();

	}

	@Test
	public void sendMessage() {
		homePage.subjectheading();
		homePage.emailaddress(prop.getProperty("email"));
		homePage.orderReferenceNo(prop.getProperty("OrderNo"));
		homePage.EnquiryMessage(prop.getProperty("enquiryMessage"));
		homePage.sendButton();

		String getGreenAlertSuccessMsg = homePage.greenSuccessTextMsg();
		softAssert.assertEquals(getGreenAlertSuccessMsg, prop.getProperty("greenSuccessMsgPopUp"),
				"Message doesn't Match!");
		softAssert.assertAll();

	}

	@AfterMethod
	public void clearBrowser() {
		tearDown();
	}

}
