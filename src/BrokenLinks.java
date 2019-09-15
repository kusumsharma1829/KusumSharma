import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kusum Sharma\\Downloads\\Selenium\\chromedriver_win32_75\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in/");
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i = 0; i<links.size();i++) {
			WebElement names = links.get(i);
			String URL = names.getAttribute("href");
			System.out.println(URL);
		}
	}
	public static void verifyActiveLinks(String URL){
		try {
			URL url = new URL(URL);
			HttpURLConnection obj=(HttpURLConnection)url.openConnection();
			obj.setConnectTimeout(3000);
			obj.connect();
			if(obj.getResponseCode()==200) {
				System.out.println(URL+ " " + obj.getResponseMessage());
			}
			if (obj.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(URL+" "+ obj.getResponseMessage() + HttpURLConnection.HTTP_NOT_FOUND);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
