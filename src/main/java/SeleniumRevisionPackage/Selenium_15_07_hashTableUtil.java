package SeleniumRevisionPackage;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selenium_15_07_hashTableUtil {

	WebDriver driver;
	
	public Selenium_15_07_hashTableUtil(WebDriver driver){
		this.driver=driver;
	}
	
	public WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	/**
	 * This is how we print hashMap
	 */
	public void hashmapPrinting(){
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("id", "1");
		userMap.put("name", "Veena");
		userMap.put("city", "Bangalore");
		
		System.out.println(userMap);
	}
	/**
	 * printing hastable
	 */
	public void hashTablePrinting(){
		Hashtable<String, Integer> productTable = new Hashtable<String, Integer>();
		productTable.put("Apple MacBook", 2000);
		productTable.put("Windows HP LapTop", 1000);
		productTable.put("Apple iPhoneX", 1500);
		
		System.out.println(productTable);
		System.out.println(productTable.get("Apple MacBook"));
		
		for(Map.Entry m:productTable.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
