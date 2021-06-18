package SeleniumRevisionPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_19_06_CalendarHandling3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ixigo.com/");

		// start date
		driver.findElement(By.xpath("//input[@placeholder ='Depart' and @type ='text']")).click();
		String startmonthValue = driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
		while (!startmonthValue.contains("February 2022")) {
			driver.findElement(By.xpath("(//button[@class='ixi-icon-arrow rd-next'])[1]")).click();
			startmonthValue = driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
		}
		List<WebElement> startDateList = driver
				.findElements(By.xpath("(//div[@class='rd-month'])[1]/table//div[contains(@class, 'day')]"));

		for (WebElement e : startDateList) {
			if (e.getText().equals("19")) {
				e.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		//end date
		driver.findElement(By.xpath("//input[@placeholder ='Return' and @type ='text']")).click();

		String endmonthValue = driver.findElement(By.xpath("(//div[@class='rd-month-label'])[4]")).getText();

		while (!endmonthValue.contains("April 2022")) {
			driver.findElement(By.xpath("(//button[@class='ixi-icon-arrow rd-next'])[2]")).click();
			endmonthValue = driver.findElement(By.xpath("(//div[@class='rd-month-label'])[4]")).getText();
		}
		List<WebElement> endDateList = driver
				.findElements(By.xpath("(//div[@class='rd-month'])[4]/table//div[contains(@class, 'day')]"));

		for (WebElement e : endDateList) {
			if (e.getText().equals("2")) {
				e.click();
				break;
			}
		}
		


	}

}
