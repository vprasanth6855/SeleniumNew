package SeleniumRevisionPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Selenium_02_a_02_HeadlessbrowsersFF {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/veena/Downloads/geckodriver-v0.29.0-win64/geckodriver.exe");
		//downloaded geckodriver and pls note the systemProperty key
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
