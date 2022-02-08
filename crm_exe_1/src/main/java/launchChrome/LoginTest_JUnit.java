package launchChrome;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_JUnit {
	
	 WebDriver driver;
	
	 @Before
	public  void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
@Test
	public  void loginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();

	}
@Test
	public  void loginTestNegative() {
		driver.findElement(By.id("username1")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();

	}
@After
	public  void tearDown() {
		driver.close();
	}

}
