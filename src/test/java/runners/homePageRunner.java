package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(

plugin = {"pretty","html:target/index.html"},
        features = "src/test/java/features/homePage.feature",
        glue = "stepDef",
        dryRun = false

)


public class homePageRunner {
}
