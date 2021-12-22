
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sendkeys_click_clear_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aer15\\eclipse-workspace\\JavaSeleniumMethods\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/ ");
		Thread.sleep(5000);
	}

	@Test(enabled = true, priority = 1)
	public void searchTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Laptop");

		Thread.sleep(5000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(5000);
		System.out.println("Current urlCurrent is:" + driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Ipad");
		Thread.sleep(5000);
		driver.findElement(By.id("gh-btn")).click();
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).clear();

		Thread.sleep(5000);
	}

	@Test(enabled = true, priority = 2)
	// click submit button by Enter key from keyboard
	public void enterMethodTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Apple watch",
				Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("Current URL is: " + driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Iromba", Keys.ENTER);
		Thread.sleep(5000);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
