package ProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Home {
	@FindBy(xpath="//div[@class='mTxt' and contains(text(),'Login')]") WebElement LoginButton;
	
	static WebDriver driver;
	
	public String url="https://www.naukri.com/";
	public void OpenApp()
	{
		WebDriver driver=new ChromeDriver();
		System. setProperty("webdriver. chrome. driver",".Drivers/chromedriver");
		driver.get(url);
	}
	
}
