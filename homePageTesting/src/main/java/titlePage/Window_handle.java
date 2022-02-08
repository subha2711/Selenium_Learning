package titlePage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");

		String oldWindow = driver.getWindowHandle();
		WebElement firstButton = driver.findElement(By.xpath("//button[text()='Open Home Page']"));
		firstButton.click();

//		Set<String> handles = driver.getWindowHandles(); // has old window and new window
//
//		for (String newHandle : handles) {
//			driver.switchTo().window(newHandle);
//		}
//		WebElement editbox = driver
//				.findElement(By.xpath("//img[@alt='Edit / Text Fields' and @class='wp-categories-icon svg-image']"));
//		editbox.click();
//		driver.close();
////	driver.getWindowHandle();		or can use
//		driver.switchTo().window(oldWindow);
//		WebElement multibox = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
//		multibox.click();
//		int size = driver.getWindowHandles().size();
//		System.out.println("no of window opened" + size);
//
//		WebElement dontclose = driver.findElement(By.xpath("//button[text()='Do not close me ']"));
//		dontclose.click();
//		
//	Set<String>newWindowHandle=	driver.getWindowHandles();
//	
//	for (String allwindows : newWindowHandle) {
//		if(!allwindows.equals(oldWindow)) {
//			driver.switchTo().window(allwindows);
//			driver.close();
//		}
//		
//	}
//	driver.quit();
}

}
