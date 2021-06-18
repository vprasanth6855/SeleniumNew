package SeleniumRevisionPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_11_01_CustomXPath_2 {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//following 
		//here we will see the divs available under that specific div, without going to child hierarchy like input
		//ie- div>next parallel div and other subsequent divs
		driver.findElement(By.xpath("//div[@class='private-form__input-wrapper']//following::div"));
		//for going to the child hierarchy-it may go to the div direct input and also div>div>input also
		driver.findElement(By.xpath("//div[@class='private-form__input-wrapper']//following::input"));
		//without following from div(Parent) to input(direct child). ie for going to teh child hierarchy
		driver.findElement(By.xpath("//div[@class='input-group']/input[@name='username']"));
		//same with following- ie for going to teh child hierarchy
		driver.findElement(By.xpath("//div[@class='input-group']//following::input[@name='username']"));
		//same if name is not available
		driver.findElement(By.xpath("(//div[@class='input-group']//following::input)[1]"));
		
		//preceding
		//not that current parent div, but the parallel preceding div to the parent div and other subsequent preceding divs
		driver.findElement(By.xpath("//input[@name='username']//preceding::div"));
		//preceding div by mentioning a specific class
		driver.findElement(By.xpath("//input[@name='username']//preceding::div[@class='collapse navbar-collapse']"));
		
		//parent
		//for going to immediate parent
		driver.findElement(By.xpath("//input[@name='username']//parent::div"));
		
		//child
		//for going to children
		//ie div>direct child and div>div>child
		driver.findElement(By.xpath("//div[@class='input-group']//child::input")); 
		//for going to the specific child
		driver.findElement(By.xpath("//div[@class='input-group']//child::input[@name='username']"));
		
		//ancestor
		//going to all the oldest parents and also the other div inside that particular div
		driver.findElement(By.xpath("//div[@class='input-group']//ancestor::div")); 
		//going to the specific ancestor
		driver.findElement(By.xpath("//div[@class='input-group']//ancestor::div[@class='container']"));
		//reverse traversing
		driver.findElement(By.xpath("//span[text()='Veena Mohan']//ancestor::td//preceding-sibling::td//child::input")); //with input is not working as teh controler points out of the checkbox
		//so we just grab the span just above the input
		driver.findElement(By.xpath("//span[text()='Veena Mohan']//ancestor::td//preceding-sibling::td//span[@class='UICheckbox__PrivateCheckboxIndicator-ubxe0k-1 kaGOZz private-checkbox__indicator']"));
		//crm complex case
		driver.findElement(By.xpath("//a[contains(text(),'Prasanth S K')]//parent::td//preceding-sibling::td//input[@name='id' and @type='checkbox']"));
	}

}
