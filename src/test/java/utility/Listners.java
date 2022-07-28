package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;



public class Listners  implements ITestListener  {

	public static void main(String[] args) {

		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		String name=result.getName();
		try {
			ScreenShot.captureScreen(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
