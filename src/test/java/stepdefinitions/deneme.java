package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CommonPage;

public class deneme extends CommonPage {

    @Then("User enters city into to box")
    public void user_enters_city_into_to_box () {
        getflightAppUI01().fromBox.sendKeys("Istanbul");
        getflightAppUI01().fromBox.sendKeys(Keys.ENTER);
        getflightAppUI01().toBox.sendKeys("Los Angeles");
        getflightAppUI01().losAngelesr.click();
        String str=(getflightAppUI01().foundItem.getText().replaceAll("\\D",""));
        str=(getflightAppUI01().foundItem.getText().replaceAll("\\D",""));
        System.out.println("str --------- > :"+str);
        int number= Integer.parseInt(str);
        System.out.println(" found item number "+number);
        Assert.assertEquals(getflightAppUI01().foundSizeList.size(),number);

    }
}
