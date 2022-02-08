package titlePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		By DRAG_FIELD = By.xpath("//div[@id='draggable']");
		WebElement DRAG_ELEMENT= driver.findElement(DRAG_FIELD);
		
		By DROP_FIELD = By.xpath("//div[@id='droppable']");
		WebElement DROP_ELEMENT= driver.findElement(DROP_FIELD);
		
		Actions actions = new Actions(driver);
	//	actions.clickAndHold(DRAG_ELEMENT).moveToElement(DROP_ELEMENT).release(DROP_ELEMENT).build().perform();
//click and hold(from)--move to drop(target)--release to drop(the picked one). build and perform help to carry out the whole function
		//build and perform--helps to  makes the action to happen that is drag and drop in this case
		
		actions.dragAndDrop(DRAG_ELEMENT, DROP_ELEMENT).build().perform();

	}

}
