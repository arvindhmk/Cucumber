package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class orangestepdef 

{

	WebDriver driver;
	    @Given("^You are on Login page$")
	    public void you_are_on_login_page() 
	    {

	    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");	    	driver=new FirefoxDriver(); 
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.get("https://opensource-demo.orangehrmlive.com");
	    }

	    @When("^You enter the below credentials$")
	    public void you_enter_the_below_credentials(DataTable dataTable)
	    
	    {
	    	List<String> credentials =  dataTable.asList(String.class);
	    	 			
	    	driver.findElement(By.id("txtUsername")).sendKeys(credentials.get(0));
	    	driver.findElement(By.id("txtPassword")).sendKeys(credentials.get(1));
	    }
	    
	    @When("^click the login$")
	    public void click_the_login()
	    {
	    	driver.findElement(By.id("btnLogin")).click();
	    	driver.close();
	    }
	
}
