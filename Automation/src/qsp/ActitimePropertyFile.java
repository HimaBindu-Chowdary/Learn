package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.FileLib;

public class ActitimePropertyFile   //automation of actitime login page
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException  {
		WebDriver driver=new ChromeDriver();
		FileLib f=new FileLib();
		driver.get(f.getPropertyData("url"));
		driver.findElement(By.id("username")).sendKeys(f.getPropertyData("username"));
		driver.findElement(By.name("pwd")).sendKeys(f.getPropertyData("password"));
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
				
}
}