package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FlightAppUI extends CommonPage {

    @FindBy(id="headlessui-combobox-input-:Rqhlla:")
    public WebElement toBox;

    @FindBy(id="headlessui-combobox-input-:Rq9lla:")
    public WebElement fromBox;
    @FindBy(xpath="//ul[@role='list']//dl")
    public List<WebElement> foundSizeList;
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

    @FindBy(xpath = "//p[@*='mb-10']")
    public WebElement foundItem;

    @FindBy(xpath = "//span[text()='Los Angeles']")
    public WebElement losAngelesr;
}
