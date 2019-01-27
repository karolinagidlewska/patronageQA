package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.MainPage;
import com.Intive.Patronage.tests.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;

public class SignInSteps extends DriverFactory {

    MainPage mainPage = new MainPage(driver);
    SignInPage signInPage = new SignInPage(driver);

    @When("^I click on Sign in link$")
    public void IClickOnSignInLink() {
        mainPage.signInLink.isDisplayed();
        mainPage.signInLink.click();
    }

    @And("^I fill username with phrase \"([^\"]*)\"$")
    public void IFillUsernameWithPhrase(String email) {
        signInPage.emailInput.isDisplayed();
        signInPage.emailInput.sendKeys(email);
    }

    @And("^I fill password with phrase \"([^\"]*)\"$")
    public void iFillPasswordInputWithPhrase(String password) {
        signInPage.passwordInput.isDisplayed();
        signInPage.passwordInput.sendKeys(password);
    }

    @And("^I click on signIn button$")
    public void iClickOnSignInButton() {
        signInPage.signInButton.isDisplayed();
        signInPage.signInButton.click();
    }

    @Then("^I see user account page$")
    public void iWillSeeUserAccountPage() {
        String actualURL = driver.getCurrentUrl();
        assertThat("User should be on User account page", actualURL.equals("http://automationpractice.com/index.php?controller=my-account"));
    }

    @Then("I see sign in error popup")
    public void iWillSeeSignInErrorPopup() {
        Assert.assertTrue(signInPage.errorPopup.isDisplayed());
    }
}
