package in.amazon.teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Features",
		glue="in.amazon.teststeps",
		tags="@product_purchase or @Login_functionality" 
		)
public class TestRunnerMultipleTags extends AbstractTestNGCucumberTests {

}
