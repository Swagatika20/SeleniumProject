package com.swagatika.learning.seleniumtest;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.swagatika.learning.seleniumtest.pageobjects.LoginPage;


public class  InvalidLoginPageTest extends BaseClass{
	LoginPage loginPageObj;

	@Test
	public void validateEbayTest() {
		loginPageObj= new LoginPage(driver);		
		driver.get("https://www.ebay.com.au/");						
		loginPageObj.mouseOverOnMyEbay();
		loginPageObj.clickOnEbaySummaryLink();
		loginPageObj.clickOnContinue();		
		Assert.assertEquals("Oops, that's not a match.", loginPageObj.getErrorMsg(), "Successful");		

	}
}
