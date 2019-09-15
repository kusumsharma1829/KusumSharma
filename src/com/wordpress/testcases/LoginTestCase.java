package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;


public class LoginTestCase {
	
	
	@Test
	public void verifyLogin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kusum Sharma\\Downloads\\Selenium\\chromedriver_win32_75\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		LoginPage login = new LoginPage(driver);
		login.verifyPageTitle();
		login.typeUsername("admin");
		login.typePassword("demo123");
		login.loginButton();
		driver.quit();
		
	}
	
	

}
