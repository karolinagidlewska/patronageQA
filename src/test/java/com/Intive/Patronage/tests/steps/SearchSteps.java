package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.MainPage;
import com.Intive.Patronage.tests.pages.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchSteps extends DriverFactory {

    MainPage mainPage = new MainPage(driver);
    SearchPage searchPage = new SearchPage(driver);

    @When("^I search for product with phrase \"([^\"]*)\"$")
    public void iSearchForProductWithPhrase(String productName) {
        mainPage.searchBox.sendKeys(productName);
    }

    @And("^I click enter$")
    public void iClickEnter() {
        mainPage.searchBox.sendKeys(Keys.ENTER);
    }

    @Then("^I see product with title \"([^\"]*)\"$")
    public void iSeeProductWithTitle(String title) {
        assertEquals(title, searchPage.productElement.getText());
    }

    @When("^I click search button$")
    public void iClickSearchButton() {
        searchPage.searchButton.click();
    }

    @Then("^I see product warning popup with phrase \"([^\"]*)\"$")
    public void iSeeWarningPopup(String warning) {
        assertTrue(searchPage.searchWarning.isDisplayed());
        assertEquals(warning, searchPage.searchWarning.getText());
    }

    @Then("^I see product warning popup with phrase \"([^\"]*)\" for searching \"([^\"]*)\"$")
    public void iSeeWarningPopup(String warning, String forSearching) {
        assertTrue(searchPage.searchWarning.isDisplayed());
        assertEquals(warning + " \"" + forSearching + "\"", searchPage.searchWarning.getText());
    }

    @Then("^I see more than one product$")
    public void iSeeMoreThanOneProduct() {
        String[] counterText = searchPage.counterElement.getText().split(" ");
        int count = Integer.parseInt(counterText[0]);
        assertTrue(count > 1);
    }
}
