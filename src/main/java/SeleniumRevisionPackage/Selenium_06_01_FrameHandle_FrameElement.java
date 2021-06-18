package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_06_01_FrameHandle_FrameElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		//String title = driver.findElement(By.cssSelector("body > h2")).getText();
		//System.out.println(title);
		
		WebElement frameElement = driver.findElement(By.name("main"));
		driver.switchTo().frame(frameElement);
		String title = driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(title);
		
	}

}
