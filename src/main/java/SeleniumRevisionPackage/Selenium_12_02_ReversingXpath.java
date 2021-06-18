package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_12_02_ReversingXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://app.hubspot.com/");
		
		//the way we learned
		driver.findElement(By.xpath("//input[@id='username'//parent::div]"));
		//without parent we can write it like this
		driver.findElement(By.xpath("//input[@id='username']/.."));
		//two levels above the current div
		driver.findElement(By.xpath("//input[@id='username']/../.."));
		
		//suppose we want to get the id of this particular form
		String formId = driver.findElement(By.cssSelector("//input[@id='username']/../../../../..")).getAttribute("id");
		System.out.println("Form id is: "+ formId);

	}

}
