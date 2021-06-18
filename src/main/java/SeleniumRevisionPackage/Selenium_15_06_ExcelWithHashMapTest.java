package SeleniumRevisionPackage;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.lib.util.Xls_Reader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_15_06_ExcelWithHashMapTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		By login = By.id("login1");
		By pwd = By.id("password");
		By loginBtn = By.name("proceed");

		Selenium_15_05_ExcelWithHashMapUtil obj = new Selenium_15_05_ExcelWithHashMapUtil(driver);
		Map<String, String> userMap = obj.excelDataToHashMap();
		for(Map.Entry m:userMap.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//obj.doLogin(login, pwd, loginBtn, obj.excelDataToHashMap(), "admin");
		
		obj.Logins(login, pwd, loginBtn);
		
		
		

		

		
//		for(Map.Entry m:userMap.entrySet()){
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
//		

	}
	
	

}
