package titlePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto_Completion {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		By SEARCH_BOX_FIELD = By.xpath("//input[@id='tags']");
		WebElement SEARCH_BOX_ELEMENT = driver.findElement(SEARCH_BOX_FIELD);
		SEARCH_BOX_ELEMENT.sendKeys("s");
		Thread.sleep(6000);
	//	By OPTIONS_LIST_FIELD = By.xpath("//input[@id='tags']/li");
	
		List<WebElement> OPTIONS_LIST_ELEMENT = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		Actions act = new Actions(driver);
	//	act.contextClick(SEARCH_BOX_ELEMENT).
//		System.out.println(OPTIONS_LIST_ELEMENT.size());
//		for (WebElement webElement : OPTIONS_LIST_ELEMENT) {
//		
//			if(webElement.getText().equals("SOAP")) {
//				webElement.click();
//				System.out.println("selecting "+ webElement.getText());
//				break;
//			}
		//}

	}

}
