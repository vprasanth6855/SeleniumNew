package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_04_05_getErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("test@gmail.com");;
		driver.findElement(By.id("password")).sendKeys("1234");;
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		String errorMessage = driver.findElement(By.id("div_login_error")).getText();
		System.out.println(errorMessage);
		
		

	}

}
