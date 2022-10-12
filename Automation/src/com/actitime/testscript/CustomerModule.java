package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplimetation.class) // for monitoring the test class during run time execution

public class CustomerModule extends BaseClass {

	@Test(priority=1,invocationCount=1)
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	@Test(priority=2,dependsOnMethods = "createCustomer")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}
	@Test (dependsOnMethods = {"createCustomer","modifyCustomer"})
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
		
	}
}
