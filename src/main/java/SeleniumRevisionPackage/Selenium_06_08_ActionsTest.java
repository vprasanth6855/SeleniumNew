package SeleniumRevisionPackage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_06_08_ActionsTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		By rightClickMe = By.className("context-menu-one");
		
		
		
		Selenium_06_07_ActionsUtil obj = new Selenium_06_07_ActionsUtil();
		ArrayList<String> Options = obj.getRightClickOptions(driver,rightClickMe);
		System.out.println(Options);

	}

}
