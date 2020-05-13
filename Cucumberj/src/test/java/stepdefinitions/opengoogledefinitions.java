package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class opengoogledefinitions 
{
	WebDriver driver;
	WebElement searchbox;
	@Given("^user is entering google$")
	public void user_is_entering_google_com()
	{
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.google.co.in");
		
	}

	@When("^user clicks the search box$")
	public void user_clicks_the_search_box()
	{
	    // Write code here that turns the phrase above into concrete actions
	    
		searchbox = driver.findElement(By.name("q"));
		searchbox.click();
	}

	@When("^types the search term as \"([^\"]*)\"$")
	public void types_the_search_term_as(String arg1)
	{
	    // Write code here that turns the phrase above into concrete actions
	    
		searchbox.sendKeys(arg1);
		searchbox.sendKeys(Keys.RETURN);
		
	}

	@Then("^the user should see the search results for Agniprasath$")
public void the_user_should_see_the_search_results_for_Agniprasath()
	{
	    // Write code here that turns the phrase above into concrete actions

		boolean status =  driver.findElement(By.partialLinkText("Agni")).isDisplayed();
		if(status)
		{
			System.out.println("Results are displayed");
		}
		else
		{
			System.out.println("Results are not displayed");
		}
		
		driver.close();
		
			}
	
	}

