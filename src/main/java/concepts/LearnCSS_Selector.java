package concepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCSS_Selector {
	
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
	
	
	driver.findElement(By.cssSelector("input#exp-5")).click();
	//driver.findElement(By.cssSelector("input[value='Automation Tester']")).click();
	driver.findElement(By.cssSelector("input[name='profession'][id='profession-1']")).click();
	
	}
//@After
public void tearDown() {
	driver.close();
	driver.quit();
}

}
