package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		
	features = "src/main/java/featureFiles/Login.feature",
	glue = {"stepDefinitions"},
	format= {"pretty"},
	dryRun = true
		
	
		
		
)



public class LoginTestRunner {

}
