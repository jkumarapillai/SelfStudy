package runner;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features="src/test/resources/Features",glue="StepDefinitions",tags="@Test01",
		plugin= {"pretty", "html:target/cucumber-reports" },monochrome=true)

public class NewTest {
 
}
