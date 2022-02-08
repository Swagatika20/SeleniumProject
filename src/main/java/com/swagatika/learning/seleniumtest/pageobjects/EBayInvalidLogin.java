package com.swagatika.learning.seleniumtest.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EBayInvalidLogin {

	WebDriver driver;

	public EBayInvalidLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//A[@title='My eBay']")
	private WebElement myEbayXpath;

	public void mouseOverOnMyEbay() {
		new Actions(driver).moveToElement(myEbayXpath).build().perform();
	}

	@FindBy(xpath = "//A[contains(text(),'My eBay Summary')]")
	private WebElement myEbaySummaryXpath;

	public void clickOnEbaySummaryLink() {
		myEbaySummaryXpath.click();
	}
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueButtonXpath;

	public void clickOnContinue() {
		continueButtonXpath.click();
	}
	@FindBy(xpath = "//p[@id='errormsg']")
	private WebElement errorMsgXath;

	public void verifyErrorMsg(String errorMsg) {
		Assert.assertEquals(errorMsg, errorMsgXath.getText(), "Successful");
	}
	
}