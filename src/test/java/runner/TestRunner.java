package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@cart", // or @cart or @checkout or @login or @logout or @product or @remove",
        plugin = {"pretty","html:target/cucumber-report.html"}
)

public class TestRunner extends AbstractTestNGCucumberTests{
}
