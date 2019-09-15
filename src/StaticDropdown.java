import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;
public class StaticDropdown {


			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kusum Sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		driver.manage().window().maximize();
		driver.findElement(By.id("pax_link_common")).click();
		Select S = new Select(driver.findElement(By.id("gi_class")));
		S.selectByIndex(1);
		Thread.sleep(1000);
		S.selectByValue("F");
		//S.deselectByValue("B"); [Error - You may only deselect options of a multi-select]
		driver.findElement(By.id("pax_link_common")).click();
		int i = 0;
		while (i<5) {
			driver.findElement(By.id("adultPaxPlus")).click();
			i++;}
			}
}



