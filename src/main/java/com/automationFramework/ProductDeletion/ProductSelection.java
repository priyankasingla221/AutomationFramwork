package com.automationFramework.ProductDeletion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationFramework.Base.TestBase;
import com.automationFramework.Utils.Utils;

public class ProductSelection extends TestBase{
	
	public ProductSelection() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(5);
	}
	
	@FindBy(css="img[title='Faded Short Sleeve T-shirts']")
	WebElement product;
	
	public ProductSpecification productClick() {
		//product.click();
		Utils.clickOnElement(product);
		wd.switchTo().frame(0);
		return new ProductSpecification();
		
	}


}
