package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.CommonPage;

public class FlightAppUI03 extends CommonPage {

    @Then("User enters city {string} into from box")
    public void user_enters_city_into_from_box(String string) {
        getflightAppUI01().fromBox.sendKeys(string);
        getflightAppUI01().fromBox.sendKeys(Keys.ENTER);
    }

    @Then("User enters city into to box")
    public void user_enters_city_into_to_box () {

    }
    }



