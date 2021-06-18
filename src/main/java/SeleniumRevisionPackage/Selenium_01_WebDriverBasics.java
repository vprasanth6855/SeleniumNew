package SeleniumRevisionPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_01_WebDriverBasics {

	public static WebDriver driver = null;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/veena/Downloads/chromedriver_win32(1).zip/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")){
			System.out.println("correct title");
		}
		else{
			System.out.println("in-correct title");
		}
		driver.quit();
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		

	}

}
