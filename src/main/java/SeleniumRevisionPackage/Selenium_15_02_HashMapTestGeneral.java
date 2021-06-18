package SeleniumRevisionPackage;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_15_02_HashMapTestGeneral {

	public static void main(String[] args) {

		 Selenium_15_01_HashMapUtilGeneral obj = new Selenium_15_01_HashMapUtilGeneral();
		 obj.addData("id", "1");
		 obj.addData("name", "Veena");
		 obj.addData("Married", "yes");
		
//		 System.out.println(obj.getData("id", "1"));
//		 System.out.println(obj.getData("name", "Veena"));
//		 System.out.println(obj.getData("married", "yes"));
		 
		 System.out.println(obj.getDataNew(obj.addData("id","1"),"id"));
		

		// writing without util

//		Map<String, String> userMap = new HashMap<String, String>();
//		userMap.put("id", "1");
//		userMap.put("name", "Veena");
//		userMap.put("City", "WDM");
//
//		System.out.println(userMap.get("id"));
//		System.out.println(userMap.get("name"));
//		System.out.println(userMap.get("City"));
//		System.out.println(userMap.size());
//		
//		for(Map.Entry m:userMap.entrySet()){
//			System.out.println(m.getKey()+" "+m.getValue());
//		}

	}

}
