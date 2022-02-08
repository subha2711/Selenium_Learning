package titlePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting {

	public static void main(String[] args) {
	
		

	}
public static void LinkCheck() {
	
	System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://leafground.com/pages/Link.html");
	driver.findElement(By.linkText("Go to Home Page")).click();
	driver.findElement(By.partialLinkText("Home Page")).click();
	
}
}
