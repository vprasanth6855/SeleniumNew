package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_07_07_ExceptionHandlingInSeleniumTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		By userName = By.id("login1");
		By password = By.id("password");
		By signIn = By.name("proceed");
		
		Selenium_07_06_ExceptionHandligInSeleniumUtil obj = new Selenium_07_06_ExceptionHandligInSeleniumUtil(driver);
		//obj.getElement(userName).sendKeys("test@test.com");
		//obj.getElement(password).sendKeys("1234");
		//obj.getElement(signIn).click();
		
		obj.doSendKeys(userName, "test@test.com");
		obj.doSendKeys(password, "1234");
		obj.doClick(signIn);
		
		
		

	}

}
