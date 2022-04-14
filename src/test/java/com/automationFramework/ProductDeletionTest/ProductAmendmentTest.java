package com.automationFramework.ProductDeletionTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automationFramework.Base.TestBase;
import com.automationFramework.ProductDeletion.HomePage;
import com.automationFramework.ProductDeletion.LoginPage;
import com.automationFramework.ProductDeletion.ProductAmendment;
import com.automationFramework.ProductDeletion.ProductSelection;
import com.automationFramework.ProductDeletion.ProductSpecification;
import com.automationFramework.ProductDeletion.WomenTabSelection;
import com.automationFramework.Utils.ExcelUtils;

public class ProductAmendmentTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	WomenTabSelection womenTabSelection;
	ProductSelection productSelection;
	ProductSpecification productSpecification;
	ProductAmendment productAmendment;
	SoftAssert softAlert;

	@BeforeMethod
	public void setup() {
		initialsation();
		homePage = new HomePage();
		softAlert = new SoftAssert();
		loginPage = homePage.clickSignInButton();

	}

	//@Test(dataProvider = "signUpDataProvider")
	@Test
	public void verifyUserCredentials() {
		loginPage.enterEmail(prop.getProperty("email"));
		loginPage.enterPassword(prop.getProperty("password"));
		womenTabSelection = loginPage.clickSignInbtn();

		productSelection = womenTabSelection.navigatingToWomenTab();
		productSpecification = productSelection.productClick();
		productSpecification.quantityAddition();
		productSpecification.sizeChange();

		productAmendment = productSpecification.addtoCartBtn();
		productAmendment.deletionOfproduct();

		productAmendment.checkOutbtn();

		String getTextFromYellowAlert = productAmendment.getDisplayedAlert();
		softAlert.assertEquals(getTextFromYellowAlert, prop.getProperty("successMessageAfterDeletingProduct"),
				"Message doesn't Match!");
		softAlert.assertAll();
	}

	@AfterMethod
	public void clearBrowser() {
		tearDown();
	}
	/**
	@DataProvider(name="signUpDataProvider")
	public String[][] readAndFeedLoginDataFromExcel() throws IOException {
		String filePath = "C:\\Users\\priya\\OneDrive\\Desktop";
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		int col = ExcelUtils.getCellCount(filePath, "Sheet1", rows);
		String[][] loginData = new String[rows][col];
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				loginData[i - 1][j] = ExcelUtils.getCellData(filePath, "Sheet1", i, j);
			}
		}
		return loginData;

	}**/

}
