package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight {

	public static void highlightElement(WebDriver driver1, WebElement element) {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript("arguments[0].setAttribute('style','background:yellow; border: 2px solid red;');",element);
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//js.executeScript("arguments[0].setAttribute('style','border: 2px solid white;');",element);
	}

}
