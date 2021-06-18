package SeleniumRevisionPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_05_01_DropDownHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropDown = driver.findElement(By.id("dropdown"));
		
		//Select select = new Select(dropDown);
		//select.selectByVisibleText("Option 2");
		//select.selectByIndex(1);
		
		//selectValueFromDropDown(dropDown, "Option 1");
		selectByIndex(dropDown, 2);
		getDropDownValues(dropDown);

	}
	/**
	 * this method is to select the value from a drop down
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropDown(WebElement element, String value){
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	/**
	 * this method is to select the value by index
	 * @param element
	 * @param index
	 */
	public static void selectByIndex(WebElement element, int index){
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	/**
	 * This method is to get the options
	 * @param element
	 */
	
	public static void getDropDownValues(WebElement element){
		System.out.println("======================================");
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		System.out.println("The total number in the list: "+options.size());
		
		for(int i=0; i<options.size();i++){
			System.out.println(options.get(i).getText());
		}
	}

}
