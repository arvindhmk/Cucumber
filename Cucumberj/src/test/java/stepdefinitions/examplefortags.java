package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class examplefortags 
{
WebDriver driver;
	
@Given("^Open browser$")
public void open_browser()
{
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

}

@When("^Enter the url$")
public void enter_the_url()
{

	// Write code here that turns the phrase above into concrete actions
	driver.get("https://www.google.co.in");
}

@Then("^Respective page is displayed$")
public void respective_page_is_displayed()
{
    // Write code here that turns the phrase above into concrete actions
 
	System.out.println(driver.getTitle());
	
}

@Given("^browser open$")
public void browser_open()
{
    // Write code here that turns the phrase above into concrete actions
System.out.println("browser open");    
}

@When("^url entered as google$")
public void url_entered_as_google()
{
    // Write code here that turns the phrase above into concrete actions
    System.out.println("url entered");
}

@Then("^close the browser$")
public void close_the_browser()
{
    // Write code here that turns the phrase above into concrete actions
System.out.println("close the browser");
}
	
}
