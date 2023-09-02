package utilities;

import org.openqa.selenium.support.PageFactory;


public class CommonPage {
    private static CommonPage commonPage;
    public CommonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public CommonPage getCommonPage() {
        if (commonPage== null) {
            commonPage = new CommonPage();
        }
        return commonPage;
    }
}
