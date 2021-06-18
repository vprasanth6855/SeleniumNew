package SeleniumRevisionPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_02_a_01_HeadlessBrowsersGC {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/veena/Downloads/chromedriver_win32(1).zip/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
