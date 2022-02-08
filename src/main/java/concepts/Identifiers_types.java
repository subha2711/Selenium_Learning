package concepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identifiers_types {
	WebDriver driver ;
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
@Test
	public void testIdentifier() {
		//name identifier
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		
		//id identifier
		driver.findElement(By.id("sex-0")).click();
		
		//classname
		
//	driver.findElement(By.className("input-file")).click();
	
	//link test
	//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
	
	//partial link
	driver.findElement(By.partialLinkText("Product Backend")).click();
	
	//css selector
	}
@After
public void tearDown() {
	driver.close();
	driver.quit();
}
}
