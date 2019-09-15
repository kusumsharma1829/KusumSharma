import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kusum Sharma\\Downloads\\Selenium\\chromedriver_win32_75\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
	// Assertions
//		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
//		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
//		Assert.assertEquals(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected(), driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isEnabled());
//		boolean text = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
//		System.out.println(text);
//		
//	// Page Title using getTitle()
//		String pageTitle = driver.getTitle();
//		System.out.println(pageTitle);
//		if(pageTitle.equals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets")) {
//			System.out.println("Right page");
//		}
//	// Page Title using getPageSource()
//		boolean Title = driver.getPageSource().contains("SpiceJet - Flight Booking for Domestic and International");
//		Assert.assertTrue(Title);
//		System.out.println("Passed");
		
	// Verify error messages using getText()
//		driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_btn_FindFlights']")).click();
//		String errorMessage = driver.findElement(By.xpath("//div[text() = 'Select Departure City']")).getText();
//		Assert.assertEquals(errorMessage,"Select Departure City");
//		System.out.println("Error message displayed");
		
	// Verify error messages using getAttribute()
		driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_btn_FindFlights']")).click();
		String errorMessage = driver.findElement(By.xpath("//div[text() = 'Select Departure City']")).getAttribute("innerHTML");
		Assert.assertEquals(errorMessage,"Select Departure City");
		System.out.println("Error message displayed");
		
		SoftAssert soft = new SoftAssert();
		
		
	}

}
