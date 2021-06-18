package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Selenium_11_02_CustomPathUtil {
	
	WebDriver driver;
	
	public Selenium_11_02_CustomPathUtil(WebDriver driver){
		this.driver=driver;
	}
	
	
	public void selectContact(String contactName){
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.xpath("//span[text()='"+contactName+"']//ancestor::td//preceding-sibling::td//span[@class='UICheckbox__PrivateCheckboxIndicator-ubxe0k-1 kaGOZz private-checkbox__indicator']"))).build().perform();
		
	}
}
