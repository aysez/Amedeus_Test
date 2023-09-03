package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightAppUI extends CommonPage {

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

    @FindBy(id="headlessui-combobox-label-:R69lla:")
    public WebElement fromHeader;

    @FindBy(id="headlessui-combobox-label-:R6hlla:")
    public WebElement toHeader;

    @FindBy(xpath = "//body/main/p[text()='⚠\uFE0FHer şehir arasında uçuş olmadığı için bazı sorgulardan cevap dönmeyecektir.']")
    public WebElement atentionMessage1;

    @FindBy(xpath = "//body/main/p[text()='“From: Istanbul”, “To: Los Angeles” seçtiğinde iki adet uçuş listelendiğini görmelisin.']")
    public WebElement atentionMessage2;


    @FindBy(xpath = "//ul[@role=\"list\"]//li[@class=\"overflow-hidden rounded-xl border border-gray-200\"]")
    public WebElement foundList;

    @FindBy(xpath = "//div/div/p[text()='2']")
    public WebElement foundItemNumber;

    @FindBy(xpath = "(//li[@class='overflow-hidden rounded-xl border border-gray-200'])[1]")
    public WebElement foundListMember;
}
