package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.ContactUsPage;
import com.Intive.Patronage.tests.pages.MainPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ContactUsSteps extends DriverFactory {

    MainPage mainPage = new MainPage(driver);
    ContactUsPage contactUsPage = new ContactUsPage(driver);


    @Given("^I open automationpractice website$")
    public void iOpenAutomationpracticeWebsite() {
        mainPage.openAutomationPracticePage();
    }

    @When("^I click on ContactUS link$")
    public void iClickOnContactUSLink() {

        mainPage.contactUsLink.isDisplayed();
        mainPage.contactUsLink.click();
    }

    @And("^I click on Send button$")
    public void iClickOnSendButton() {
        contactUsPage.submitButtonContactUs.isDisplayed();
        contactUsPage.submitButtonContactUs.click();

    }

    @Then("^I see error popup$")
    public void iWillSeeErrorPopup() {
        Assert.assertTrue(contactUsPage.alertPopUp.isDisplayed());
    }
}
