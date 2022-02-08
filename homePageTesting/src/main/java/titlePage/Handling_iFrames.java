package titlePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_iFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().frame(0);
		WebElement BUTTON_ELEMENT = driver.findElement(By.xpath("//button[@id='Click']"));
		BUTTON_ELEMENT.click();
		String text = driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println(text);
		
		//switching to original window
		driver.switchTo().defaultContent();
		
		//switching to second frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement BUTTON2_ELEMENT = driver.findElement(By.cssSelector("button[id='Click1']"));
		BUTTON2_ELEMENT.click();
		String text1=BUTTON2_ELEMENT.getText();
		System.out.println(text1);
	
		driver.switchTo().defaultContent();
	//total number of frames
	List<WebElement> totalFrames=	driver.findElements(By.tagName("iframe"));
	int size = totalFrames.size();
	System.out.println(size);
	driver.close();
		
		

	}

}
