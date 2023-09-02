package utilities;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import pages.CommonPage;

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
}
