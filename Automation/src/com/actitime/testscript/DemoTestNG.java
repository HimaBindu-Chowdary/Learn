package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG {

	@Test
	public void demoTest() {
		System.out.println("Hii");  //only prints on console
		Reporter.log("Welcome",true); //prints in report and console
		Reporter.log("Hai",false); // prints only in report
		Reporter.log("Hello");      // prints only in report
	}
	
}
