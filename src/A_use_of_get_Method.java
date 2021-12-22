import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A_use_of_get_Method {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aer15\\eclipse-workspace\\JavaSeleniumMethods\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://cernerhealth.com/oauth/authenticate?redirect_uri=https%3A%2F%2Fcernerhealth.com%2Fsaml%2Fsso%2Fresponse%3Fmessage_id%3D_6235f15d-d82c-49d1-8492-5a50cf7d84c1%26issuer%3Dhttps%253A%252F%252Fmypennstatehershey.iqhealth.com%252Fsession-api%252Fprotocol%252Fsaml2%252Fmetadata&sign_in_only=on&client_id=7a5c43bd406a47e0977750f9fc35cee9");
		Thread.sleep(8000);

	}

	@Test
	public void loginButtonTest() throws InterruptedException {
	boolean elementDisplayed=	driver.findElement(By.xpath("//button[@id='signin']")).isDisplayed();
System.out.println("is elememt displayed" + elementDisplayed);
driver.findElement(By.xpath("//button[@id='signin']")).sendKeys("Kamrun kanta");
		Thread.sleep(4000);
	
	boolean buttonEnable=driver.findElement(By.xpath("//button[@id='signin']")).isEnabled();
	System.out.println("is button enabled" + buttonEnable);
	}

	@AfterTest
	public void tearup() {
		driver.quit();
	}

}
