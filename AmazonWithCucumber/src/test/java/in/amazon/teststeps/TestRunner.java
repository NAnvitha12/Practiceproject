package in.amazon.teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Features//verify_error_message1.feature",
		glue="in.amazon.teststeps"
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
