package com.automationFramework.AccountSignUp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automationFramework.Base.TestBase;
import com.automationFramework.Utils.Utils;

public class UserProfileDetails extends TestBase {
	public UserProfileDetails() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(15);
	}

	@FindBy(id = "id_gender2")
	WebElement title;

	@FindBy(id = "customer_firstname")
	WebElement firstName;

	@FindBy(id = "customer_lastname")
	WebElement lastName;

	@FindBy(id = "passwd")
	WebElement passwd;

	@FindBy(id = "days")
	WebElement dobDate;

	@FindBy(id = "months")
	WebElement dobMonth;

	@FindBy(id = "years")
	WebElement dobYear;

	@FindBy(id = "newsletter")
	WebElement signupNewsLetter;

	@FindBy(id = "firstname")
	WebElement addressFirstName;

	@FindBy(id = "lastname")
	WebElement addressLastName;

	@FindBy(id = "company")
	WebElement company;

	@FindBy(id = "address1")
	WebElement address;

	@FindBy(id = "city")
	WebElement cities;

	@FindBy(id = "id_state")
	WebElement state;

	@FindBy(id = "postcode")
	WebElement zip;

	@FindBy(id = "other")
	WebElement additionalInfo;

	@FindBy(id = "phone")
	WebElement phoneNo;

	@FindBy(id = "phone_mobile")
	WebElement mobileNo;

	@FindBy(id = "alias")
	WebElement aliasEmail;

	@FindBy(id = "submitAccount")
	WebElement registerBtn;

	public void titleOfUser() {
		Utils.waitForElementToBeSelectable(title, 10);
		Utils.clickOnElement(title);
	}

	public void userFirstName(String firstname) {

		//firstName.sendKeys(firstname);
		Utils.sendData(firstName, firstname);

	}

	public void userLastName(String lastname) {

		//lastName.sendKeys(lastname);
		Utils.sendData(lastName, lastname);

	}

	public void userPassword(String password) {
		//passwd.sendKeys(password);
		Utils.sendData(passwd, password);

	}

	public void birthDate() {
		//Select select1 = new Select(dobDate);
		// Selected visible text
		//select1.selectByIndex(10);
		Utils.selectFromDropDownUsingIndex(dobDate, 10);

	}

	public void birthMonth() {
		//Select select2 = new Select(dobMonth);
		// Selected visible text
		//select2.selectByIndex(4);
		Utils.selectFromDropDownUsingIndex(dobMonth, 4);

	}

	public void birthYear() {
		//Select select3 = new Select(dobYear);
		// Selected visible text
		//select3.selectByIndex(19);
		Utils.selectFromDropDownUsingIndex(dobYear, 10);

	}

	public void signUpNewsLetter() {
		
		signupNewsLetter.click();
		//Utils.waitForElementToBeClickable(signupNewsLetter, 10);
		//waitForDocumentCompleteState(15);
		//Utils.clickOnElement(signupNewsLetter);
		waitForDocumentCompleteState(15);

	}

	public void userAddressFirstName(String addressfname) {
		//addressFirstName.sendKeys(addressfname);
		Utils.sendData(addressFirstName, addressfname);

	}

	public void userAddressLastName(String addresslname) {
		//addressLastName.sendKeys(addresslname);
		Utils.sendData(addressLastName, addresslname);

	}

	public void userCompany(String companyName) {
		//company.sendKeys(companyName);
		Utils.sendData(company, companyName);

	}

	public void residentialAddress(String residentialAddress) {
		//address.sendKeys(residentialAddress);
		Utils.sendData(address, residentialAddress);

	}

	public void userCity(String city) {
		//cities.sendKeys(city);
		Utils.sendData(cities, city);

	}

	public void userState() {
		//Select selectState = new Select(state);
		//selectState.selectByVisibleText("California");
		Utils.selectFromDropDownUsingVisibleText(state, "California");

	}

	public void userZip(String zipCode) {
		//zip.sendKeys(zipCode);
		Utils.sendData(zip, zipCode);

	}

	public void addInformation() {
		//additionalInfo.sendKeys("This is my First Signup.");
		Utils.sendData(additionalInfo, "This is my First Signup.");

	}

	public void userPhoneNo(String phoneNumber) {
		//phoneNo.sendKeys(phoneNumber);
		Utils.sendData(phoneNo, phoneNumber);

	}

	public void userMobileNumber(String mobileNumber) {
		//mobileNo.sendKeys(mobileNumber);
		Utils.sendData(mobileNo, mobileNumber);

	}

	public void aliasemailAddress(String aliaseAddress) {
		//aliasEmail.sendKeys(aliaseAddress);
		Utils.sendData(aliasEmail, aliaseAddress);

	}

	public UserProfileDetails registerButton() {
		//registerBtn.click();
		Utils.clickOnElement(registerBtn);
		return new UserProfileDetails();

	}

}
