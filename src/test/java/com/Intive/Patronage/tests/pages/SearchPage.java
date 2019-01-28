package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[@class='product-container']//a[@class='product-name']")
    public WebElement productElement;

    @FindBy(how = How.CLASS_NAME, using = "alert-warning")
    public WebElement searchWarning;

    @FindBy(how = How.XPATH, using = "//form[@id='searchbox']//button[@type='submit']")
    public WebElement searchButton;

    @FindBy(how = How.CLASS_NAME, using = "heading-counter")
    public WebElement counterElement;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
