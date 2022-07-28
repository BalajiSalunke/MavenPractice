package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "txtUsername")
	private WebElement username;

	@FindBy(id = "txtPassword")
	private WebElement password;

	@FindBy(id = "btnLogin")
	private WebElement login;
	
	@FindBy ( id = "spanMessage")
	private WebElement errorMsg;
	

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	public void msgClear() {
		username.clear();
		password.clear();
	}
	public String messageValidation() {
		String error= errorMsg.getText();
		return error;
	}

	public void enterCred(String user, String pass) {

		username.sendKeys(user);
		password.sendKeys(pass);

	}

	public void login() {
		login.click();
	}

	public String buttonTextName() {

		String text= login.getText();
return text;
	}
	
	

}