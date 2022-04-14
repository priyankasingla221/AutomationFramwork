package com.automationFramework.AccountSignUpTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationFramework.AccountSignUp.AccountSignInPage;
import com.automationFramework.AccountSignUp.RandomEmailRegister;
import com.automationFramework.AccountSignUp.UserProfileDetails;
import com.automationFramework.Base.TestBase;
import com.automationFramework.Utils.Utils;

public class UserProfileDetailsTest extends TestBase {

	AccountSignInPage signInPage;
	UserProfileDetails userProfile;
	RandomEmailRegister randomEmailRegister;

	@BeforeMethod
	public void setUp() {
		initialsation();

		signInPage = new AccountSignInPage();
		randomEmailRegister = signInPage.clickOnSignInBtn();

	}

	@Test
	public void getAccountCredentials() {
		randomEmailRegister.emailAddress();
		waitForDocumentCompleteState(15);
		userProfile = randomEmailRegister.submitButton();
		waitForDocumentCompleteState(15);
		
		userProfile.titleOfUser();
		
		userProfile.userFirstName(prop.getProperty("firstname"));
		userProfile.userLastName(prop.getProperty("lastname"));
		userProfile.userPassword(prop.getProperty("password"));
		userProfile.birthDate();
		userProfile.birthMonth();
		userProfile.birthYear();
		userProfile.signUpNewsLetter();
		userProfile.userAddressFirstName(prop.getProperty("addressfname"));
		userProfile.userAddressLastName(prop.getProperty("addresslname"));
		userProfile.userCompany(prop.getProperty("companyName"));
		userProfile.residentialAddress(prop.getProperty("residentialAddress"));
		userProfile.userCity(prop.getProperty("city"));
		userProfile.userState();
		userProfile.userZip(prop.getProperty("zipCode"));
		userProfile.addInformation();
		userProfile.userPhoneNo(prop.getProperty("phoneNumber"));
		userProfile.userMobileNumber(prop.getProperty("mobileNumber"));
		userProfile.aliasemailAddress(prop.getProperty("aliaseAddress"));
		userProfile.registerButton();
		
		Utils.sleep(5000);
	}

	@AfterMethod
	public void clearBrowser() {
		tearDown();
	}

}
