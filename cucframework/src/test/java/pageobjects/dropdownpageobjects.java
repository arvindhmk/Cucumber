package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbaseclass.base;

public class dropdownpageobjects extends base
{
	
	
	public static void automateindex(WebDriver driver)
	{
		driver.findElement(By.id("dropdown1"));
	}
	
	public static WebElement automateusingtext(WebDriver driver)
	{
		return driver.findElement(By.id("dropdown2"));
	}
	public static WebElement automateusingvalue(WebDriver driver)
	{
		return driver.findElement(By.id("dropdown3"));
	}
	
	public static WebElement automatedropdownoptions(WebDriver driver)
	{
		return driver.findElement(By.className("dropdown"));
	}
	
	public static WebElement multipleselection(WebDriver driver)
	{
		return driver.findElement(By.className("example"));
	}
		
}
