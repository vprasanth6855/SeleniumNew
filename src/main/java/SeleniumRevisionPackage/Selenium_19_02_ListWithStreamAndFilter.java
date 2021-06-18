package SeleniumRevisionPackage;

import java.util.List;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_19_02_ListWithStreamAndFilter {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		By links = By.tagName("a");
		
		List<WebElement> amazonLinks = driver.findElements(links);
		
		System.out.println(amazonLinks.size());
		
		/**
		 * filtering links which are not blank
		 */
//		List<String> collectList = amazonLinks
//				.stream()
//					.filter(ele -> !ele.getText().equals(""))
//						.map(ele ->ele.getText())
//							.collect(Collectors.toList());
//		
		//collectList.stream().forEach(ele -> System.out.println(ele));
//		collectList.parallelStream().forEach(ele -> System.out.println(ele));
		
		/**
		 * filtering links which are not blank but also contains- "amazon"
		 */		
//		List<String> collectList =  amazonLinks
//			.stream()
//				.filter(ele -> !ele.getText().equals("") && ele.getText()
//							.contains("Amazon"))
//								.map(ele -> ele.getText())
//									.collect(Collectors.toList());
//		
//		collectList.stream().forEach(ele -> System.out.println(ele));
//		
		
		
		List<String> collectList =  amazonLinks
				.stream()
					.filter(ele -> !ele.getText().isEmpty())
						.filter(ele -> !ele.getText().startsWith(" "))
								.map(ele -> ele.getText().trim())
										.collect(Collectors.toList());
			
			collectList.stream().forEach(ele -> System.out.println(ele));

	}

}
