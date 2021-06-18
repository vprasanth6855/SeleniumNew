package SeleniumRevisionPackage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_05_03_DropDownTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropDown = driver.findElement(By.id("dropdown"));
		
		ArrayList<String> values=Selenium_05_02_DropDownUtil.getDropDownValues(dropDown);
		System.out.println(values);
		Selenium_05_02_DropDownUtil.selectByIndex(dropDown, 2);
		Selenium_05_02_DropDownUtil.selectValueFromDropDown(dropDown, "Option 1");
		
		//another method to select the dropdown value
		//String date = "20-Dec-1996";
		//String dataValue[]= date.split("-");
		//Selenium_05_02_DropDownUtil.selectValueFromDropDown(dropDown, dataValue[1]);
		
		String locator = "//select[@id='dropdown']/option";
		Selenium_05_02_DropDownUtil.selectDropDownValueWithoutSelectClass(driver, "Options 1", locator);
		

	}

}
