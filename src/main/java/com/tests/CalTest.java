package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import NGDriverRevisionPackagePages.Selenium_17_01_CalculatorPage;

public class CalTest {

	Selenium_17_01_CalculatorPage calPage;
	
	@BeforeTest
	public void setup(){
		calPage = new Selenium_17_01_CalculatorPage();
	}
	
	@Test(priority=1)
	public void sumTest(){
		String res=calPage.doSum("10", "20");
		Assert.assertEquals(res, "30");
	}
	
	@Test(priority=2)
	public void subTest(){
		String res=calPage.doSub("100", "20");
		Assert.assertEquals(res, "80");
	}
	
	@Test(priority=3)
	public void divTest(){
		String res=calPage.doDiv("20", "2");
		Assert.assertEquals(res, "10");
	}
	
	@Test(priority=4)
	public void mulTest(){
		String res=calPage.doMul("2", "6");
		Assert.assertEquals(res, "12");
	}
	
	
}
