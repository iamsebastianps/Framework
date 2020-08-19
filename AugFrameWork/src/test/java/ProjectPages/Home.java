package ProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;
import utils.*;

public class Home  extends BaseClass{
	//public WebDriver driver;
	@FindBy(xpath="//div[@class='mTxt' and contains(text(),'Login')]") WebElement loginLink;
	
	public Home()
	{
		//this.driver=ldriver;
		BrowserUtils.openBrowserURL( "https://www.naukri.com/browse-jobs", "Chrome");
	
		
		PageFactory.initElements(driver, this);
	}
	public void NavgateLogin()
	{
		
		loginLink.click();
	}
	
}
