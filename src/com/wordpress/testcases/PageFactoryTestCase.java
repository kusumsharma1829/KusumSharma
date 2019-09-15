package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.PageFactoryLoginPage;

import util.BrowserFactory;
import util.Screenshots;

public class PageFactoryTestCase {
	
	@Test
	public void loginWordpress() {
		WebDriver driver = BrowserFactory.launchBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
		Screenshots.captureScreenshot(driver,"PageFactory");
		PageFactoryLoginPage login = PageFactory.initElements(driver,PageFactoryLoginPage.class);
		login.pageFactoryLogin("admin", "demo123");
		Screenshots.captureScreenshot(driver,"PageFactory1");
		driver.close();
	}
}

