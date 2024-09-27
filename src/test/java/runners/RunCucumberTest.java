package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = {
                "steps"

        },
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber-reports/cucumber.json",
                "rerun:target/cucumber-reports/rerun.txt",

        })
public class RunCucumberTest extends AbstractTestNGCucumberTests {}
