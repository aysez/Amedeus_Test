package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonPage;

public class FlightAppUI01 extends CommonPage {

    @FindBy(id="headlessui-combobox-input-:Rqhlla:")
    public WebElement toBox;

    @FindBy(id="headlessui-combobox-button-:R1ahlla:")
    public WebElement toBoxArrow;

    @FindBy(id="headlessui-combobox-input-:Rq9lla:")
    public WebElement fromBox;
    @FindBy(id="headlessui-combobox-button-:R1a9lla:")
    public WebElement fromBoxArrow;

    @FindBy(xpath = "//ul[@role=\"listbox\"]//li[@class=\"relative cursor-default select-none py-2 pl-3 pr-9 text-gray-900")
    public WebElement DropDownList;
}
