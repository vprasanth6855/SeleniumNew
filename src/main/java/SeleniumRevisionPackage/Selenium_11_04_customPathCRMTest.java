package SeleniumRevisionPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_11_04_customPathCRMTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.cogmento.com/contacts");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.xpath("//div[contains(@class,'submit button')]"));
		
		
		
		Selenium_11_03_customPathCRMUtil obj = new Selenium_11_03_customPathCRMUtil(driver);
		//obj.selectContact("Prasanth S K", username, password,login, "veenasmohan04@gmail.com", "MadhavNeerav@6855");
		
		String address = obj.getAddress(username, password, login);
		System.out.println(address);
		driver.close();

	}

}
