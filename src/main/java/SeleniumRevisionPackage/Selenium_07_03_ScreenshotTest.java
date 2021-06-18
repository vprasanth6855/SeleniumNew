package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_07_03_ScreenshotTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Selenium_07_02_ScreenshotUtil obj = new Selenium_07_02_ScreenshotUtil();
		//obj.screenShot(driver, "page1");
		
		By userName = By.id("login1");
		By password = By.id("password");
		By signIn = By.name("proceed");
		
		driver.findElement(userName).sendKeys("test@test.com");
		driver.findElement(password).sendKeys("1234");
		
		
		Selenium_07_02_ScreenshotUtil obj1 = new Selenium_07_02_ScreenshotUtil();
		obj1.screenShotElement(userName, "userNameElementNew", driver);
		obj1.screenShotElement(password, "passwordElementNew", driver);
		obj1.screenShotElement(signIn, "signInElementNew", driver);
		
		driver.findElement(signIn).click();
		obj1.screenShot(driver, "errorMessageNew");
		
		
	}

}
