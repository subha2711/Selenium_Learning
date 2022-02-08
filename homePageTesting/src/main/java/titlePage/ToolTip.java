package titlePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	//toolTip is the text that get displayed when we hover over a text box. for example when we hover over user id, then it may give a mesage as enter ur login id.
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		By NAME_FIELD = By.xpath("//input[@id='age']");
		WebElement NAME_ELEMENT=driver.findElement(NAME_FIELD);
	String text= 	NAME_ELEMENT.getAttribute("title");
	System.out.println(text);
	}

}
