package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/featurefiles/hooks.feature",
glue= {"stepdefinitions","hooks"},
monochrome=true
		)

public class hooksrun 
{

}
