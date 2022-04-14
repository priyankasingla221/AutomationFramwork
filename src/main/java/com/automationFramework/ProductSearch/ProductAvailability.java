package com.automationFramework.ProductSearch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationFramework.Base.TestBase;
import com.automationFramework.Utils.Utils;


public class ProductAvailability extends TestBase{
	
	public ProductAvailability() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(15);
	}
	
	@FindBy(css = "img[title='Printed Chiffon Dress']")
	WebElement summerDress;

	public ProductPurchase productClick() {
		//summerDress.click();
		Utils.clickOnElement(summerDress);
		//wd.switchTo().frame(0);
		return new ProductPurchase();
		
	}

}
