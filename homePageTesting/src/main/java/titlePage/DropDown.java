package titlePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		dropDownOption();
	}

	public static void dropDownOption() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");

		// select using index
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		// to handle the elements inside the dropdown ,selenium has a class called
		// select
		Select select = new Select(dropdown1); // this will listout all the elements in the dropdown1
		select.selectByIndex(2);
		//Thread.sleep(5000);

		// select using value
		select.selectByValue("1");
	//	Thread.sleep(5000);

		// select using visible text
		select.selectByVisibleText("UFT/QTP");

		// get the number of dropdown options
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println("number of options in the dropdowns are :" + size);
		
		//using the sendKeys
		dropdown1.sendKeys("Loadrunner");
		
		//multi select
		WebElement multiElement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multiElementBox = new Select(multiElement);
		multiElementBox.selectByIndex(1);
		multiElementBox.selectByIndex(2);
		multiElementBox.selectByIndex(3);
		
	}
}
