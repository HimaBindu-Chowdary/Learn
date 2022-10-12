package com.actitime.testscript;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplimetation.class)
public class ActiTest extends BaseClass {

	@Test
	public void checkTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		String eTitle = "Hima";
		SoftAssert s=new SoftAssert();
		s.assertEquals(title, eTitle);
		s.assertAll();
					
	}
		
	
}
