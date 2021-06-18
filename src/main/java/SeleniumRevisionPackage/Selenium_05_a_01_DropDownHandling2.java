package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_05_a_01_DropDownHandling2 {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country = By.id("Form_submitForm_Country");
		By industry = By.id("Form_submitForm_Industry");
		
		//selectByVisibleText(country, "Brazil");
		//selectByVisibleText(industry,"Automotive");
		doSelectByIndex(country, 3);
		doSelectByValue(industry, "Agriculture/Forestry");
		
		doSelect("text", country, "Brazil");
	
		
		

	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static void selectByVisibleText(By locator, String value){
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	public static void doSelectByIndex(By locator, int value){
		Select select = new Select(getElement(locator));
		select.selectByIndex(value);
	}
	
	public static void doSelectByValue(By locator,String value ){
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelect(String type, By locator, String value ){
		Select select = new Select(getElement(locator));
		switch (type) {
		case "text":
			select.selectByVisibleText(value);
			break;
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);

		default:
			break;
		}
	}
	

}
