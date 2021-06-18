package SeleniumRevisionPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_16_01_ChromeAndFF {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new ChromeDriver(); //opening chrome browser
		
		driver=new FirefoxDriver();   //opening firefoxdriver with the same driver

	}

}
