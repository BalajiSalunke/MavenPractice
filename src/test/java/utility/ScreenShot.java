package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot extends BaseClass{
	
	
	public static void captureScreen( String name) throws IOException {
		
	TakesScreenshot ref = (TakesScreenshot)driver;
		
	File source = ref.getScreenshotAs(OutputType.FILE);
	
	File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven-Practice\\Screenshot\\"+name+".png");
	
	FileHandler.copy(source,file);
	
	System.out.println("ScreenShot captured successfully");
		
	}
}
