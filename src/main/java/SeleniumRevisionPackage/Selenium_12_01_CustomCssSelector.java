package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_12_01_CustomCssSelector {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://app.hubspot.com/");
		
		//css selector with id
		driver.findElement(By.cssSelector("#username"));
		//or we can use along with the html tag
		driver.findElement(By.cssSelector("input#username"));
		//we can use it also like this
		driver.findElement(By.cssSelector("input[id='username'][type='email']"));
		
		//if class is available- cascaded class can be used
		driver.findElement(By.cssSelector(".form-control.private-form__control.login-email"));
		//or we can use like
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email"));
		//using only unique class
		driver.findElement(By.cssSelector("input.login-email"));
		
		//if text is available- id starting with the text
		driver.findElement(By.cssSelector("input[id^='username']"));
		//if text is available- id ending with the text
		driver.findElement(By.cssSelector("input[id$='username']"));
		//so it can alos be like-
		driver.findElement(By.cssSelector("input[id$='name']"));
		
		//contains() in css
		driver.findElement(By.cssSelector("input[id*='username']"));
		//so it can be like-
		driver.findElement(By.cssSelector("input[id*='user']"));
		
		//using parent and child in css- here from parent to child
		driver.findElement(By.cssSelector("div>input[id='username']"));
		//using div with classname
		driver.findElement(By.cssSelector("div.private-form__input-wrapper")); //here we may see 2results. but we want to go to a specific child
		//div with classname and going to child from there. so specify the child over here
		driver.findElement(By.cssSelector("div.private-form__input-wrapper>input[id='username']"));
		//id using character
		driver.findElement(By.cssSelector("div.private-form__input-wrapper>input#username"));
		

	}

}
