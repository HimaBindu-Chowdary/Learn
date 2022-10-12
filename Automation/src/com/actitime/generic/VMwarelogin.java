package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class VMwarelogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String args[]) {
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://192.168.134.128:8080/");
			driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
			driver.findElement(By.id("passWord")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@alt='Sign In']")).click();
	}
}
