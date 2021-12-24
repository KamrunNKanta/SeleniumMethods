
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Use_Of_firefoxDriver {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\aer15\\eclipse-workspace\\JavaSeleniumMethods\\browser\\geckodriver.exe");
		driver = new FirefoxDriver();
		

		Thread.sleep(5000);
	}

	@Test(enabled = true, priority = 1)
	public void maximizeWindowTest() {
		driver.get("https://www.ebay.com/ ");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}