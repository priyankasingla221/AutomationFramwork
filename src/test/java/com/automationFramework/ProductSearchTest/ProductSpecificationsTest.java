package com.automationFramework.ProductSearchTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automationFramework.Base.TestBase;
import com.automationFramework.ProductSearch.ProductAvailability;
import com.automationFramework.ProductSearch.ProductPurchase;
import com.automationFramework.ProductSearch.SearchTab;

public class ProductSpecificationsTest extends TestBase {
	
	SearchTab searchTab;
	ProductAvailability productAvailability;
	ProductPurchase productPurchase;
	SoftAssert softAssert;
	
	@BeforeMethod
	public void setUp() {
		initialsation();
		searchTab = new SearchTab();
		softAssert = new SoftAssert();
		searchTab.inputInsearchTab("Dress");
		productAvailability = searchTab.clickSearch();
		
	}
	
	@Test
	public void getProductSearchInfo() {
		
		productPurchase = productAvailability.productClick();
		productPurchase.clickProductIncrementBtn();
		productPurchase.ClickAddToCartBtn();
		
		String getRedDiscountTagText = productPurchase.getRedDiscountTag();
		//Assert.assertEquals(getRedDiscountTagText, prop.getProperty("redDiscountTagText"),"No Discount Tag Present.");
		softAssert.assertEquals("No Discount Tag Present.", getRedDiscountTagText, prop.getProperty("redDiscountTagText"));
		
		softAssert.assertAll();
	}
	
	@AfterMethod
	public void clearBrowser() {
		tearDown();
	}

}
