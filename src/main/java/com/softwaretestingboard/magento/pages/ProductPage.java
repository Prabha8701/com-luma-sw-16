package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//span[@class='base']")
    WebElement productText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath ="//button[@id='product-addtocart-button']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedProductText;

    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='shopping cart']")
    WebElement linkShoppingCart;

    public String verifyOvernightDuffleText() {

        return getTextFromElement(productText);
    }

    public void changeQuantity(String qty) {

        sendTextToElement(changeQty, Keys.BACK_SPACE + qty);


    }

    public void addToCart() {

        clickOnElement(addToCartButton);

    }

    public String verifyProductAddText() {

        return getTextFromElement(addedProductText);
    }

    public void clickOnShoppingCart() {

        clickOnElement(linkShoppingCart);

    }
}
