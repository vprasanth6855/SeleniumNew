package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_07_01_ActionSendKey {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement username = driver.findElement(By.id("login1"));
		WebElement password = driver.findElement(By.id("password"));
		
		Actions action = new Actions(driver);
		action.sendKeys(username, "test@test.com").build().perform();
		action.sendKeys(password, "1234").build().perform();
	}

}
