package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selenium_07_04_SUtil_IMPORTANT {
	
	WebDriver driver;  //1
	
	public Selenium_07_04_SUtil_IMPORTANT(WebDriver driver){  //2
		this.driver = driver;
	}
	
	public WebElement getElement(By locator){  //3
		return driver.findElement(locator);
	}
	
	

}
