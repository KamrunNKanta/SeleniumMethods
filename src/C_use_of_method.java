
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C_use_of_method {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aer15\\eclipse-workspace\\JavaSeleniumMethods\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_467/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid&response_type=id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=URL%3D%5BSSO%5D%2F%5BSSO%5D&nonce=TjukFCYn0FNB3D9L&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
		Thread.sleep(4000);
	}

	@Test(enabled = true, priority = 1)
	public void logoTest() throws InterruptedException {
		boolean elementDisplayed = driver.findElement(By.xpath("//button[@id='next']")).isDisplayed();
		boolean elementEnabled = driver.findElement(By.xpath("//button[@id='next']")).isEnabled();

		System.out.println("Is element displayed" + elementDisplayed);
		System.out.println("is element enable" + elementEnabled);
		Thread.sleep(5000);

	}

	@Test(enabled = true, priority = 2)
	public void signInTest() {
		boolean elementSelected = driver.findElement(By.xpath("//input[@id='rememberMe']")).isSelected();
		System.out.println(" Is element  Selected" + elementSelected);

	}

	@Test(enabled = true, priority = 3)
	public void titleTest() {
		driver.getTitle();
		System.out.println("The title is : " + driver.getTitle());
	}

	@Test(enabled = true, priority = 4)
	public void getCurrentUrl() {
		System.out.println("Current Url is :" + driver.getCurrentUrl());
	}

	@Test(enabled = true, priority = 6)

	public void getTextMethod() {
		driver.get("https://www.pennstatehealth.org/");
		WebElement logo = driver.findElement(By.xpath("//div[@id='block-sitebranding']"));
		System.out.println("webElemet is " + logo.getText());
	}

	@Test(enabled = true, priority = 5)
	public void sendKeysMethod() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("Kamrun");

		Thread.sleep(3000);
	}

	@AfterTest

	public void tearUp() {
		driver.quit();
	}

}
