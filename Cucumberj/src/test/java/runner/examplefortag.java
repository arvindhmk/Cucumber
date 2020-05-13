package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/featurefiles/Examplefortags.feature",
glue="stepdefinitions",
dryRun=false,
strict=false,
monochrome=true,
tags= {"@Opengoogle","@Closegoogle"}//and
		)
//@Opengoogle,@Closegoogle"}
//~@Opengoogle at feature level it will not run any scenario steps
public class examplefortag 
{

}
