package DropDown_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSorting {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		By ANIMAL_DROPDOWN_FIELD =By.xpath("//select[@id='animals']");
		WebElement ANIMAL_DROPDOWN_ELEMENT =driver.findElement(ANIMAL_DROPDOWN_FIELD);
		
		Select select= new Select(ANIMAL_DROPDOWN_ELEMENT);
		select.selectByIndex(2);
		select.selectByVisibleText("Avatar");
		
		List originalList = new ArrayList();
		List tempList = new ArrayList();
		
		List<WebElement>options =select.getOptions();
		for (WebElement e : options) {
			originalList.add(e.getText());
			tempList.add(e.getText());
		}
		List temp = new ArrayList();
	//	temp=originalList;
		System.out.println("Before sorting temp "+temp);
		Collections.sort(tempList);
		System.out.println("after sorting temp "+ temp);
		System.out.println(originalList);
		if(originalList==tempList)
			System.out.println("dropdown sorted");
		else
			System.out.println("dropdown not sorted");

	}

}
