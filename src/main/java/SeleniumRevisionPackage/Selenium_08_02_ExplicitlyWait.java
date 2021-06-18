package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_08_02_ExplicitlyWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		By userName = By.id("login1");
		By password = By.id("password");
		By signIn = By.name("proceed");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Rediffmail"));
		System.out.println("Title is: "+ driver.getTitle());
		wait.until(ExpectedConditions.presenceOfElementLocated(userName));
		System.out.println("1st element located");
		wait.until(ExpectedConditions.presenceOfElementLocated(password));
		System.out.println("2nd located");
		wait.until(ExpectedConditions.presenceOfElementLocated(signIn));
		System.out.println("3rd located");
		
		WebElement username =driver.findElement(userName);
		username.sendKeys("test@test.com");
		WebElement pwd =driver.findElement(password);
		pwd.sendKeys("1234");
		WebElement sign =driver.findElement(signIn);
		sign.click();
		
		

	}

}
