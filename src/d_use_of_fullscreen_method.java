




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class d_use_of_fullscreen_method {

WebDriver driver;
@BeforeTest
 public void setUp() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\aer15\\eclipse-workspace\\JavaSeleniumMethods\\browser\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.walmart.com/ ");
	Thread.sleep(5000);
}
	@Test
	public void searchProduct() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='flex flex-auto items-center relative']")).sendKeys("Laptop");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='ld ld-Search absolute']")).click();
		Thread.sleep(3000);
	System.out.println("current url is " +driver.getCurrentUrl());	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='flex flex-auto items-center relative']")).clear();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='flex flex-auto items-center relative']")).sendKeys("ipad");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//i[@class='ld ld-Search absolute']")).click();
	Thread.sleep(3000);
		
	
	
		
		
		
	}
	@AfterTest
	public void tearup() {
		driver .quit();
	}
	
	
	
	
	
	
	 
 
 


}
