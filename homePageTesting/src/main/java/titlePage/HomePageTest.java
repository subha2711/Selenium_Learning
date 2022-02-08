package titlePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Title();

	}

	public static void Title() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
	String ActTitle =	driver.getTitle();
	String expTitle = "TestLeaf - Selenium Playground ";
	
	if(expTitle.equalsIgnoreCase(ActTitle))
		System.out.println("Title match");
	else
		System.out.println("title Mismatch");
		
	}
}
