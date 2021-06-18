package SeleniumRevisionPackage;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class Selenium_15_01_HashMapUtilGeneral {
	
	//WebDriver driver;   //no need for opening any browser
	
	//public Selenium_15_01_HashMapUtil(WebDriver driver){
		//this.driver=driver;
	//}
	
	public Map<String, String> addData(String myKey, String myValue){
		Map<String , String> userMap = new HashMap<String, String>();
		userMap.put(myKey, myValue);
		return userMap;
	}
	
	public String getData(String myKey, String myValue){
		Map<String, String> userMap = addData(myKey, myValue);
		String data = userMap.get(myKey);
		return data;
	}
	
	//or the prefered way-
	public String getDataNew(Map<String, String> userMap, String mykey){
		String data = userMap.get(mykey);
		return data;
	}
	
	
	//IMPT- just try adding all these addData and getData and the other subsequent steps in a single method in util class other than creating this separet addData and getData methods

}
