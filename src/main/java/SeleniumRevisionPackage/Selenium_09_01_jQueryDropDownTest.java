package SeleniumRevisionPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_09_01_jQueryDropDownTest {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		By select =  By.id("justAnInputBox");
		By choices = By.xpath("//div[@class='comboTreeDropDownContainer']//ul/li/span[@class='comboTreeItemTitle']");
		By choice2Set = By.xpath("//div[@class='comboTreeDropDownContainer']//ul/li/span[@data-id='1']");
		//By choice6Set = 
		//jQueryDropDown(select, choices,"choice 1", "choice 2", "choice 2 1");
		//jQueryDropDown(select, choices,"choice 2 3");
		//jQueryDropDown(select, choices,"choice 6 1");
		//jQueryDropDown(select, choices, "ALL");

	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static void doClick(By locator){
		getElement(locator).click();
	}
	
	public static void jQueryDropDown(By locator1, By locator2, String... value){
		doClick(locator1);
		List<WebElement> elements = getElements(locator2);
		System.out.println("The size is: "+ elements.size());
		if(!value[0].equalsIgnoreCase("ALL")){
		for(int i=0; i<elements.size();i++){
			String text = elements.get(i).getText();
			System.out.println(text);
			for(int j=0; j<value.length;j++){
			if(text.equals(value[j])){
				elements.get(i).click();
				break;
			}
			}
			
		}
		}
		else{
			try{
			for(int all=0; all<elements.size();all++){
				elements.get(all).click();
			}
			}catch(Exception e){
				
			}
		}
		
		
	}
	
	public static void cascadedSelection(By locator1, By locator2, By locator3){
		doClick(locator1);
		//getElements()
		if(locator2.equals("choice 2")){
			
		}
		
	}

}
