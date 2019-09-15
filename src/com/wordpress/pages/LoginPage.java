package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class LoginPage {
	
	WebDriver driver;
	
	By username = By.id("user_login");
	By password = By.name("pwd");
	By loginButton = By.xpath("//input[@id='wp-submit']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void typeUsername(String uid) {
		driver.findElement(username).sendKeys(uid);		
	}
	
	public void typePassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);		
	}
	
	public void loginButton() {
		driver.findElement(loginButton).click();		
	}
	
	public void verifyPageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Log In ‹ Wordpress Demo Site at Demo.Center — WordPress");
	}
	
	public void clickEnter(WebDriver driver) {
		Actions click = new Actions(driver);
		click.moveToElement((WebElement) loginButton).keyDown(Keys.ENTER).build().perform();
	}

}
