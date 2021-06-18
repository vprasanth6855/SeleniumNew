package SeleniumRevisionPackage;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_11_06_customPathCricTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/karnataka-premier-league-2019-1196253/bellary-tuskers-vs-bijapur-bulls-8th-match-1196265/full-scorecard");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Selenium_11_05_customPathCricUtil obj = new Selenium_11_05_customPathCricUtil(driver);
		//obj.getScoreCard();
		System.out.println("scorecard for NP Bhareth");
		ArrayList score1 = obj.getScoreCardNew("NP Bhareth");
		for(int i=0; i<score1.size();i++){
			System.out.print(score1.get(i));
			System.out.print("\t"+"\t");  //for adequate spacing use \t - it's tab
		}
		System.out.println();
		System.out.println("scorecard for Sunil raju");
		ArrayList score2 = obj.getScoreCardNew("Sunil Raju");
		for(int i=0; i<score1.size();i++){
			System.out.print(score2.get(i));
			System.out.print("\t"+"\t");
		}
		//System.out.println(score2);
	}

}
