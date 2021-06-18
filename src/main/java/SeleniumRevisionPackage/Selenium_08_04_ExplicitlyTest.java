package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_08_04_ExplicitlyTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		By userName = By.id("login1");
		By password = By.id("password");
		By signIn = By.name("proceed");
		
		Selenium_08_03_ExplicitlyUtil obj = new Selenium_08_03_ExplicitlyUtil(driver);
		obj.explicitlyWaitTitle(5, "Rediff");
		System.out.println(driver.getTitle());
		obj.explicitlyWait(userName, 5);
		//obj.doSendKeys(userName, "test@test.com");
		//or
		obj.doActionSendKey(userName, "test@test.com");
		//obj.doSendKeys(password, "1234");
		//or
		obj.doActionSendKey(password, "1234");
		obj.explicitlyWait(signIn, 2);
		//obj.doClick(signIn);
		//or
		obj.doActionClick(signIn);
	}

}
