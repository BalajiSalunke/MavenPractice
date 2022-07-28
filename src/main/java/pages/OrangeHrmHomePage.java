package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmHomePage {
	
	
	
	@FindBy (id="welcome")
	private WebElement welcome;
	
	@FindBy (xpath="//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	private WebElement logout;
	
	
	public OrangeHrmHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void logout() {
		
	welcome.click();
	logout.click();
		
	}
	

}
