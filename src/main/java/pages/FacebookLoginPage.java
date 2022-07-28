package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement button;
	
	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void loginToFacebbok(String Email, String pass) {
		email.sendKeys(Email);
		password.sendKeys(pass);
		
	}
	public void loginButton() {
		button.click();
	}
	
	public void clearText() {
		email.clear();
		password.clear();
	}

}
