package in.amazon.teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Features//buy_mobile_phone.feature",
		glue="in.amazon.teststeps",
		tags="@TC_001"
		)
public class TestRunnerTags extends AbstractTestNGCucumberTests {

}
