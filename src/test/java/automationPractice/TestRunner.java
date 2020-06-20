package automationPractice;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/features/",
                tags = "@smoke1, @smoke2",
                plugin = "html:target/cucumber-reports")
public class TestRunner {
}
