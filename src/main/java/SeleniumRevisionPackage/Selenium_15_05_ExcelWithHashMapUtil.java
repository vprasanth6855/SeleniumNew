package SeleniumRevisionPackage;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.excel.lib.util.Xls_Reader;

public class Selenium_15_05_ExcelWithHashMapUtil {

	WebDriver driver;

	public Selenium_15_05_ExcelWithHashMapUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	/**
	 * This is for getting the data from excel and feeding it to hashMap
	 * @return
	 */
	public Map<String, String> excelDataToHashMap() {
		Xls_Reader reader = new Xls_Reader("./src/main/java/com/excel/lib/util/Credentials.xlsx");
		String sheetname = "Info";

		int rowCount = reader.getRowCount(sheetname);
		System.out.println(rowCount);
		Map<String, String> userMap = new HashMap<String, String>();
		for (int i = 2; i <= rowCount; i++) {
			String user = reader.getCellData(sheetname, "Key", i);
			String credentials = reader.getCellData(sheetname, "Credentials", i);

			userMap.put(user, credentials);
		}
		return userMap;
	}

	/**
	 * This is for the login by individual user
	 * @param locator1
	 * @param locator2
	 * @param locator3
	 * @param userMap
	 * @param myKey
	 */
	public void doLogin(By locator1, By locator2, By locator3, Map<String, String> userMap, String myKey) {
		getElement(locator1).sendKeys(userMap.get(myKey).split("_")[0]);
		getElement(locator2).sendKeys(userMap.get(myKey).split("_")[1]);
		getElement(locator3).click();

	}
	/**
	 * This is for login continuously by the subsequent users
	 */

	public void Logins(By locator1, By locator2, By locator3){
		Xls_Reader reader = new Xls_Reader("./src/main/java/com/excel/lib/util/Credentials.xlsx");
		String sheetname = "Info";

		int rowCount = reader.getRowCount(sheetname);
		System.out.println(rowCount);
		Map<String, String> userMap = new HashMap<String, String>();
		for (int i = 2; i <= rowCount; i++) {
			String user = reader.getCellData(sheetname, "Key", i);
			String credentials = reader.getCellData(sheetname, "Credentials", i);

			userMap.put(user, credentials);
			
			String username= userMap.get(user).split("_")[0];
			String password = userMap.get(user).split("_")[1];
			
			getElement(locator1).clear();
			getElement(locator1).sendKeys(username);
			getElement(locator2).sendKeys(password);
			getElement(locator3).click();
		}
		
		
		
	}
	
	
}
