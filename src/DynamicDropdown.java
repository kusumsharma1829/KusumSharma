import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kusum Sharma\\Downloads\\Selenium\\chromedriver_win32_75\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//div[@class = 'dropdownDiv']/ul/li[7]")).click();
//		// Using index for second dropdown
		//driver.findElement(By.xpath("(//div[@class = 'dropdownDiv']/ul[2]/li[6])[2]")).click();
//		//Using Parent Child Relationship (Parent window xpath space child xpath)
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //div[@id ='dropdownGroup1']/div/ul[2]/li[3]")).click();
//		driver.findElement(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr[6]/td[1]")).click();
//		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
//		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdownDiv']//ul//li//a"));
		int size = list.size();
		System.out.println(size);
		for(int i= 0; i<size; i++) {
			//String city = list.get(i).getText();
			String city = list.get(i).getAttribute("innerHTML");
			System.out.println(city);
			if(city.contains("Adampur")) {
				list.get(i).click();
			}
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
//		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
//		
//		List<WebElement> destinationList = driver.findElements(By.xpath("(//div[@class='dropdownDiv']//ul//li//a)[2]"));
//		int size1 = destinationList.size();
//		System.out.println(size1);
//		for(int j= 0; j<size1; j++) {
//			//String city = list.get(i).getText();
//			String destinationCity = list.get(j).getAttribute("innerHTML");
//			System.out.println(destinationCity);
//			if(destinationCity.contains("Goa")) {
//				destinationList.get(j).click();
//			}
			}
		}
//		
//		Thread.sleep(1000);
	
	}

