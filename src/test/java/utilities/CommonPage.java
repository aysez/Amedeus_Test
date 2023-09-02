package utilities;

import org.openqa.selenium.support.PageFactory;
import pages.FlightAppUI01;


public class CommonPage {
    private static CommonPage commonPage;

    private static FlightAppUI01 flightAppUI01page;

    private static MethodUtilities methodUtilitiespage;

    public CommonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public CommonPage getCommonPage() {
        if (commonPage== null) {
            commonPage = new CommonPage();
        }
        return commonPage;
    }
    public FlightAppUI01 getflightAppUI01() {
        if (flightAppUI01page== null) {
            flightAppUI01page = new FlightAppUI01();
        }
        return flightAppUI01page;
    }

    public MethodUtilities getMethodUtilitiespage() {
        if (methodUtilitiespage== null) {
            methodUtilitiespage = new MethodUtilities();
        }
        return methodUtilitiespage;
    }
}
