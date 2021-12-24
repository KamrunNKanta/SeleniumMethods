import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeWork_16 {

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

	// use of selectByIndex()
	@Test(enabled = true, priority = 1)
	public void selectByIndexTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);
		select.selectByIndex(2);
		Thread.sleep(5000);
	}

//	//use of selectByvalue
	@Test(enabled = true, priority = 2)

	public void selectByValue() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);
		select.selectByValue("10542");
		Thread.sleep(4000);
	}

	// select by visible text
	@Test(enabled = true, priority = 3)
	public void selectByVisibleText() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Sporting Goods");
		Thread.sleep(4000);

	}
	@Test(enabled = true, priority = 4)
	public void moveToElement() throws InterruptedException {
		driver.get("https://www.costco.com/");
		Actions actions=new Actions(driver);
		WebElement services=driver.findElement(By.xpath("//a[@id='Home_Ancillary_5']"));
		Thread.sleep(5000);
		actions.moveToElement(services).build().perform();
		Thread.sleep(5000);
		System.out.println("The web Element is" + services.getText());
		
	}
	

	@AfterTest
	public void tearUp() {
		// driver.quit();
		driver.close();
	}

}
