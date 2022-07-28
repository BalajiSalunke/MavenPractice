package test;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.FacebookLoginPage;
import utility.BaseClass;
@Listeners(utility.Listners.class)
public class FacebookTest extends BaseClass {
	


	
	FacebookLoginPage fb;

	@BeforeClass
	public void beforeClass() {

		
		driver.get("https://www.facebook.com/");
		fb = new FacebookLoginPage(driver);
	}

	@Test (dataProvider = "data")
	public void enterCred(String name,String pass) throws InterruptedException {

		fb.loginToFacebbok(name, pass);
		fb.loginButton();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		fb.clearText();
	}
	
	@Test(enabled=false)
	public void cleardata() throws InterruptedException {
		
	}

	@DataProvider
	public String[][] data() {

		String[][] userdata = { { "5678990000" ,  "shajjjjjj" }, { "9287777777","hshsha" }, {"89127873812", "hjcddds" } };
		return userdata;

	}
	
}
