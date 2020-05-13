package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
glue= {"stepdefinitions","src/test/java/Hooks/servicehooks.java"},
monochrome=true,
strict=true,
plugin= {"pretty","html:report/WebReport","rerun:target/fail.txt"})
public class dropdownrunner {

}
