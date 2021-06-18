package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_13_02_JavascriptTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Selenium_13_01_JavaScriptUtil obj = new Selenium_13_01_JavaScriptUtil(driver);
		System.out.println(obj.getTitleByJs());
		
		//obj.generateAlert("This is testing");
		
		obj.refresh();
		
		String userAgents = obj.getBrowserinfo();
		System.out.println(userAgents);
		
		obj.sendKeyUsingJSWithId("login1", "veena@test.com");
		obj.sendKeyUsingJSWithId("password", "12345");
		
		WebElement signIn = driver.findElement(By.name("proceed"));
		//obj.clickElementByJs(signIn);
		//obj.drawBorder(signIn);
		
		WebElement loginTable = driver.findElement(By.xpath("(//div[@class='table'])[1]"));
		//obj.drawBorderForLoginTable(loginTable);
		//obj.flash(loginTable);
		
		//String innerText = obj.getInnerText();
		//System.out.println(innerText);
		
		//obj.scrollPageDown();
		
		WebElement forgotPassword = driver.findElement(By.linkText("Forgot Password?"));
		obj.scrollIntoView(forgotPassword);
		
		
		
		
		
		
	}

}
