package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	WebDriver driver;
	
	@FindBy(xpath ="html/body/div[4]/div/div[1]/div/div[1]/h3")
	WebElement GreetingUser;
	
	@FindBy(xpath="html/body/div[4]/div/div[3]/div/div[1]/ul/li[1]/a")
	WebElement Bookings;
	
	@FindBy(xpath="html/body/div[4]/div/div[3]/div/div[1]/ul/li[2]/a")
	WebElement MyProfile;
	
	@FindBy(xpath="html/body/div[4]/div/div[3]/div/div[1]/ul/li[3]/a")
	WebElement Wishlist;
	
	@FindBy(xpath="html/body/div[4]/div/div[3]/div/div[1]/ul/li[4]/a")
	WebElement Newsletter;
	
	public MyAccountPage(WebDriver driver){
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public String getUserNameFromAccount(){
		
		return GreetingUser.getText();
	}

}
