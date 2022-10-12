package com.actitime.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.generic.LoginPageEle;

public class TestLoginPage     // used Encapsulation concept
{

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void validLogin() {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		LoginPageEle l=new LoginPageEle(driver);
		l.SetLoginPage("admin", "manager");
		driver.findElement(By.id("logoutLink")).click();
		l.SetLoginPage("admin1", "manager1");
	}
}
