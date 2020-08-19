package ProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BrowserUtils;

public class LoginPage  extends BaseClass{
	//WebDriver driver;
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']") WebElement userName;
	@FindBy(xpath="//input[@placeholder='Enter your password']") WebElement passWord;
	@FindBy(xpath="//button[@value='Login']") WebElement submitButton;
	public LoginPage()
	{
		System.out.println("1");
		//this.driver=ldriver;
		//driver=BrowserUtils.openBrowserURL(driver, "https://www.naukri.com/browse-jobs", "Chrome");
		System.out.println("2");
		PageFactory.initElements(driver, this);
	}
	public void Login()
	{
		System.out.println("3");
		//userName.clear();
		userName.sendKeys("sebastian");
		passWord.sendKeys("dsdsdsds");
		submitButton.click();
				
	}

}
