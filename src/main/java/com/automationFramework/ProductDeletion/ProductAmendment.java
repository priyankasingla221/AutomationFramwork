package com.automationFramework.ProductDeletion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationFramework.Base.TestBase;
import com.automationFramework.Utils.Utils;

public class ProductAmendment extends TestBase {
	
	public ProductAmendment() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(5);
		
	}
	
	@FindBy(className = "cart_quantity_delete")
	WebElement deleteProductFromCart;
	
	@FindBy(xpath = "//p[text()='Your shopping cart is empty.']")
	WebElement displayedAlert;
	
	@FindBy(css=".button.btn.btn-default.standard-checkout.button-medium")
	WebElement checkOutBtn;
	public void deletionOfproduct() {
		//deleteProductFromCart.click();
		Utils.clickOnElement(deleteProductFromCart);
	}
	
	public String getDisplayedAlert() {
		return displayedAlert.getText();
		
	}
	
	public ProductAmendment checkOutbtn() {
		//checkOutBtn.click();
		Utils.clickOnElement(checkOutBtn);
		return new ProductAmendment();
	}

}
