package SeleniumRevisionPackage;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selenium_15_03_HashMapPracticalUtil {

	WebDriver driver;

	public Selenium_15_03_HashMapPracticalUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public Map<String, String> userCredentials() {
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin_admin");
		userMap.put("patient", "tom@test.com_test123");
		userMap.put("doctor", "peter@test.com_test1234");

		return userMap;
	}

	// public void doLogin(By locator1, String myKey, By locator2, By locator3){
	// Map<String,String> userMap = userCredentials();
	// getElement(locator1).sendKeys(userMap.get(myKey).split("_")[0]);
	// getElement(locator2).sendKeys(userMap.get(myKey).split("_")[1]);
	// getElement(locator3).click();
	//
	// }

	// here we can do other way as well like passing the Map in arguments

	public void doLogin(By locator1, By locator2, By locator3, Map<String, String> userMap, String myKey) {
		getElement(locator1).sendKeys(userMap.get(myKey).split("_")[0]);
		getElement(locator2).sendKeys(userMap.get(myKey).split("_")[1]);
		getElement(locator3).click();
	}
}
