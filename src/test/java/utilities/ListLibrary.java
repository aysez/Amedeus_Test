package utilities;

import org.openqa.selenium.WebElement;
import pages.CommonPage;

import java.util.ArrayList;
import java.util.List;

public class ListLibrary extends CommonPage {

    public static void cityList(){
        List<String> City = new ArrayList<String>();
        City.add("Istanbul"); City.add("New York");City.add("London");City.add("Paris");
        City.add("Tokyo");City.add("Sydney");City.add("Los Angeles");City.add("Chicago");
        City.add("Beijing");City.add("Dubai");City.add("Singapore");City.add("Hong Kong");
        City.add("Frankfurt");City.add("Madrid");City.add("Rome");
    }
    public void dropdownCity (){
        List<WebElement> dropdownCityList = new ArrayList<WebElement>();
        dropdownCityList.add(getflightAppUI01().DropDownList);
}

}
