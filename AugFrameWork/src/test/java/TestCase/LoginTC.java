package TestCase;
import ProjectPages.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTC{
	
	@Test
	public void LoginTC1()
	{
		
		Home homepage=new Home();
		homepage.NavgateLogin();
		LoginPage loginpage=new LoginPage();
		loginpage.Login();
	}
	@Test
	public void LoginTC2()
	{
		
	}


}
