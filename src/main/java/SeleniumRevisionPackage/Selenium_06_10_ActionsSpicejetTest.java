package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_06_10_ActionsSpicejetTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		
		By login = By.id("ctl00_HyperLinkLogin");
		By spiceClub = By.linkText("SpiceClub Members");
		By memberLogin = By.linkText("Member Login");
		
		Selenium_06_09_ActionsSpicejetUtil obj = new Selenium_06_09_ActionsSpicejetUtil();
		obj.memLogin(driver, login, spiceClub, memberLogin);
		
		
	}

}
