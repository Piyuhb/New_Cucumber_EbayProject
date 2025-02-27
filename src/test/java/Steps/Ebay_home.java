package Steps;

import Actions.Common_actions;
import Actions.Ebay_home_actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class Ebay_home {

Common_actions common_actions;
Ebay_home_actions ebay_home_actions;

public Ebay_home(Common_actions common_actions,Ebay_home_actions ebay_home_actions){

    this.common_actions = common_actions;
    this.ebay_home_actions = ebay_home_actions;
}

    @Given("I am at Ebay Home page")
    public void i_am_at_ebay_home_page() {
    common_actions.gotoUrl("https://www.ebay.com/");
    }

    @When("I click on Advanced link")
    public void i_click_on_advanced_link() {
        ebay_home_actions.clickadvancedlink();

    }

    @Then("I should navigate to Advanced Search Page")
    public void i_should_navigate_to_advanced_search_page() {
        String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
        String actUrl = common_actions.getCurrenturl();
                if (!expUrl.equals(actUrl)){
                    fail("Page does not navigate to Advanced link page");
        }
    }

    @When("I search for {string}")
    public void i_search_for_i_phone(String str){
        ebay_home_actions.searchitem(str);
        ebay_home_actions.clickSearchbtn();

    }
    @Then("I should get atleast {int} search items")
    public void i_should_get_atleast_search_items(Integer integer) {
     int itemCountInt = ebay_home_actions.searchitemcount();
     if (itemCountInt <= integer){
        fail("Less than 1000 results is seen");
     }
    }

    @When("I search for {string} in {string} category")
    public void i_search_for_in_category(String string, String string2) throws InterruptedException {
        ebay_home_actions.searchitem(string);
        ebay_home_actions.selectcategory(string2);
        ebay_home_actions.clickSearchbtn();
            }
        }
