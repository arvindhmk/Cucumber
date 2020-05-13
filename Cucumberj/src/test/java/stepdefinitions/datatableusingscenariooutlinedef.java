package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class datatableusingscenariooutlinedef 
{
	WebDriver driver;
	@Given("^You are on Login page with tableheader using examples$")
	public void you_are_on_Login_page_with_tableheader_using_examples() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");	    	driver=new FirefoxDriver(); 
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.get("https://opensource-demo.orangehrmlive.com");
		
	}

	@When("^You enter the below credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void you_enter_the_below_credentials_and_angled_brackets(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
    	driver.findElement(By.id("txtUsername")).sendKeys(username);
    	driver.findElement(By.id("txtPassword")).sendKeys(password);
		
	}

	@When("^Click the login with tableheader using examples$")
	public void click_the_login_with_tableheader_using_examples() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
    	driver.findElement(By.id("btnLogin")).click();
    	driver.close();
	}	
}
