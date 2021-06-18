package SeleniumRevisionPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_04_02_findElementsTextFields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		// List<WebElement> textFields =
		// driver.findElements(By.tagName("input"));
		// System.out.println("The number is: "+textFields.size()); it will give
		// us all the fields with input tag

		List<WebElement> textFields = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("The number is:" + textFields.size());

		for (int i = 0; i < textFields.size(); i++) {
			textFields.get(i).sendKeys("veena");
		}

	}

}
