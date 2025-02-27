package Actions;

import Elements.Ebay_home_elements;
import Steps.Common_steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Ebay_home_actions {

    WebDriver driver;
    Ebay_home_elements ebayHomeElements;

    public Ebay_home_actions(Common_steps common_steps){
        this.driver = common_steps.getDriver();
        ebayHomeElements = new Ebay_home_elements(driver);
    }


    public void clickadvancedlink(){
    ebayHomeElements.advancedpage.click();
    }

    public void searchitem(String searchstring){

        ebayHomeElements.searchfield.sendKeys(searchstring);
    }

    public void clickSearchbtn(){

        ebayHomeElements.searchbutton.click();
    }

    public int searchitemcount(){
        String itemcount1 = ebayHomeElements.item1.getText().trim();
        String itemcount2 = itemcount1.replace(",", "");
        int itemCountInt = Integer.parseInt(itemcount2);
        return itemCountInt;
    }

    public void selectcategory(String option){
       List<WebElement> cat = (List<WebElement>) ebayHomeElements.item2;
        for (WebElement x: cat) {
            if (x.getText().trim().toLowerCase().equals(option.toLowerCase())) {
                x.click();
                break;
            }

        }}}
