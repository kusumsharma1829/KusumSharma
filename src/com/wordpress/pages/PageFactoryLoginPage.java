package com.wordpress.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactoryLoginPage {
	
	WebDriver driver;
	
	@FindBy(id = "user_login")
	WebElement username;
	
	@FindBy(how=How.NAME,using="pwd")
	WebElement password;
	
	@FindBy(id="wp-submit")
	WebElement login_Button;
	
	public void pageFactoryLogin(String uid, String pass) {
		username.sendKeys(uid);
		password.sendKeys(pass);
		login_Button.click();
		
	}
	
	public void clickEnter(WebDriver driver1) {
		Actions click = new Actions(driver1);
		click.moveToElement(login_Button).keyDown(Keys.ENTER).build().perform();
	}

}
