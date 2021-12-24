import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Use_Of_manage {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\aer15\\eclipse-workspace\\JavaSeleniumMethods\\browser\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();

		Thread.sleep(5000);
	}

	@Test(enabled = true, priority = 1)
	public void maximizeWindowTest() {
		driver.get("https://www.ebay.com/ ");
	}

	@Test(enabled = false, priority = 2)
	public void fullScreenWindowTest() {
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().fullscreen();
	}

	@Test(enabled = true, priority = 3)
	public void sizeOfWindowTest() throws InterruptedException {
		driver.get("https://www.target.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		System.out.println("The size of the screen is " + driver.manage().window().getSize());

	}

	@Test(enabled = true, priority = 4)

	public void deleteAllCookies() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
	}

	@Test(enabled = true, priority = 5)
	public void setSpecsificSizeOfWindow() throws InterruptedException {
		Dimension dimension = new Dimension(700, 500);
		driver.manage().window().setSize(dimension);
		driver.manage().deleteAllCookies();
		driver.get("https://www.cvs.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().setSize(dimension);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}