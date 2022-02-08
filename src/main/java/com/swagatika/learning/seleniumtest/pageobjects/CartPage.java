package com.swagatika.learning.seleniumtest.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Add To Cart Scenario
/*
 * Developed the testcases by using PageFactory  approach,
 * can also be done using Page Object Model approach
 */
public class CartPage {
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(css = ".ui-autocomplete-input")
	private WebElement serachItemLoc;

	public void searchItem(String value) {
		serachItemLoc.sendKeys(value);
	}
	@FindBy(id = "gh-btn")
	private WebElement serachButtonLoc;

	public void clickOnSearchButton() {
		serachButtonLoc.click();
	}
	@FindBy(css = ".srp-results > li:nth-of-type(2) .s-item__info > A")
	private WebElement selectFirstItemLoc;

	public void selectFirstItem() {
		selectFirstItemLoc.click();
	}
	@FindBy(id = "itemTitle")
	private WebElement itemNameLoc;
	
	public String getItemName() {
		 return itemNameLoc.getText();
	}	
	@FindBy(id = "atc-area")	
	private WebElement addToCartLoc;

	public void clickAddToCart() {
		addToCartLoc.click();
	}	
	@FindBy(xpath = "//span[text()='Go to cart']")
	private WebElement goToCartLoc;

	public void clickGoToCart() {
		goToCartLoc.click();
	}	
	@FindBy(xpath = "//a[@data-test-id='cart-item-link']/span/span")
	private WebElement shoppingCartitemNameLoc;
	
	public String getItemNameDisplayedInTheCart() {
		return shoppingCartitemNameLoc.getText();
	}

}
