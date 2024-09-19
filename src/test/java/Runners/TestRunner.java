package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features", // Path to the .feature files
        glue = "Steps", // Package containing the step definitions
        plugin = {"pretty", "html:target/SwagLabsWEB-reports.html"}, // Reporting plugins
        monochrome = true // Console output formatting
)
public class TestRunner extends AbstractTestNGCucumberTests {
}