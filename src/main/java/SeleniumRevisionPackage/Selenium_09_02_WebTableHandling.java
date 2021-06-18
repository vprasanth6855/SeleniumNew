package SeleniumRevisionPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_09_02_WebTableHandling {
 static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		By rows = By.xpath("//table[@id='customers']//tr");
		
		int rowCount = getRowCount(rows);
		System.out.println("The total number of rows: "+ rowCount);
		
		ArrayList<String> values = columnValues(rows);
		for(int i=0; i<values.size();i++){
			System.out.println(values.get(i));
		}
		driver.close();
	}
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static int getRowCount(By locator){
		return getElements(locator).size()-1; //excluding column row
	}
	
	public static ArrayList<String> columnValues(By locator){
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		ArrayList<String> ar = new ArrayList<String>();
		
		for(int i=2; i<=getRowCount(locator)+1;i++){
			String actualXpath= beforeXpath+i+afterXpath;
			//System.out.println(actualXpath);
			By path = By.xpath(actualXpath);
			String text = getElement(path).getText();
			ar.add(text);
			
		}
		return ar;
	}

}
