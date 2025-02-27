package Actions;

import Elements.Ebay_advancesearch_elements;
import Elements.Ebay_home_elements;
import Steps.Common_steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ebay_advancesearch_actions {

    WebDriver driver;
    Ebay_advancesearch_elements ebay_advancesearch_elements;

    public Ebay_advancesearch_actions(Common_steps common_steps){
        this.driver = common_steps.getDriver();
        ebay_advancesearch_elements = new Ebay_advancesearch_elements(driver);
    }

    public void clickonebaylogo(){
        ebay_advancesearch_elements.ebaylogo.click();
    }

    public void searchkeyword(String string){
        ebay_advancesearch_elements.keyword.sendKeys(string);
    }

    public void searchexclude(String string){
        ebay_advancesearch_elements.exclude.sendKeys(string);
    }

    public void searchmaxvalue(String string){
        ebay_advancesearch_elements.max.sendKeys(string);
    }

    public void searchminvalue(String string){
        ebay_advancesearch_elements.min.sendKeys(string);
    }

    public void searchbtn(){
        ebay_advancesearch_elements.searchbtn1.click();
    }
}
