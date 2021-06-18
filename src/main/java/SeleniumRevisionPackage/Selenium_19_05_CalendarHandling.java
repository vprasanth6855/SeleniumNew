package SeleniumRevisionPackage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_19_05_CalendarHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ixigo.com/");
		
		//start date
		driver.findElement(By.xpath("//input[@placeholder ='Depart' and @type ='text']")).click();
		
		
		List<WebElement> startDateList = driver.findElements(By.xpath("(//div[@class='rd-month'])[1]/table//div[contains(@class, 'day')]"));
		
		for(WebElement e : startDateList){
			if(e.getText().equals("19")){
				e.click();
				break;
			}
		}
		
		Thread.sleep(2000);     //just put Thread.sleep after selecting the departure date- this is just for now. or else we could use dynamic wait as good practice
		
		//end date
		driver.findElement(By.xpath("//input[@placeholder ='Return' and @type ='text']")).click();
		
		List<WebElement> endDateList = driver.findElements(By.xpath("(//div[@class='rd-month'])[4]/table//div[contains(@class, 'day')]"));
		
		for(WebElement e : endDateList){
			if(e.getText().equals("17")){
				e.click();
				break;
			}
		}

	}

}
