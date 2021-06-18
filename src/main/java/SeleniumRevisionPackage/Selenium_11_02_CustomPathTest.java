package SeleniumRevisionPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_11_02_CustomPathTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		By contact = By.xpath("//span[text()='Veena Mohan']//ancestor::td//preceding-sibling::td//span[@class='UICheckbox__PrivateCheckboxIndicator-ubxe0k-1 kaGOZz private-checkbox__indicator']");
		
		Selenium_11_02_CustomPathUtil obj = new Selenium_11_02_CustomPathUtil(driver);
		obj.selectContact("Veena Mohan");
		

	}

}
