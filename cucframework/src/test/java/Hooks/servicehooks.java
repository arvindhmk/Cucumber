package Hooks;

import testbaseclass.base;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import ennumspackage.browser;


public class servicehooks extends base
{

base b;

@Before
public void initializetest()
{
	b=new base();
	b.selectbrowser(browser.CHROME.name());
}
	

@After
public void endtest(Scenario sc) throws IOException
{
	
	if(sc.isFailed())
	{
		TakesScreenshot scrn = (TakesScreenshot)driver;
		byte[] screenshot = scrn.getScreenshotAs(OutputType.BYTES);
		File sourcefile = scrn.getScreenshotAs(OutputType.FILE);
		File destination = new File("./target/test-reports"+sc.getName()+".png");
		FileHandler.copy(sourcefile, destination);
		sc.embed(screenshot, "image/png");
	}
	
	b.driver.quit();
}
	
}
