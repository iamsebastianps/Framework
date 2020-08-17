package ProjectPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage{
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']") WebElement userName;
	@FindBy(xpath="//input[@placeholder='Enter your password']") WebElement passWord;
	@FindBy(xpath="btn-primary loginButton") WebElement submitButton;
	
	public void Login()
	{
		userName.clear();
		userName.sendKeys("sebastian");
		passWord.sendKeys("dsdsdsds");
		submitButton.click();
				
	}

}
