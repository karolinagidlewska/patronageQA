package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private WebDriver driver;
    private static String AUTOMATIONPRACT_URL = "http://automationpractice.com";
    public void openAutomationPracticePage() {
        driver.get(AUTOMATIONPRACT_URL);
    }

    @FindBy(how = How.ID, using = "contact-link")
    public WebElement contactUsLink;

    @FindBy(how = How.CLASS_NAME, using = "header_user_info")
    public WebElement signInLink;

    public MainPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
