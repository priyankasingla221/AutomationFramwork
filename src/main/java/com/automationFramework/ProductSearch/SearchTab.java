package com.automationFramework.ProductSearch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationFramework.Base.TestBase;
import com.automationFramework.Utils.Utils;

public class SearchTab extends TestBase{
	
	public SearchTab () {
		PageFactory.initElements(wd, this);
		waitForDocumentCompleteState(15);
	}
	
	@FindBy(id="search_query_top")
	WebElement searchInput;
	
	@FindBy(css= ".btn.btn-default.button-search")
	WebElement clickSearchBtn;
	
	public void inputInsearchTab(String productSearch) {
		searchInput.sendKeys(productSearch);
		
	}
	
	public ProductAvailability clickSearch() {
		Utils.clickOnElement(clickSearchBtn);
		return new ProductAvailability();
	}
}
