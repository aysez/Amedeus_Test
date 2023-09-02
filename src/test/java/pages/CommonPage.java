package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ListLibrary;
import utilities.MethodUtilities;


public class CommonPage {
    private static CommonPage commonPage;

    private static FlightAppUI01 flightAppUI01page;

    private static MethodUtilities methodUtilitiespage;

    private static ListLibrary listLibrarypage;

    public CommonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public CommonPage getCommonPage() {
        if (commonPage == null) {
            commonPage = new CommonPage();
        }
        return commonPage;
    }

    public FlightAppUI01 getflightAppUI01() {
        if (flightAppUI01page == null) {
            flightAppUI01page = new FlightAppUI01();
        }
        return flightAppUI01page;
    }

    public MethodUtilities getMethodUtilitiespage() {
        if (methodUtilitiespage == null) {
            methodUtilitiespage = new MethodUtilities();
        }
        return methodUtilitiespage;
    }

    public ListLibrary getListLibrarypage() {
        if (listLibrarypage == null) {
            listLibrarypage = new ListLibrary();
        }
        return listLibrarypage;
    }
}
