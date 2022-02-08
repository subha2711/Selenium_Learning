package titlePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonOptions {

	public static void main(String[] args) {

		Radiobutton();

	}

	public static void Radiobutton() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");

		WebElement unchecked = driver.findElement(By.xpath("//*[@id=\"yes\"]"));
	
		
		WebElement checked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
	boolean status1 =	unchecked.isSelected();
			boolean status2 = checked.isSelected();
			
			System.out.println("unchecked is:"+ status1);
			System.out.println("checked is:"+ status2);
			
			WebElement below20 = driver.findElement(By.name("age"));
			below20.click();
	}
}
