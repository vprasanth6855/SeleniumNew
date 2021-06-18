package SeleniumRevisionPackage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_08_b_02_ExplicitlyTest2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		By username = By.id("login1");
		By password = By.id("password");
		By signIn = By.name("proceed");
		By createNewAccount = By.linkText("Create a new account");
		
		
		
		
		Selenium_08_b_01_ExplicitlyUtil2 obj = new Selenium_08_b_01_ExplicitlyUtil2(driver);
		WebElement element1 =obj.getElement(username);
		WebElement element2 =obj.getElement(password);
		WebElement element3 =obj.getElement(signIn);
		WebElement element4 =obj.getElement(createNewAccount);
		
		ArrayList elements = new ArrayList();
		elements.add(element1);
		elements.add(element2);
		elements.add(element3);
		elements.add(element4);
		
		obj.visibilityOfAllElements(5, elements);
		System.out.println("all elements found");
		
		//obj.clickWhenready(5, createNewAccount);
		//System.out.println(obj.explicitlyWaitForTitle(5, "Rediff"));
		//obj.explicitlyWaitWithReturn(5, username).sendKeys("test@test.com");
		//obj.getElement(password).sendKeys("1234");
		//obj.explicitlyWaitWithReturn(5, signIn).click();
	}

}
