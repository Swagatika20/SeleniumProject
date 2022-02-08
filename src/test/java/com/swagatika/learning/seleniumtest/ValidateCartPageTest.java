package com.swagatika.learning.seleniumtest;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.swagatika.learning.seleniumtest.pageobjects.CartPage;


public class ValidateCartPageTest extends BaseClass{
	CartPage CartPageObj;

	@Test
	public void validateCartPageTest() {
		CartPageObj= new CartPage(driver);			
		driver.get("https://www.ebay.com.au/");				
		CartPageObj.searchItem("bike");
		CartPageObj.clickOnSearchButton();
		CartPageObj.selectFirstItem();
		super.switchWindow(1);
		String itemName = CartPageObj.getItemName();
		CartPageObj.clickAddToCart();
		CartPageObj.clickGoToCart();		
		Assert.assertEquals(itemName,CartPageObj.getItemNameDisplayedInTheCart() , "Successful");		

	}
}
