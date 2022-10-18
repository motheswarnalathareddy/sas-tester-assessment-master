package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html",
                "json: cucumber-html-reports/cucumber.json"},
        features = "src/test/java/feature/apiTest.feature",
        glue = {"stepDefinitions"},
       monochrome = true,
      //  tags = "@tags",
        dryRun = false
)
public class TestRunner {
}
