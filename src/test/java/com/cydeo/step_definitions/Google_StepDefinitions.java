package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
        googleSearchPage.rejectCookieButton.click();
        BrowserUtils.sleep(1);
    }

    @When("user enters {string} in the Google search box")
    public void userEntersInTheGoogleSearchBox(String searchKey) {
        googleSearchPage.searchBox.sendKeys(searchKey);
        BrowserUtils.sleep(1);
    }

    @Then("user clicks on the search button")
    public void userClicksOnTheSearchButton() {
        googleSearchPage.searchBox.click();
        googleSearchPage.searchBox.sendKeys(Keys.ENTER);
        BrowserUtils.sleep(1);
    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String expectedTitle) {
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

}
