package SeleniumRevisionPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selenium_11_05_customPathCricUtil {

	WebDriver driver;

	public Selenium_11_05_customPathCricUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void getScoreCard() {
		List<WebElement> scoreCard = driver.findElements(By.xpath(
				"(//a[contains(text(),'David Warner')]//parent::div//following::div[@class='player-stats'])[1]/child::div"));
		for (int i = 0; i < scoreCard.size(); i++) {
			String text = scoreCard.get(i).getText();
			System.out.println(text);
			System.out.println("...");
		}

	}

	public ArrayList getScoreCardNew(String player) {
		List<WebElement> scoreCard = driver.findElements(By.xpath("//a[contains(text(),'" + player
				+ "')]//parent::td[contains(@class,'batsman-cell')]//following-sibling::td"));
		ArrayList ar = new ArrayList();
		for (int i = 0; i < scoreCard.size(); i++) {
			String text = scoreCard.get(i).getText();
			ar.add(text);

		}
		
		return ar;

	}
}
