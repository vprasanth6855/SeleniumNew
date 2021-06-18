package SeleniumRevisionPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_05_04_DropDownWithoutSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropDown = driver.findElement(By.id("dropdown"));
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='dropdown']/option"));
		System.out.println(options.size());
		//ArrayList<String> ar = new ArrayList<String>();
		
		//for(int i =0; i<options.size();i++){
		//	ar.add(options.get(i).getText());
		//}
		
	   // System.out.println(ar);
		
		//or
		for(int i=0;i<options.size();i++){
			String text = options.get(i).getText();
			System.out.println(text);
			if(text.equals("Option 2")){
				options.get(i).click();
				break;
			}
		}
		

	}

}
