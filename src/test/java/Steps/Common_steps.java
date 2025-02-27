package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common_steps {
    private WebDriver driver;


    @Before (order = 1)
    public void setup(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After (order = 1)
    public void teardown() throws InterruptedException {
        driver.quit();
        Thread.sleep(1000);
    }

    @Before(value="@setCookies",order = 0)
    public void setCookies(){
        System.out.println("Scenario specific hook - setCookies executed");
    }

    @After(value ="@Test", order = 0)
    public void tearAfterhook(){
        System.out.println("Scenario specific hook - tearAfterhook executed");
    }

    public WebDriver getDriver(){
        return driver;
    }
}
