package Framework.cucumbr.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.loginpageobj;



public class logindefinitions 
{
	 WebDriver driver;
	
	@Given("^Navigate to utest url$")
	public void navigate_to_utest_url() throws Throwable 
	{
		PageFactory.initElements(driver, loginpageobj.class);
	    // Write code here that turns the phrase above into concrete actions 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
	}

	@When("^Click on login link$")
	public void click_on_login_link() throws Throwable {
		PageFactory.initElements(driver, loginpageobj.class);
	    // Write code here that turns the phrase above into concrete actions
	   // driver.findElement(By.linkText("Sign in")).click();
		loginpageobj.Fblogin.click();
		
	}

	@When("^Click on sign in button$")
	public void click_on_sign_in_button() throws Throwable 
	{
		PageFactory.initElements(driver, loginpageobj.class);
	    // Write code here that turns the phrase above into concrete actions
	    //driver.findElement(By.xpath("//button[@id='kc-login']")).click();
		loginpageobj.singn.click();
	    Thread.sleep(4000);
	}

	@Then("^Validate the error message \"([^\"]*)\"$")
	public void validate_the_error_message(String expected) throws Throwable {
		PageFactory.initElements(driver, loginpageobj.class);
	    // Write code here that turns the phrase above into concrete actions
	WebElement alertmessage = loginpageobj.erroemessage;
	String actual = alertmessage.getText();
	String expected="Enter Security Code";
	Assert.assertEquals(expected, actual);
	driver.close();
	}

	
	@When("^Enter email \"([^\"]*)\"$")
	public void enter_email(String email) throws Throwable {
		PageFactory.initElements(driver, loginpageobj.class);
	    // Write code here that turns the phrase above into concrete actions
	 
		driver.findElement(By.id("username")).sendKeys(email);
		driver.close();
		Thread.sleep(3000);
	
	}

}
