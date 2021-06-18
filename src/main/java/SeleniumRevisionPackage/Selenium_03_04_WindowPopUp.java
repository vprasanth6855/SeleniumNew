package SeleniumRevisionPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_03_04_WindowPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String pId = it.next();
		System.out.println("Parent window Id is "+ pId);
		
		String chId = it.next();
		System.out.println("Child window id is "+ chId);
		
		driver.switchTo().window(chId);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(pId);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
