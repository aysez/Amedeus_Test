package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CommonPage;

import static org.yaml.snakeyaml.tokens.Token.ID.Key;

public class FlightAppUI02 extends CommonPage {

    @Then("User enters same city {string} into from box")
    public void user_enters_same_city_into_from_box(String string) {
        getflightAppUI01().fromBox.sendKeys(string);
        getflightAppUI01().fromBox.sendKeys(Keys.ENTER);
        }


    @Then("User enters same city {string} into to box")
    public void user_enters_same_city_into_to_box(String string) {
        getflightAppUI01().toBox.sendKeys(string);
        getflightAppUI01().toBox.sendKeys(Keys.ENTER);
    }

    @When("User displayed empty boxes")
    public void user_displayed_empty_boxes() {
        getMethodUtilitiespage().wait(2);
        Assert.assertNotEquals(getflightAppUI01().fromBox.getText(),getflightAppUI01().toBox.getText());
    }

}
