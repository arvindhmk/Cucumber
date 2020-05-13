package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/featurefiles/background.feature",
		glue={"stepdefinitions","hooks"}
				
		)

public class backgroundrunner {

}
