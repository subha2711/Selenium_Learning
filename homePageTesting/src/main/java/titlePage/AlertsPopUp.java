package titlePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPopUp {

	public static void main(String[] args) throws InterruptedException {

		AlertsMSg();

	}

	public static void AlertsMSg() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");

		 //display alert box 
		WebElement webBox = driver.findElement(By.xpath(
		  "//*[@id=\"contentblock\"]/section/div[1]/div/div/button")); webBox.click();
		  Thread.sleep(3000);
		 

			Alert alert = driver.switchTo().alert();
			alert.accept();
			
			//selecting confirm box
			WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
			confirmButton.click();
			Alert confirmAlert = driver.switchTo().alert();
			Thread.sleep(3000);
			confirmAlert.dismiss();
			
			//selecting prompt box
			WebElement promptBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
			promptBox.click();
			Alert promptAlert = driver.switchTo().alert();
			promptAlert.sendKeys("Hi Subha");
			Thread.sleep(3000);
			promptAlert.accept();
			
			//line break alert
			WebElement lineBreakButton = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/button"));
			lineBreakButton.click();
			Alert LineBreakAlert = driver.switchTo().alert();
			Thread.sleep(3000);
		 LineBreakAlert.accept();

		// sweet alert
		WebElement SweetAlert = driver.findElement(By.id("btn"));
		SweetAlert.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button")).click();

	}
}
