package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
    private WebDriver driver;


    @FindBy(how = How.ID, using = "submitMessage")
    public WebElement submitButtonContactUs;

    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    public WebElement alertPopUp;




    public ContactUsPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
