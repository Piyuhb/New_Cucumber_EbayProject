package Actions;

import Steps.Common_steps;
import org.openqa.selenium.WebDriver;

public class Common_actions {

    private WebDriver driver;

    Common_steps common_steps;

    public Common_actions(Common_steps common_steps){
        this.driver= common_steps.getDriver();
    }

    public void gotoUrl(String url){
        driver.get(url);
    }

    public String getCurrenturl(){
        return driver.getCurrentUrl();
    }

    public String getCurrentTitle(){
        return driver.getTitle();
    }

    public void quitwebdriver(){
        driver.quit();
    }

}
