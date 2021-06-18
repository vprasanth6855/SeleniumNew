package SeleniumRevisionPackage;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_15_04_HashMapPracticalTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Selenium_15_03_HashMapPracticalUtil obj = new Selenium_15_03_HashMapPracticalUtil(driver);
		Map<String,String> userMap = obj.userCredentials();
		
		//driver.findElement(By.id("login1")).sendKeys(userMap.get("admin").split("_")[0]);
		//driver.findElement(By.id("password")).sendKeys(userMap.get("admin").split("_")[1]);
		
		By login = By.id("login1");
		By pwd = By.id("password");
		By loginBtn = By.name("proceed");
		
		//obj.doLogin(login, "doctor", pwd, loginBtn);
		obj.doLogin(login, pwd, loginBtn, obj.userCredentials(), "patient");
		
		
		
		

	}

}
