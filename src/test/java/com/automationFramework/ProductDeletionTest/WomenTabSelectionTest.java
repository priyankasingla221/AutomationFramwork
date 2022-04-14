package com.automationFramework.ProductDeletionTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationFramework.Base.TestBase;
import com.automationFramework.ProductDeletion.HomePage;
import com.automationFramework.ProductDeletion.ProductSelection;

public class WomenTabSelectionTest extends TestBase {
	
	HomePage homepage;
	ProductSelection productSelection;
	
	
	@BeforeMethod
	public void setup() {
		initialsation();
		homepage =new HomePage();
		
	}
	
	
	
	
	@AfterMethod
	public void clearBrowser() {
		tearDown();
	}
	
	
	

}
