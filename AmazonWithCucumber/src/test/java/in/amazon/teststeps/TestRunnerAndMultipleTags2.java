package in.amazon.teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Features",
		glue="in.amazon.teststeps",
		tags="@product_purchase and @TC_001" 
		)
public class TestRunnerAndMultipleTags2 extends AbstractTestNGCucumberTests {

}
