package utilities;

import org.openqa.selenium.WebElement;
import pages.CommonPage;

import java.util.ArrayList;
import java.util.List;

public class ListLibrary extends CommonPage {
    //
    public void cityList() {
        List<String> City = new ArrayList<String>();
        City.add("Istanbul");
        City.add("New York");
        City.add("London");
        City.add("Paris");
        City.add("Tokyo");
        City.add("Sydney");
        City.add("Los Angeles");
        City.add("Chicago");
        City.add("Beijing");
        City.add("Dubai");
        City.add("Singapore");
        City.add("Hong Kong");
        City.add("Frankfurt");
        City.add("Madrid");
        City.add("Rome");
    }

    public void foundCity() {
        List<WebElement> foundCityList = new ArrayList<WebElement>();
        foundCityList.add(getflightAppUI01().foundList);
    }


    public void istanbul() {
        List<String> istanbul = new ArrayList<String>();
        istanbul.add("Los Angeles");
        istanbul.add("Beijing");
        istanbul.add("Singapore");
        istanbul.add("Madrid");
        istanbul.add("Rome");
    }

    public void newYork() {
        List<String> newYork = new ArrayList<String>();
        newYork.add("London");
        newYork.add("Paris");
        newYork.add("Sydney");
    }

    public void london() {
        List<String> london = new ArrayList<String>();
        london.add("Los Angeles");
        london.add("Rome");
    }

    public void paris() {
        List<String> paris = new ArrayList<String>();
        paris.add("Istanbul");
        paris.add("Tokyo");
        paris.add("Dubai");
    }

    public void tokyo() {
        List<String> tokyo = new ArrayList<String>();
        tokyo.add("New York");
        tokyo.add("Madrid");
    }

    public void sydney() {
        List<String> sydney = new ArrayList<String>();
        sydney.add("Chicago");
    }

    public void losAngeles() {
        List<String> losAngeles = new ArrayList<String>();
        losAngeles.add("London");
        losAngeles.add("Sydney");
        losAngeles.add("Chicago");
        losAngeles.add("Dubai");
    }

    public void chicago() {
        List<String> chicago = new ArrayList<String>();
        chicago.add("Hong Kong");
        chicago.add("Beijing");
    }

    public void beijing() {
        List<String> beijing = new ArrayList<String>();
        beijing.add("Dubai");
    }

    public void dubai() {
        List<String> dubai = new ArrayList<String>();
        dubai.add("Singapore");
    }

    public void singapore() {
        List<String> singapore = new ArrayList<String>();
        singapore.add("Frankfurt");
    }

    public void hongKong() {
        List<String> hongKong = new ArrayList<String>();
        hongKong.add("Singapore");
        hongKong.add("Frankfurt");
    }

    public void frankfurt() {
        List<String> frankfurt = new ArrayList<String>();
        frankfurt.add("Madrid");
    }

    public void madrid() {
        List<String> madrid = new ArrayList<String>();
        madrid.add("Rome");
    }
}
