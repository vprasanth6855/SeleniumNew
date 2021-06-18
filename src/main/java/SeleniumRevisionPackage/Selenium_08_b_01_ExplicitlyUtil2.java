package SeleniumRevisionPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_08_b_01_ExplicitlyUtil2 {
	WebDriver driver;
	
	public Selenium_08_b_01_ExplicitlyUtil2(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getElement(By locator){
		WebElement element = null;
		try{
		 element = driver.findElement(locator);
		}catch(Exception e){
			System.out.println("some exception occurred!");
			e.getMessage();
		}
		return element;
	}

	public WebElement explicitlyWaitWithReturn(int timeOut, By locator){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return getElement(locator);
	}
	
	public String explicitlyWaitForTitle(int timeOut, String title){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	public WebElement waitForElementToBeClickable(int timeOut, By locator){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return getElement(locator);
	}
	
	public WebElement waitForElementToBeVisible(int timeOut, By locator){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		WebElement element = getElement(locator);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		return element;
	}
	
	public String waitForUrl(int timeOut, String url){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.urlContains(url));
		return driver.getCurrentUrl();
	}
	
	public boolean waitForAlertToBePresent(int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.alertIsPresent());
		return true;
	}
	
	public void clickWhenready(int timeOut, By locator){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		getElement(locator).click();
		
	}
	
	public void visibilityOfAllElements(int timeOut, List<WebElement> elements){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
		
	}
}
