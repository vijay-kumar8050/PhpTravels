package PageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;

@FindBy(name="username")
WebElement Username;

@FindBy(name="password")
WebElement Password;

@FindBy(id="remember-me")
WebElement remember_me;

@FindBy(xpath="html/body/div[4]/div[1]/div[1]/form/div[1]/div[5]/button")
WebElement LoginButton;

@FindBy(xpath="html/body/div[4]/div[1]/div[1]/form/div[2]/div[1]/a")
WebElement SignUpButton;

@FindBy(xpath="html/body/div[4]/div[1]/div[1]/form/div[2]/div[3]/a")
WebElement ForgetButton;


public LoginPage(WebDriver driver){
	
	this.driver=driver;
	//This initElements method will create all WebElements
	PageFactory.initElements(driver, this);
}

//Set user name in textbox

public void setusername(String strUserName ){
	Username.sendKeys(strUserName );
	
}
//Set user name in password

public void setpassword(String strPassword){
	Password.sendKeys(strPassword);
}

//Click on login button

public void loginButton(){
	LoginButton.click();
	
}

public String GetLoginPageTitle(){
	
	return driver.getTitle();
}

public void LoginToPhptravels(String strUserName, String strPassword){
	
	//Fill User name
	
	this.setusername(strUserName);
	
	//Fill Password
	
	this.setpassword(strPassword);
	
	//Click on LoginButton
	
	this.loginButton();
}
}
