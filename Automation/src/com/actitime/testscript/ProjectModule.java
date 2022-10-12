package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
 
	@Test(groups="regressionTest")
	public void createProject() {
		Reporter.log("createProject",true);
	}
	@Test(groups= {"smokeTest","regressionTest"})
	public void modifyProject() {
		Reporter.log("modifyProject",true);
	}
	@Test(dependsOnMethods = {"createProject","modifyProject"})
	public void deleteProject() {
		Reporter.log("deleteProject",true);
		
	}
}
