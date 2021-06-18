package SeleniumRevisionPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_04_03_findElementsImages {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Image count is: "+images.size());
		
		for(int i=0; i<images.size();i++){
			String imgUrl = images.get(i).getAttribute("src");
			System.out.println(imgUrl);
		}

	}

}
