package SeleniumRevisionPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selenium_05_02_DropDownUtil {
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
	
	public static ArrayList<String> getDropDownValues(WebElement element){
		System.out.println("======================================");
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		System.out.println("The total number in the list: "+options.size());
		
		ArrayList<String> ar = new ArrayList<String>();
		
		
		for(int i=0; i<options.size();i++){
			ar.add(options.get(i).getText());
		}
		
		return ar;

}
	/**
	 * This is to select the value without using select class
	 */
	public static void selectDropDownValueWithoutSelectClass(WebDriver driver, String value, String locator){
		List<WebElement> options = driver.findElements(By.xpath(locator));
		System.out.println("Total number in list: "+options.size());
		
		for(int i=0; i<options.size();i++){
			String text=options.get(i).getText();
			if(text.equals(value)){
				options.get(i).click();
			}
		}
	}
}