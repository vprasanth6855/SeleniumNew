package SeleniumRevisionPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_15_08_hashTableTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Selenium_15_07_hashTableUtil obj = new Selenium_15_07_hashTableUtil(driver);
		obj.hashmapPrinting();
		obj.hashTablePrinting();

	}

}
