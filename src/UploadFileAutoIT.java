import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileAutoIT {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kusum Sharma\\Downloads\\Selenium\\chromedriver_win32_75\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Kusum%20Sharma/Downloads/Selenium/Fileupload.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("resumeupload")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Users\\Kusum Sharma\\Downloads\\autoIT\\FileUpload.exe");
		
		
		

	}

}
