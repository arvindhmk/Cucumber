package stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class orangewithtestheader 
{
	WebDriver driver;
	@Given("^You are on Login page with tableheader$")
	public void you_are_on_Login_page_with_tableheader() 
	{
	    // Write code here that turns the phrase above into concrete actions

    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");	    	driver=new FirefoxDriver(); 
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@When("^You enter the below credentials with tableheader$")
	public void you_enter_the_below_credentials_with_tableheader(DataTable dt) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<Map<String,String>> keyvalue=dt.asMaps(String.class, String.class);
		String User_name=keyvalue.get(0).get("userName");
		String Password=keyvalue.get(0).get("password");
		
		//String User_name=keyvalue.get(1).get("username");
		//String Password=keyvalue.get(1).get("password");
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(User_name);
    	driver.findElement(By.id("txtPassword")).sendKeys(Password);
	    
	}

	@When("^click the login with tableheader$")
	public void click_the_login_with_tableheader() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
    	driver.close(); 
	}

	
	
}
