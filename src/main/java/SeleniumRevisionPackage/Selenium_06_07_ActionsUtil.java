package SeleniumRevisionPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Selenium_06_07_ActionsUtil {
	
	
	public WebElement getElement(By locator, WebDriver driver){
		return driver.findElement(locator);
	}
	
	public ArrayList<String> getRightClickOptions(WebDriver driver, By locator){
		Actions action = new Actions(driver);
		action.contextClick(getElement(locator,driver)).build().perform();
		
		List<WebElement> options = driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-icon')]/span"));
		ArrayList<String> ar = new ArrayList<String>();
		for(int i=0;i<options.size();i++){
			String text= options.get(i).getText();
			ar.add(text);
		}
		
		return ar;
	

}
}
