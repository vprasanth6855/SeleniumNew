package SeleniumRevisionPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_20_01_OrangeHrmWindowhandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();   //it is just pointing above the set object. ie above the parent id memory location
		
		String parentWindowId = it.next();
		System.out.println("parent window id is: "+parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id is: "+childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window title is: "+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is: "+driver.getTitle());
		
		driver.quit();
		
		
		
	}

}
