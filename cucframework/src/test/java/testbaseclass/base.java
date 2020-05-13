package testbaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ennumspackage.browser;

public class base 
{

	
	public static WebDriver driver;
	
	public void selectbrowser(String browsername)
	{
		
		if(browsername.equalsIgnoreCase(browser.CHROME.name()))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase(browser.FIREFOX.name()))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		
	}
	
}
