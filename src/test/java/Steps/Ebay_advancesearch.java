package Steps;

import Actions.Common_actions;
import Actions.Ebay_advancesearch_actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.fail;

public class Ebay_advancesearch {

    Common_actions common_actions;
    Ebay_advancesearch_actions ebay_advancesearch_actions;

    public Ebay_advancesearch(Common_actions common_actions, Ebay_advancesearch_actions ebay_advancesearch_actions){
        this.common_actions = common_actions;
        this.ebay_advancesearch_actions = ebay_advancesearch_actions;
    }

    @Given("I am in Ebay Advanced search page")
    public void i_am_in_ebay_advanced_search_page() {
        common_actions.gotoUrl("https://ebay.com/sch/ebayadvsearch");
    }

    @When("I click on Ebay logo")
    public void i_click_on_ebay_logo() {
       ebay_advancesearch_actions.clickonebaylogo();
    }

    @Then("I should navigate back to Ebay Home page")
    public void i_should_navigate_back_to_ebay_home_page() {
        String expUrl = "https://www.ebay.com/";
        String actUrl = common_actions.getCurrenturl();
        if (!expUrl.equals(actUrl)){
            fail("Page does not navigate to Ebay Home page");
        }
    }

    @When("I Search an item")
    public void i_search_an_item(DataTable dataTable) throws InterruptedException {

        ebay_advancesearch_actions.searchkeyword(dataTable.cell(1,0));
        ebay_advancesearch_actions.searchexclude(dataTable.cell(1,1));
        ebay_advancesearch_actions.searchminvalue(dataTable.cell(1,2));
        ebay_advancesearch_actions.searchmaxvalue(dataTable.cell(1,3));
        ebay_advancesearch_actions.searchbtn();
        Thread.sleep(3000);

    }
}
