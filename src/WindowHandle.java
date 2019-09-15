import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kusum Sharma\\Downloads\\Selenium\\chromedriver_win32_75\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String ID1 = driver.getWindowHandle();
		System.out.println(ID1);
		WebElement name = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		WebElement name1 = driver.findElement(By.xpath("//a[text()='Start here.']"));
		WebElement name2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions a = new Actions(driver);
		a.moveToElement(name2).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();
		Thread.sleep(2000);
		a.moveToElement(name).contextClick();
		a.moveToElement(name).moveToElement(name1).click().build().perform();
		String id= driver.getWindowHandle();
		System.out.println(id);
		
	}

}
