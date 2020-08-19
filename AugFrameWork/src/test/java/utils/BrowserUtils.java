package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ProjectPages.BaseClass;

public class BrowserUtils  extends BaseClass {
	
	public static void openBrowserURL(String url,String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
			driver=new ChromeDriver();	
			driver.get(url);
		}
		
		
	}

}
