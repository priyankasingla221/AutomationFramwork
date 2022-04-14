package com.automationFramework.ProductDeletion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationFramework.Base.TestBase;
import com.automationFramework.Utils.Utils;

public class WomenTabSelection extends TestBase{
	
	public WomenTabSelection() {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(5);
	}
	
	@FindBy(className = "sf-with-ul")
	WebElement womensTab;
	
	
	public ProductSelection navigatingToWomenTab() {
		//womensTab.click();
		Utils.clickOnElement(womensTab);
		return new ProductSelection();
		
	}
	
	
}
