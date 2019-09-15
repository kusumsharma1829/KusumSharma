package util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

	public static void captureScreenshot(WebDriver driver, String ScreenshotName){
//		// TODO Auto-generated method stub
		TakesScreenshot ts = (TakesScreenshot)driver;      //typecasting the interface
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(screenshot, new File("./Screenshots/"+ScreenshotName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("SCREENSHOT TAKEN");
		//File screenshot = ((TakeScreenshot)driver).getScreenshotAs(OUTPUT.File);
	}

}
