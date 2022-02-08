package com.swagatika.learning.seleniumtest;


import org.testng.annotations.Test;

import com.swagatika.learning.seleniumtest.pageobjects.EBayAddToCart;
import com.swagatika.learning.seleniumtest.pageobjects.EBayILogin;


public class EbayMainTest extends BaseClass{
	EBayAddToCart ebayAddToCartObj;
	EBayILogin ebayLoginObj;

	@Test
	public void validateEbayTest() {
		ebayAddToCartObj= new EBayAddToCart(driver);
		ebayLoginObj= new EBayILogin(driver);
		
		driver.get("https://www.ebay.com.au/");
		
		
		ebayAddToCartObj.searchBike("bike");
		ebayAddToCartObj.clickOnSearchButton();
		ebayAddToCartObj.selectFirstItem();
		super.switchWindow(1);
		ebayAddToCartObj.getItemName();
		ebayAddToCartObj.clickAddToCart();
		ebayAddToCartObj.clickGoToCart();
		ebayAddToCartObj.verifyIfItemDisplayedInCart();
		
		ebayLoginObj.mouseOverOnMyEbay();
		ebayLoginObj.clickOnEbaySummaryLink();
		ebayLoginObj.clickOnContinue();
		ebayLoginObj.verifyErrorMsg("Oops, that's not a match.");
		
		

	}
}
