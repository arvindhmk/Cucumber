package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/featurefiles/taggedhook.feature",
		glue={"stepdefinitions","hooks"},
		monochrome=true,
		dryRun = false,
		tags= {"@Taggedhook"}
)
public class taggedhookrun {

}
