package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.OrangeHrmHomePage;
import utility.BaseClass;
@Listeners(utility.Listners.class)
public class OrangeHrmHomeTest extends BaseClass {
	LoginPage lp;
	OrangeHrmHomePage hp;

	

	@BeforeClass
	public void beforeClass() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		lp = new LoginPage(driver);
		lp.enterCred("Admin", "admin123");
		lp.login();
		hp = new OrangeHrmHomePage(driver);
	}

	@Test
	public void logout() {

		hp.logout();

	}

	
}
