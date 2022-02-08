package titlePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable_learning {

	//selectable is selection of more than one option from a list. ctrl+ element will let us to select multiple element
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		By NAME_FIELD = By.xpath("//ol[@id='selectable']/li");		//li will give all the the elements in the list
	List	<WebElement >NAME_ELEMENT=driver.findElements(NAME_FIELD);
	int size = NAME_ELEMENT.size();
	System.out.println(size);
	Actions action = new Actions(driver);
	//action.keyDown(Keys.CONTROL).click(NAME_ELEMENT.get(0)).click(NAME_ELEMENT.get(1)).click(NAME_ELEMENT.get(2)).build().perform();
	
	Actions act = new Actions(driver);
	act.clickAndHold(NAME_ELEMENT.get(0));
	act.clickAndHold(NAME_ELEMENT.get(1));
	act.clickAndHold(NAME_ELEMENT.get(2));
	act.build().perform();
		
	}

}
