package utils;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/reports/cucumberReport.html", "json:target/reports/cucumber.json"},
        features = "src/test/resources",
        glue = "steps",
        tags = "@successfulLogin",
        dryRun = false

)
public class CucumberRunner {
}
