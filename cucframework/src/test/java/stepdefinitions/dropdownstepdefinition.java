package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.dropdownpageobjects;
import testbaseclass.base;

import org.apache.logging.log4j.*; 

public class dropdownstepdefinition extends base
{
	
      private static Logger log = LogManager.getLogger(dropdownstepdefinition.class.getName());	

	
      @Given("^Navigate to TestLeaf \"([^\"]*)\" page$")
      public void navigate_to_TestLeaf_page(String arg1) throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions 	
    	
		driver.get(arg1);
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		log.info("Navigation to url done");
	}

      @When("^Automate the dropdown field using index$")
      public void automate_the_dropdown_field_using_index() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
    	WebElement dd = driver.findElement(By.id("dropdown1"));
    	Select s= new Select(dd);
    	s.deselectByIndex(1);
		log.debug("seelcted using index");
	}

      @Then("^Automate the dropdown field using text$")
      public void automate_the_dropdown_field_using_text() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	   
		WebElement dd1 = dropdownpageobjects.automateusingtext(driver);
    	Select s= new Select(dd1);
    	s.selectByVisibleText("Appium");
    	log.info("Selected using visible text");
    	
	}

      @Then("^Automate the dropdown field using value$")
      public void automate_the_dropdown_field_using_value() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	   
		WebElement dd3 = dropdownpageobjects.automateusingvalue(driver);
    	Select s= new Select(dd3);
    	s.selectByValue("3");
    	log.info("Selected using value");
	}

      @Then("^Get number of dropdown options$")
      public void get_number_of_dropdown_options() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	
		WebElement dd4=dropdownpageobjects.automatedropdownoptions(driver);
		Select s = new Select(dd4);
		int options = s.getOptions().size();
		System.out.println("Number of options ="+options);
		log.info("printed options");
	}

      @Then("^AutomateMultiple selection$")
      public void automatemultiple_selection() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		WebElement dd5=driver.findElement(By.className("example"));
		Select s = new Select(dd5);
	Boolean status =s.isMultiple();
	System.out.println(status);
	
	s.selectByValue("Appium");
	s.selectByValue("Loadrunner");
		
	}

	
}
