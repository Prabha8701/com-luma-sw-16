package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PantsPage extends Utility {
    @CacheLookup
    @FindBy(css = ".product-item-link")
    WebElement productName;
    @CacheLookup
    @FindBy(css = "[data-role=\"swatch-option-880\"][data-rendered=\"true\"] .swatch-option.text")
    WebElement  size32;
    @CacheLookup
    @FindBy(css = "[data-role=\"swatch-option-880\"][data-rendered=\"true\"] .swatch-option.text")
    WebElement colourBlack;
    @CacheLookup
    @FindBy(css = ".action.tocart.primary")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(css = "[data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]")
    WebElement addedPant;
    @CacheLookup
    @FindBy(css = ".message-success.success.message div a")
    WebElement linkShoppingCart;

    public void hoverAndClickProduct() {

        mouseHoverToElement(productName);

        mouseHoverToElementAndClick(size32);

    }

    public void hoverAndClickProductColour() {

        mouseHoverToElement(productName);

        mouseHoverToElementAndClick(colourBlack);

    }

    public void hoverAndClickOnAddToCartButton() {

        mouseHoverToElement(productName);

        mouseHoverToElementAndClick(addToCartButton);
    }

    public String getTextAddedPantToShoppingCart() {

        return getTextFromElement(addedPant);
    }

    public void clickOnShoppingCart() {

        clickOnElement(linkShoppingCart);

    }
}
