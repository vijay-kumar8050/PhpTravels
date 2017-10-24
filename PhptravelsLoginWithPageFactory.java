package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactory.LoginPage;
import pageFactory.MyAccountPage;

public class PhptravelsLoginWithPageFactory {

	WebDriver driver;
	LoginPage ObjLogin;
	MyAccountPage ObjAccount;
	
	@BeforeTest
	public void setup(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.phptravels.net/login");
	}
	
	@Test(priority=0)
	public void test_Home_Page_Appearscorrect(){
		//Create login page object
		
		ObjLogin = new LoginPage(driver);
		
		//Verify login page title
		
		String loginPageTitle = ObjLogin.GetLoginPageTitle();
		
		Assert.assertTrue(loginPageTitle.toLowerCase().contains("login"));
		
		//Login to Application
		
		ObjLogin.LoginToPhptravels("user@phptravels.com", "demouser");
		
		// Navigate to next page
		
		ObjAccount = new MyAccountPage(driver);
		
		//Verifying home page
		
		Assert.assertTrue(ObjAccount.getUserNameFromAccount().toLowerCase().contains("hi, johny smith"));
		
		
	}
}
