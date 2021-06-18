package SeleniumRevisionPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_16_02_ChromeAndFF {

	public static void main(String[] args) {
		
		
		String browser = "Chrome";
		
		if(browser.equals("Chrome")){
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
		}
		

	}

}
