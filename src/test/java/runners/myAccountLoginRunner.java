package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

plugin = {"pretty","html:target/index.html"},
        features = "src/test/java/features/myAccountLogin.feature",
        glue = "stepDef",
        dryRun = false

)


public class myAccountLoginRunner {
}
