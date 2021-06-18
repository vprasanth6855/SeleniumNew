package SeleniumRevisionPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_04_01_findElementsLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("The size of this array list is: "+linksList.size());
		
		for(int i =0; i<linksList.size(); i++){
			String text = linksList.get(i).getText();
			
			if(text.isEmpty()){
				continue;
			}else{
				System.out.println(text);
			}
		}
		

	}

}
