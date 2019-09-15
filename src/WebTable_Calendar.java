import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kusum Sharma\\Downloads\\Selenium\\chromedriver_win32_75\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[@class='picker-first2'])[1]")).click();
		List <WebElement> list = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		for(int i=22; i<list.size(); i++) {
			String date = list.get(i).getText();
			if(date.equalsIgnoreCase("26")){
				list.get(i).click();
				System.out.println("Date selected");
			}
			}
	}

}
