package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpageobj 
{

	@FindBy(xpath = "//input[@value='Log In']")
	public static WebElement Fblogin;
	
	@FindBy(name="email")
	public static WebElement emailid;
	
	@FindBy(id = "loginbutton")
	public static WebElement loginbutton;
	
	@FindBy(xpath = "//h2[@class='uiHeaderTitle']")
	public static WebElement erroemessage;
	

	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
	}

}
