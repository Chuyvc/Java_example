package apiTestRunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/featureFiles",
		glue = {"apiStepDefinitions"})
public class ApiTestRunnerEmployee extends AbstractTestNGCucumberTests{

}
