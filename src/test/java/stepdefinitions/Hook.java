package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonPage;
import utilities.Driver;
import utilities.MethodUtilities;

public class Hook {

    public static WebDriver driver;
    public static CommonPage commonPage;
    public static Actions actions;
    public static boolean isCookiesDeleted = true;
    public static String browserType = "chrome";
    public static Faker faker;
    public static Select select;

    @After(value = "@afterScenarioFinish")
    public void afterScenarioFinish(){
        MethodUtilities.waitFor(3);
        Driver.closeDriver();
    }
}