package titlePage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

	public static void main(String[] args) {
		EditTextBox();
	}

	public static void EditTextBox() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");

		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("test@gmail.com");

		// If there is already some text present in the text box, selenium will not override it. It will just get added with the existing text
		WebElement appendBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendBox.sendKeys(("text") + Keys.TAB); // adding a text with already existing text.

		WebElement getTextBox = driver.findElement(By.name("username"));
		String value = getTextBox.getAttribute("value");

		System.out.println(value);

		// if the element values are same for different elements, then selenium will
		// choose the first occurrence. In order to avoid this we
		// always have to findthe unique element, which is "id". If we dont have then we
		// can chusse xpath, if an element value of same type is used.
		// here "name" is present for more than one element, so using xpath.
		WebElement clearBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearBox.clear();

		WebElement disableBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enablecheck = disableBox.isEnabled();
		System.out.println(enablecheck);

		driver.close();

	}
}
