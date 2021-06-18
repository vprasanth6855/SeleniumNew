package SeleniumRevisionPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_06_02_Framehandle_Frameindex {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		//WebElement frameElement = driver.findElement(By.name("main"));
		//driver.switchTo().frame(2);
		//String title = driver.findElement(By.cssSelector("body > h2")).getText();
		//System.out.println(title);
		
		//finding number of frames
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		System.out.println("number of frames: "+frames.size());

	}

}
