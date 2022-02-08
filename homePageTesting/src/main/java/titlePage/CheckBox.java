package titlePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		CheckBoxSelection();

	}

	public static void CheckBoxSelection() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");

		// selecting a language from checkbox
		WebElement lang = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
		lang.click();

		// confirm a box is selected
		WebElement select = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		boolean choice = select.isSelected();
		System.out.println("selected choice is :" + choice);
		
		WebElement firstElement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		if(firstElement.isSelected()) {
			firstElement.click();
		}
		
	
		WebElement secondElement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		if(secondElement.isSelected()) {}
		secondElement.click();
		
		//select all
		WebElement SelectAll = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input"));
		SelectAll.click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input")).click();
		
	}
}
