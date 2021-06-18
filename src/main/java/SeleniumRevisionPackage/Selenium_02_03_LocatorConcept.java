package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_02_03_LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/veena/Downloads/chromedriver_win32(1).zip/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		
		WebElement email =  driver.findElement(By.name("email"));
		email.sendKeys("veenasmohan04@gmail.com");
		//driver.findElement(By.name("email")).sendKeys("veenasmohan04@gmail.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("MadhavNeerav@6855");
		//driver.findElement(By.name("password")).sendKeys("MadhavNeerav@6844");
		
		WebElement login = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/form/input"));
		login.click();
	}

}
