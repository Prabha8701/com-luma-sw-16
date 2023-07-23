package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(css = "main div h1 span")
    WebElement textShoppingCart;

    @CacheLookup
    @FindBy(css ="[data-th=\"Item\"] div strong a" )
    WebElement textCronusYogaPant;

    @CacheLookup
    @FindBy(css =".item-options>dd:first-of-type" )
    WebElement textSize32;

    @CacheLookup
    @FindBy(css = ".item-options>dd:last-of-type")
    WebElement textBlack;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement getProductNameText;

    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement quantityText;

    @CacheLookup
    @FindBy(xpath ="//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']" )
    WebElement productPriceText;

    @CacheLookup
    @FindBy(xpath ="//input[@title='Qty']" )
    WebElement updateQty;

    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='Update Shopping Cart']" )
    WebElement clickUpdateQty;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement productPriceText1;

    public String getTextShoppingCart() {

        return getTextFromElement(textShoppingCart);
    }

    public String getTextCronusYogaPant() {

        return getTextFromElement(textCronusYogaPant);
    }

    public String getTextSize32() {

        return getTextFromElement(textSize32);
    }

    public String getTextBlack() {

        return getTextFromElement(textBlack);
    }
    public String verifyTheProductName() {

        return getTextFromElement(getProductNameText);}
/*
   public String verifyTheQuantityNumber() throws InterruptedException {
      Thread.sleep(3000);
      return getAttributeValueFromElement(quantityText);
  }*/

    public String verifyTheProductPrice() {

        return getTextFromElement(productPriceText);}

    public void updateTheQuantity(String qty) throws InterruptedException {

        sendTextToElement(updateQty, Keys.BACK_SPACE + qty);

    }


    public void clickOnUpdateShoppingCart() {

        clickOnElement(clickUpdateQty);

    }

    public String verifyTheProductPrice1() {

        return getTextFromElement(productPriceText1);}
}
