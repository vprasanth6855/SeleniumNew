package SeleniumRevisionPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_11_08_FullScoreBoardTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/karnataka-premier-league-2019-1196253/bellary-tuskers-vs-bijapur-bulls-8th-match-1196265/full-scorecard");

		Selenium_11_07_FullScoreBoardUtil obj = new Selenium_11_07_FullScoreBoardUtil(driver);
		ArrayList colVal = obj.columnValues();
		for (int i = 0; i < colVal.size(); i++) {
			System.out.print(colVal.get(i) + "\t" + "\t"+"\t");
		}

		List<WebElement> batsmenList = driver.findElements(By.xpath("(//table[@class='table batsman'])[1]//tbody//a"));
		System.out.println(batsmenList.size());
		
		for (int i = 0; i < batsmenList.size(); i++) {
			System.out.println();
			obj.scoreCard(driver, batsmenList.get(i).getText().trim());
			

		}
		

	}

	
	
	
	
	public static void individualscoreCard(WebDriver driver) {   //just a trial 
		List<WebElement> scores = driver.findElements(By.xpath("//a[contains(text(),'SL Akshay')]//parent::td[@class='batsman-cell text-truncate out']//following-sibling::td"));
		for (int i = 0; i < scores.size(); i++) {

			System.out.print(scores.get(i).getText() + "\t" + "\t");
		}

	}

}




////a[contains(text(),'Gneshwar Naveen')]//parent::td[@class='batsman-cell text-truncate out']//following-sibling::td  //the xpath i created
//a[contains(text(), 'Gneshwar Naveen ')]//parent::td[@class='batsman-cell text-truncate out']//following-sibling::td  //the xpath printed on the console via String.format


//individualscoreCard(driver);