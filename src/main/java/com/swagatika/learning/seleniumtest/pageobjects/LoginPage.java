package com.swagatika.learning.seleniumtest.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Login Scenario
public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@title='My eBay']")
	private WebElement accountDropDownLoc;

	public void mouseOverOnMyEbay() {
		new Actions(driver).moveToElement(accountDropDownLoc).build().perform();
	}
	@FindBy(xpath = "//A[contains(text(),'My eBay Summary')]")
	private WebElement myEbaySummaryLoc;

	public void clickOnEbaySummaryLink() {
		myEbaySummaryLoc.click();
	}
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueButtonLoc;

	public void clickOnContinue() {
		continueButtonLoc.click();
	}
	@FindBy(id = "errormsg")
	private WebElement errorMsgLoc;

	public String getErrorMsg() {
		return errorMsgLoc.getText();
	}
	
}