package utilities;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import pages.CommonPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.driver;

public class MethodUtilities extends CommonPage {

    public static void wait(int secs) {
        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (java.util.NoSuchElementException e) {
            e.printStackTrace();
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("test_url"));
    }

    public Object printUrl() {
        String printUrl = driver.getCurrentUrl();
        System.out.println(printUrl);
        return printUrl;
    }

    public boolean verifyElementNotDisplayed(WebElement element) {
        try {
            assertFalse("Element should not be visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean verifyElementDisplayed(WebElement element) {
        try {
            assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element not found: " + element);
        }
        return true;
    }
}
