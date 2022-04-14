package com.automationFramework.ProductSearch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationFramework.Base.TestBase;
import com.automationFramework.Utils.Utils;


public class ProductPurchase extends TestBase{
	
	public ProductPurchase() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(15);
	}

	@FindBy(css =".btn.btn-default.button-plus.product_quantity_up")
	WebElement productIncrement;
	
	@FindBy(id ="add_to_cart")
	WebElement addToCartBtn;
	
	@FindBy(id= "reduction_percent_display")
	WebElement redDiscountTag;
	
	public void clickProductIncrementBtn(){
		//wd.switchTo().frame(0);
		//productIncrement.click();
		Utils.clickOnElement(productIncrement);
		
	}
	public String getRedDiscountTag() {
		return redDiscountTag.getText();
	}
	public ProductPurchase ClickAddToCartBtn() {
		//addToCartBtn.click();
		Utils.clickOnElement(addToCartBtn);
		return new ProductPurchase();
		
	}
	
}
