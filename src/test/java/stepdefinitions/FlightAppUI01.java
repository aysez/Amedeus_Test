package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CommonPage;

import static stepdefinitions.Hook.faker;


public class FlightAppUI01 extends CommonPage {

    @Given("User goes to url")
    public void user_goes_to_url() {
        getMethodUtilitiespage().navigateToUrl();
    }

    @When("User verifies url")
    public void user_verifies_url() {
     Assert.assertEquals(getMethodUtilitiespage().printUrl(),"https://flights-app.pages.dev/");
    }

    @When("User displayed from header")
    public void user_displayed_from_header() {
        getflightAppUI01().fromHeader.isDisplayed();
    }

    @Then("User click from box")
    public void user_click_from_box() {
        getflightAppUI01().fromBox.isDisplayed();
        getflightAppUI01().fromBox.isEnabled();
        getflightAppUI01().fromBox.click();
    }

    @Then("User enters departing city into from box")
    public void user_enters_departing_city_into_from_box() {
        getflightAppUI01().fromBox.sendKeys("Istanbul");
        getflightAppUI01().fromBox.getText().contains("Istanbul");
    }

    @When("User displayed to header")
    public void user_displayed_to_header() {
    getflightAppUI01().toHeader.isDisplayed();
    }

    @Then("User click to box")
    public void user_click_to_box() {
        getflightAppUI01().toBox.isDisplayed();
        getflightAppUI01().toBox.isEnabled();
        getflightAppUI01().toBox.click();
    }

    @Then("User enters destination city into to box")
    public void user_enters_destination_city_into_to_box() {
        getflightAppUI01().toBox.sendKeys("Sydney");
        getflightAppUI01().toBox.getText().contains("Sydney");
    }

    @When("User displayed attention note")
    public void user_displayed_attention_note() {
        Assert.assertEquals(getflightAppUI01().atentionMessage1.getText(),"⚠\uFE0FHer şehir arasında uçuş olmadığı için bazı sorgulardan cevap dönmeyecektir.");
        Assert.assertEquals(getflightAppUI01().atentionMessage2.getText(),"“From: Istanbul”, “To: Los Angeles” seçtiğinde iki adet uçuş listelendiğini görmelisin.");
    }


    @Then("User enters negative departing info into from box")
    public void user_enters_negative_departing_info_into_from_box() {
        getMethodUtilitiespage().wait(2);
        getflightAppUI01().fromBox.sendKeys("Boden");
        getflightAppUI01().fromBox.sendKeys(Keys.ENTER);
        getflightAppUI01().fromBox.getText().contains("");
        if (faker != null) {getflightAppUI01().fromBox.sendKeys(faker.number().digits(12));}
        getflightAppUI01().fromBox.sendKeys(Keys.ENTER);
        getflightAppUI01().fromBox.getText().contains("");
        if (faker != null) {String characters = faker.number().digits(3)+faker.letterify(String.valueOf(2)+faker.number().digits(4));
        getflightAppUI01().fromBox.sendKeys(characters);}
        getflightAppUI01().fromBox.sendKeys(Keys.ENTER);
        getflightAppUI01().fromBox.getText().contains("");

    }

    @Then("User enters negative destination info into to box")
    public void user_enters_negative_destination_info_into_to_box() {
        getflightAppUI01().toBox.sendKeys("Boden");
        getflightAppUI01().toBox.sendKeys(Keys.ENTER);
        getflightAppUI01().toBox.getText().contains("");
        if (faker != null) {getflightAppUI01().toBox.sendKeys(faker.number().digits(8));}
        getflightAppUI01().toBox.sendKeys(Keys.ENTER);
        getflightAppUI01().toBox.getText().contains("");
        if (faker != null) {String characters2 = faker.number().digits(3)+faker.letterify(String.valueOf(2)+faker.number().digits(4));
        getflightAppUI01().toBox.sendKeys(characters2);}
        getflightAppUI01().toBox.sendKeys(Keys.ENTER);
        getflightAppUI01().toBox.getText().contains("");

    }

}
