package SeleniumRevisionPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_10_01_CustomXPath {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='username']"));  //with one property
		driver.findElement(By.xpath("//input[@id='username' and @type='text']")); //with two properties
		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']"));//with cascaded classes
		driver.findElement(By.xpath("//input[contains(@id, 'username')]")); //contains function 
		driver.findElement(By.xpath("//input[contains(@class,'login-email')]")); //contains function with any of one classes off cascaded
		driver.findElement(By.xpath("//input[@id='username' and contains(@class,'login-email')]"));//with both the property and the contains function
		driver.findElement(By.xpath("//input[@id='username' and contains(@class,'')]")); //this will also work,(with id of given value and with any of classes
		driver.findElement(By.xpath("//input[contains(@id, 'test_')]"));//used for dynamic ids, name, classes etc

		driver.findElement(By.xpath("//input[contains(@class,'form-control')]")); //contains function with one of cascaded class
		driver.findElement(By.xpath("(//input[contains(@class,'form-control')])[1]")); //first element by passing the index
		driver.findElement(By.xpath("(//input[contains(@class,'form-control')])[2]")); //second element by passing the index
		driver.findElement(By.xpath("(//input[contans(@class,'form-control')])(position()=1)")); //first element using position function
		driver.findElement(By.xpath("(//input[contans(@class,'form-control')])(position()=2)")); //second element using position function
		driver.findElement(By.xpath("(//input[contains(@class,'form-control')])[last()]")); //with last() function
		driver.findElement(By.xpath("////i18n-string")); //i18n-string xpath
		driver.findElement(By.xpath("(//i18n-string)[2]"));
		driver.findElement(By.xpath("//i18n-string[text()='Forgot my password']")); //with text function
		driver.findElement(By.xpath("//*[text()='Forgot my password']")); //we can use with * also
		driver.findElement(By.xpath("//b[text()='Wrong username and password combination.']")); //text function for error messages
		driver.findElement(By.xpath("//i18n-string[text()='Don't have an account?']")); //worked well with single quotes (though it had contraction )
		driver.findElement(By.xpath("//span[text()='Show Password']"));  //with span tag
		driver.findElement(By.xpath("//span[contains(text(),'Show Password')]"));//contains with text function
		driver.findElement(By.xpath("//span[contains(text(),'Show')]")); //possible
		driver.findElement(By.xpath("//span[contains(text(),'Password')]"));//possible
		driver.findElement(By.xpath("//i18n-string[contains(text(),'account')]")); //because Don't have an account didnt work earlier. but here it works
		driver.findElement(By.xpath("//span[starts-with(@class,'account-name')]")); //using starts-with function
		driver.findElement(By.xpath("/span[starts-with(@class,'account')]")); // we can write this way also
		driver.findElement(By.xpath("//h1[starts-with(text(), 'Sales')]")); //starts-with using text
		
		
	}

}
