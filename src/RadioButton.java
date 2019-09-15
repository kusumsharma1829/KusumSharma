import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kusum Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		//To get no of radiobuttons on the page
		int count = driver.findElements(By.xpath("//input[@type='radio']")).size();
		// Clicking on Radiobutton
		driver.findElement(By.xpath("//input[contains(@id,'rbtnl_Trip_2')]")).click();
		driver.findElement(By.id("MultiCityModelAlert")).click();
		// To click on all radiobuttons
		for(int j=0;j<count;j++) {
			 driver.findElements(By.xpath("//input[@type='radio']")).get(j).click();
			 Thread.sleep(1000);
		// Getting text of all radio buttons and clicking on a particular button
		for(int i=0;i<count;i++) {
			String Text = driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value");
			if(Text.equals("RoundTrip")) {
				driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			}
			else {
					System.out.println(Text);
				}
			
		
			}
		}

	}
}

