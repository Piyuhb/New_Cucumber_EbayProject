package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_advancesearch_elements {

    WebDriver driver;

    @FindBy(id=("gh-logo")) public WebElement ebaylogo;
    @FindBy(xpath = ("//input[@id='_nkw']")) public WebElement keyword;
    @FindBy(xpath = ("//input[@id='_ex_kw']")) public WebElement exclude;
    @FindBy(xpath = ("//*[@id=\"s0-1-17-5[2]-@range-comp[]-@range-textbox[]-textbox\"]")) public WebElement min;
    @FindBy(xpath = ("//*[@id=\"s0-1-17-5[2]-@range-comp[]-@range-textbox[]_1-textbox\"]")) public WebElement max;
    @FindBy(xpath = ("//div[@class=\"adv-form__actions\"]//button")) public WebElement searchbtn1;

    public Ebay_advancesearch_elements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
}
