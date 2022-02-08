package com.swagatika.learning.seleniumtest.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EBayAddToCart {
	WebDriver driver;
    String itemName;
	public EBayAddToCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//input[@placeholder='Search for anything']")
	private WebElement serachItemXpath;

	public void searchBike(String value) {
		serachItemXpath.sendKeys(value);
	}
	@FindBy(xpath = "//input[@id='gh-btn' and @type='submit']")
	private WebElement serachButtonXpath;

	public void clickOnSearchButton() {
		serachButtonXpath.click();
	}
	@FindBy(xpath = "//li[contains(@class,'s-item ')]//h3[text()='NORFLEX 26\" Mountain Bike Shimano Full suspension Fat Tire 7 Speed Bicycle Black']")
	private WebElement selectFirstItemXpath;

	public void selectFirstItem() {
		selectFirstItemXpath.click();
	}

	@FindBy(xpath = "//*[@id='itemTitle']")
	private WebElement itemNameXpath;
	
	public void getItemName() {
		itemName = itemNameXpath.getText();
	}
	
	@FindBy(xpath = "//A[contains(text(),'Add to cart')]")
	private WebElement addToCartXpath;

	public void clickAddToCart() {
		addToCartXpath.click();
	}	
	@FindBy(xpath = "//span[text()='Go to cart']")
	private WebElement goToCartXpath;

	public void clickGoToCart() {
		goToCartXpath.click();
	}
	
	@FindBy(xpath = "//A[@data-test-id='cart-item-link']/span/span")
	private WebElement shoppingCartitemNameXpath;
	
	public void verifyIfItemDisplayedInCart() {
		Assert.assertEquals(itemName, shoppingCartitemNameXpath.getText(), "Successful");
	}
	


}
