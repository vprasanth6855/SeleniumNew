package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Selenium_06_09_ActionsSpicejetUtil {
	
	public WebElement getElement(WebDriver driver,By locator){
		return driver.findElement(locator);
	}
	
	public void memLogin(WebDriver driver, By locator1, By locator2, By locator3) throws InterruptedException{
		Actions action = new Actions(driver);
		action.moveToElement(getElement(driver,locator1)).build().perform();
		Thread.sleep(3000);
		action.moveToElement(getElement(driver,locator2)).build().perform();
		Thread.sleep(3000);
		getElement(driver,locator3).click();
		
	}
	

}
