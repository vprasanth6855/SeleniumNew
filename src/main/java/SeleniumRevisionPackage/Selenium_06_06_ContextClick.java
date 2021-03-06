package SeleniumRevisionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_06_06_ContextClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickme = driver.findElement(By.className("context-menu-one"));
		Actions action = new Actions(driver);
		
		action.contextClick(rightClickme).build().perform();;
		String text = driver.findElement(By.xpath("//ul/li[contains(@class, 'context-menu-icon-copy')]/span")).getText();
		System.out.println(text);

	}

}
