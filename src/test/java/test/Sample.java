package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		
		// step 1- setup driver
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		// step 2- Open Url

		driver.get("https://www.youtube.com/");

		// step 3- Search song and click on it

		WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
		search.sendKeys("Har Har Shambho");
		search.submit();
		driver.navigate().forward();
		WebElement submit = driver.findElement(By.xpath(
				"(//a[@title=\"Har Har Shambhu Shiv Mahadeva | sanand manand vane | Abhilipsa Panda | Jeetu Sharma | shiv stotra\"])[1]"));
		submit.click();
		driver.navigate().forward();

		// step 4- Skip Ad

		WebElement skipAd = driver.findElement(By.xpath("//div[text()='Skip Ads']"));
		wait.until(ExpectedConditions.textToBePresentInElement(skipAd, "Skip Ads"));
		skipAd.click();

		// step 5- Make it full screen

		driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();

		// step 6- Adjust volume

		WebElement voulme = driver.findElement(By.xpath("//button[@title='Mute (m)']"));

		// step 7- Change video clarity

		Actions act = new Actions(driver);
		act.moveToElement(voulme).perform();
		WebElement setting = driver
				.findElement(By.xpath("//button[@class='ytp-button ytp-settings-button ytp-hd-quality-badge']"));
		setting.click();
//   	WebElement setting = driver.findElement(By.xpath("//button[@class='ytp-button ytp-settings-button ytp-hd-quality-badge']"));
//	    setting.click();

	}

}
