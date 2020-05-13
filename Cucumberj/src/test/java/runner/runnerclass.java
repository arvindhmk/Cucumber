package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/java/featurefiles/opengoogle.feature",
glue="stepdefinitions",
strict=false,
dryRun=true,
monochrome=true,
//Format
plugin= {"html:report/WebReport","json:report/WebReport.json","junit:report/WebReport.xml"},
tags={"~@Simplelogin"}
)
public class runnerclass
{

}
	