package titlePage;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsOptions {

	public static void main(String[] args) {

		Buttons();
	}

	public static void Buttons() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");

		// find position of button
		WebElement getPosition = driver.findElement(By.id("position"));
		// to find the position of the button, there is a built in class in selenium
		// called point
		Point pointXY = getPosition.getLocation();
		int x = pointXY.getX();
		int y = pointXY.getY();
		System.out.println("x values is : " + x);
		System.out.println("y value is : " + y);

		// finding color
		WebElement buttonColor = driver.findElement(By.id("color"));
		String color = buttonColor.getCssValue("background-color");
		System.out.println("Button color is: " + color);

		// find height and width
		WebElement sizeButton = driver.findElement(By.id("size"));
		int height = sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getWidth();
		System.out.println("Height is : "+ height);
		System.out.println("Width is : "+ width);

		//goto home
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();
		
	}
}
