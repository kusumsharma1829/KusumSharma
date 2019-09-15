package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	public  static WebDriver launchBrowser(String browser,String URL) {
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			}
		else if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kusum Sharma\\Downloads\\Selenium\\chromedriver_win32_75\\chromedriver.exe");
				driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("IE")){
			driver = new InternetExplorerDriver();
	}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	

}
