import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kusum Sharma\\Downloads\\Selenium\\chromedriver_win32_75\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	WebElement elem = driver.findElement(By.xpath("//span[text()='Men']"));
	WebElement ele = driver.findElement(By.xpath("//a[text()='Explore']"));
	Actions a = new Actions(driver);
	a.moveToElement(elem).click().build().perform();
	a.contextClick(ele);
	a.doubleClick(elem);
	System.out.println("passed");
}
}