package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Ebay_home_elements {

    WebDriver driver;

    @FindBy(linkText = "Advanced") public WebElement advancedpage;
    @FindBy(xpath = ("//*[@id=\"gh-ac\"]")) public WebElement searchfield;
    @FindBy(id = ("gh-search-btn")) public WebElement searchbutton;
    @FindBy(css = ("h1.srp-controls__count-heading>span.BOLD:first-child")) public WebElement item1;
    @FindBy(xpath = ("//*[@id=\"gh-ac\"]")) public List<WebElement> item2;


    public Ebay_home_elements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
