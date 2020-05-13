package Framework.cucumbr.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue= {"Framework.cucumbr.stepdefinition"},
				features= {"src\\test\\java\\Framework\\cucumbr\\feature"},
				strict=true,
				monochrome=true,
				tags= {"@userstory002"}
		)
public class Runner 
{


}
