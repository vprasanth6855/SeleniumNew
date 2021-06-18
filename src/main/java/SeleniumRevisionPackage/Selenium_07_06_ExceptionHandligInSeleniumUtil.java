package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selenium_07_06_ExceptionHandligInSeleniumUtil {

	WebDriver driver;
	
	public Selenium_07_06_ExceptionHandligInSeleniumUtil(WebDriver driver){
		this.driver = driver;
	}
	/**
	 * This method is to create the webElement
	 * @param locator
	 * @return
	 */
	
	public WebElement getElement(By locator){
		WebElement element=null;
		try{
		 element = driver.findElement(locator);
		 Selenium_13_01_JavaScriptUtil obj1= new Selenium_13_01_JavaScriptUtil(driver);//will see for the session Selenium 13
		 obj1.flash(element);
		}catch(Exception e){
		System.out.println("some excpetion occurred while creating the element");
		System.out.println(e.getMessage());
		}
		return element;
	}
	
	/**
	 * This method is to cick on an element
	 * @param locator
	 */
	
	public void doClick(By locator){
		try{
		getElement(locator).click();
		}catch(Exception e){
			System.out.println("some exception occurred");
			System.out.println(e.getMessage());
		}
	}
	/**
	 * This method is to pass the values
	 * @param locator
	 * @param value
	 */
	
	public void doSendKeys(By locator, String value){
		try{
		getElement(locator).sendKeys(value);
		}catch(Exception e){
			System.out.println("some exception occurred");
			System.out.println(e.getMessage());
		}
	}
}
