package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
     static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		Reporter.log("open Browser",true);
	driver=new ChromeDriver();
		}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close Browser",true);
		driver.close();
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	driver.get("https://demo.actitime.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
		}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}
}
