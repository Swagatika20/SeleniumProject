package com.swagatika.learning.seleniumtest;


import org.testng.annotations.Test;

import com.swagatika.learning.seleniumtest.pageobjects.EBayAddToCart;
import com.swagatika.learning.seleniumtest.pageobjects.EBayInvalidLogin;


public class EbayMainTest extends BaseClass{
	EBayAddToCart ebayAddToCartObj;
	EBayInvalidLogin ebayInvalidLoginObj;

	@Test
	public void validateEbayTest() {
		ebayAddToCartObj= new EBayAddToCart(driver);
		ebayInvalidLoginObj= new EBayInvalidLogin(driver);
		
		driver.get("https://www.ebay.com.au/");
		
		
		ebayAddToCartObj.searchBike("bike");
		ebayAddToCartObj.clickOnSearchButton();
		ebayAddToCartObj.selectFirstItem();
		super.switchWindow(1);
		ebayAddToCartObj.getItemName();
		ebayAddToCartObj.clickAddToCart();
		ebayAddToCartObj.clickGoToCart();
		ebayAddToCartObj.verifyIfItemDisplayedInCart();
		
		ebayInvalidLoginObj.mouseOverOnMyEbay();
		ebayInvalidLoginObj.clickOnEbaySummaryLink();
		ebayInvalidLoginObj.clickOnContinue();
		ebayInvalidLoginObj.verifyErrorMsg("Oops, that's not a match.");
		
		

	}
}
