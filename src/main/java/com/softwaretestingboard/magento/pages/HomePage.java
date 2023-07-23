package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement tops;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jackets;

    @CacheLookup
    @FindBy(css = "li.level0.nav-3>a.level-top.ui-corner-all>span:nth-of-type(1)")
    WebElement menMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-18 span")
    WebElement menBottoms;

    @CacheLookup
    @FindBy(css = "#ui-id-23 span")
    WebElement menPants;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearMenu;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement begs;

    public void mouseHoverToMenMenu() {

        mouseHoverToElement(menMenu);

    }

    public void mouseHoverToMenBottoms() {

        mouseHoverToElement(menBottoms);

    }

    public void clickOnPants() {

        mouseHoverToElementAndClick(menPants);

    }

    public void mouseHoverOnWomenMenu() {

        mouseHoverToElement(womenMenu);

    }

    public void mouseHoverOnTops() {

        mouseHoverToElement(tops);

    }

    public void clickOnJackets() {

        mouseHoverToElementAndClick(jackets);

    }

    public void mouseHOverOnGearManu() {

        mouseHoverToElement(gearMenu);

    }

    public void clickOnBags() {

        mouseHoverToElementAndClick(begs);

    }

}
