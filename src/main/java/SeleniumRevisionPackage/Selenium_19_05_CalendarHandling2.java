package SeleniumRevisionPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_19_05_CalendarHandling2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ixigo.com/");

		// start date
		driver.findElement(By.xpath("//input[@placeholder ='Depart' and @type ='text']")).click();

		List<WebElement> startDateList = driver
				.findElements(By.xpath("(//div[@class='rd-month'])[1]/table//div[contains(@class, 'day')]"));

		for (WebElement e : startDateList) {
			if (e.getText().equals("19")) {
				e.click();
				break;
			}
		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder ='Return' and @type ='text']")).click();

		String monthValue = driver.findElement(By.xpath("(//div[@class='rd-month-label'])[4]")).getText();

		while (!monthValue.contains("March 2022")) {
			driver.findElement(By.xpath("(//button[@class='ixi-icon-arrow rd-next'])[2]")).click();
			monthValue = driver.findElement(By.xpath("(//div[@class='rd-month-label'])[4]")).getText();
		}

		// end Date
		List<WebElement> endDateList = driver
				.findElements(By.xpath("(//div[@class='rd-month'])[4]/table//div[contains(@class, 'day')]"));

		for (WebElement e : endDateList) {
			if (e.getText().equals("18")) {
				e.click();
				break;
			}
		}

	}

}
