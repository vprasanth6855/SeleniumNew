package SeleniumRevisionPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selenium_11_07_FullScoreBoardUtil {

	WebDriver driver;

	public Selenium_11_07_FullScoreBoardUtil(WebDriver driver) {
		this.driver = driver;
	}

	public ArrayList columnValues() {
		List<WebElement> colVal = driver
				.findElements(By.xpath("(//tbody//ancestor::table[@class='table batsman'])[1]//th"));
		ArrayList ar = new ArrayList();

		for (int i = 0; i < colVal.size(); i++) {
			String text = colVal.get(i).getText();
			ar.add(text);
		}

		return ar;

	}

	public void getBatsmen() {
		List<WebElement> batsmen = driver.findElements(By.xpath("(//table[@class='table batsman'])[1]//tbody//a"));
		System.out.println(batsmen.size());
		//ArrayList<String> ar = new ArrayList<String>();
		for (int i = 0; i < batsmen.size(); i++) {
			String text = batsmen.get(i).getText();
			//ar.add(text);
		}
		//return ar;
	}

public void scoreCard(WebDriver driver, String player) {
		

		List<WebElement> scores = driver.findElements(By.xpath("//a[contains(text(),'" + player + "')]//parent::td[@class='batsman-cell text-truncate out']//following-sibling::td"));
		if(player.length()>=8){
			System.out.print(player+"\t"+"\t");
		}
		else{
			System.out.print(player+"\t");
		}
		for (int i = 0; i < scores.size(); i++) {

			System.out.print(scores.get(i).getText().trim() + "\t" + "\t");
		}

	}
		

	}




//String xPath= String.format("//a[contains(text(), '%s')]//parent::td[@class='batsman-cell text-truncate out']//following-sibling::td", player); //IMPORTANT TO KNOW. Via this line got to know there were space from getText() method and we used trim
		//System.out.println(xPath);  //just print the xpath to know the trend
		
				
		//List<WebElement> scores = driver.findElements(By.xpath(xPath));
