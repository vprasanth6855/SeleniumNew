package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_08_03_ExplicitlyUtil {
	WebDriver driver;
	
	public Selenium_08_03_ExplicitlyUtil(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getElement(By locator){
		WebElement element = null;
		try{
			//explicitlyWait(locator);        //we can use it here one way
			element = driver.findElement(locator);
		}catch(Exception e){
			System.out.println("some excpetion occurred");
			e.getMessage();
		}
		return element;
	}
	
	public void explicitlyWait(By locator, int timeOut){    //another way
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	public void explicitlyWaitTitle(int timeOut, String value){
		WebDriverWait wait = new WebDriverWait(driver,timeOut );
		wait.until(ExpectedConditions.titleContains(value));		
	}
	
	public void doClick(By locator){
		try{
		getElement(locator).click();
		}catch(Exception e){
			System.out.println("some exception occurred");
			System.out.println(e.getMessage());
		}
	}
	
	public void doSendKeys(By locator, String value){
		try{
		getElement(locator).sendKeys(value);
		}catch(Exception e){
			System.out.println("some exception occurred");
			System.out.println(e.getMessage());
		}
	}
	
	public void doActionSendKey(By locator, String value){
		Actions action = new Actions(driver);
		WebElement element = getElement(locator);
		action.sendKeys(element,value).build().perform();
		//OR
		//action.sendKeys(getElement(locator),value).build().perform();	
	}
	
	public void doActionClick(By locator){
		Actions action = new Actions(driver);
		WebElement element = getElement(locator);
		action.click(element).build().perform();;
	}
	
	
	

}
