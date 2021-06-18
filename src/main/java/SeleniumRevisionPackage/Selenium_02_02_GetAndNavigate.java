package SeleniumRevisionPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_02_02_GetAndNavigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/veena/Downloads/chromedriver_win32(1).zip/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.amazon.com");
		driver.navigate().to("https://www.amazon.com");
		System.out.println(driver.getTitle());

	}

}
