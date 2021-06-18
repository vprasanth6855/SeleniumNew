package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_07_05_STest_IMPORTANT {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();  //4
		WebDriver driver = new ChromeDriver();    //5
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  //6
		
		By userName = By.id("login1");    //9
		By password = By.id("password");   //10
		By signIn = By.name("proceed");   //11
		
		
		Selenium_07_04_SUtil_IMPORTANT obj = new Selenium_07_04_SUtil_IMPORTANT(driver);//7
		//obj.getElement(locator)  //8
		obj.getElement(userName).sendKeys("test@test.com"); //12
		obj.getElement(password).sendKeys("1234");  //13
		obj.getElement(signIn).click();  //14
	}

}
