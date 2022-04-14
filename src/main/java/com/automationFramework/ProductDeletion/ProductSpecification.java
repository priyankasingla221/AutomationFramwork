package com.automationFramework.ProductDeletion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automationFramework.Base.TestBase;
import com.automationFramework.Utils.Utils;

import bsh.util.Util;

public class ProductSpecification extends TestBase{
	
	public ProductSpecification() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(5);
		
	}

	@FindBy(css=".btn.btn-default.button-plus.product_quantity_up")
	WebElement quantityIncrement;
	
	@FindBy(css=".form-control.attribute_select.no-print")
	WebElement size;
	
	@FindBy(css="button[type='submit'][name ='Submit']")
	WebElement addToCartBtn;
	
	public void quantityAddition() {
		//quantityIncrement.click();
		Utils.clickOnElement(quantityIncrement);
		
	}
	public void sizeChange() {
		//Select sc = new Select(size);
		//sc.selectByVisibleText("L");
		Utils.selectFromDropDownUsingVisibleText(size, "L");
	}
	
	public ProductAmendment addtoCartBtn() {
		addToCartBtn.submit();
		return new ProductAmendment();
	}

}
