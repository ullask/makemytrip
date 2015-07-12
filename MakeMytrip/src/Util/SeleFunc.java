package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleFunc 
{

public static WebDriver driver; 
	
	public static WebDriver getDriver()
	{
	if(driver == null)
	{
	driver = new FirefoxDriver();
	}
	return driver;
	}
	
	public static void verifyElementPresence(By by)
	{
		getDriver().findElement(by).isDisplayed();
	}
	public static void Wait(int millisec) throws InterruptedException
	{
	
		Thread.sleep(millisec);

	}
}
