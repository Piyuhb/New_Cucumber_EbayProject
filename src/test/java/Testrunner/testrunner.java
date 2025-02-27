package Testrunner;

        import io.cucumber.junit.Cucumber;
        import io.cucumber.junit.CucumberOptions;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"Features"},
        glue = {"Steps"},
        plugin = {"pretty","json:target/json-report/cucumber.json"},
        dryRun = false,
        monochrome = true
        //tags = "@S6"
       // name="Logo"
)

public class testrunner {


}
