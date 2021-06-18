package SeleniumRevisionPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Selenium_11_03_customPathCRMUtil {
	
	WebDriver driver;
	
	public Selenium_11_03_customPathCRMUtil(WebDriver driver){
		this.driver=driver;
	}
	
	public void selectContact(String contactName, WebElement element1, WebElement element2, WebElement element3, String userName, String pwd){
		Actions action = new Actions(driver);
		action.sendKeys(element1, "veenasmohan04@gmail.com").build().perform();
		action.sendKeys(element2, "MadhavNeerav@6855").build().perform();
		action.click(element3).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(driver.findElement(By.xpath("//a[contains(text(),'"+contactName+"')]//parent::td//preceding-sibling::td//input[@name='id' and @type='checkbox']"))).build().perform();;
	}
	
	public String getAddress( WebElement element1, WebElement element2, WebElement element3){
		Actions action = new Actions(driver);
		action.sendKeys(element1, "veenasmohan04@gmail.com").build().perform();
		action.sendKeys(element2, "MadhavNeerav@6855").build().perform();
		action.click(element3).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement address = driver.findElement(By.xpath("//a[contains(text(),'Prasanth S K')]//parent::td//following-sibling::td[contains(text(),'EP1')]"));
		return address.getText();
	}

}
