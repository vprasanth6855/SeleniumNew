package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_08_c_02_CustoWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/");

		By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//input[@value='Login']");

		waitForElementCustom(driver, username, 6).sendKeys("test@test.com");
		;

	}

	public static WebElement waitForElementCustom(WebDriver driver, By locator, int timeOut) {
		WebElement element = null;
		for (int i = 0; i < timeOut; i++) {
			try {
				element = driver.findElement(locator);
				break;
			} catch (Exception e) {
				System.out.println("waiting for elemnt to be present on the page.." + i + "secs");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					// e1.printStackTrace();
				}
			}
		}

		return element;
	}

	public static boolean isElementVisible(WebDriver driver, By locator, int timeOut) {
		WebElement element = null;
		boolean flag = false;
		for (int i = 0; i < timeOut; i++) {
			try {
				element = driver.findElement(locator);
				flag = element.isDisplayed();
				break;
			} catch (Exception e) {
				System.out.println("waiting for element to be present on the page..." + i + "secs");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		}
		return flag;

	}

}
