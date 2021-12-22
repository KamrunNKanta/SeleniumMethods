import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class E_homework {
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aer15\\eclipse-workspace\\JavaSeleniumMethods\\browser\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
	}
	@Test
	
	public void searchProductTest() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Baby food");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(3000);
	
	System.out.println("Current Url Is" +driver.getCurrentUrl());
	Thread.sleep(3000);
	driver.findElement(By.id("twotabsearchtextbox")).clear();
	Thread.sleep(3000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Ipad");
	Thread.sleep(3000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	
	}
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
	
	
	

}
