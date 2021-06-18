package SeleniumRevisionPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_20_04_CalendarHandlingLengthyApproach {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();

		// List<WebElement> dateList =
		// driver.findElements(By.cssSelector("table.ui-datepicker-calendar
		// a"));
		// System.out.println(dateList.size());
		//
		// for(WebElement e : dateList){
		// String date = e.getText();
		// System.out.println(date);
		// if(date.equals("21")){
		// e.click();
		// break;
		// }
		// }

		//selectDate("14");
		
		By calendar = By.cssSelector("table.ui-datepicker-calendar a");
		selectDate("7",calendar);
		}

	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
	}

	public static void selectDate(String day, By locator) {
		List<WebElement> dateList = driver.findElements(locator);
		System.out.println(dateList.size());

		for (WebElement e : dateList) {
			String date = e.getText();
			System.out.println(date);
			if (date.equals(day)) {
				e.click();
				break;
			}
		}
	}

}
