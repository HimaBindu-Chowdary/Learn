package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertion {
 
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTitle = "Soogle";
		String aTitle = driver.getTitle();
	//	Assert.assertEquals(aTitle, eTitle); // test case failed..so Assert class static method
	//	driver.close();  // will not execute remaining statements
		// so we using softAssert class non static methods 
		SoftAssert s= new SoftAssert();
		s.assertEquals(aTitle, eTitle);
		driver.close();
		s.assertAll();  // we have to use this as last statement in test case when we use SoftAssert class
		                // to update result of test case to the report
	
	}
}
