package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
	WebElement daysLB = driver.findElement(By.id("day"));
	WebElement monthLB = driver.findElement(By.id("month"));
	WebElement yearLB = driver.findElement(By.id("year"));
	Select s1=new Select(daysLB);
	s1.selectByIndex(12);
	Select s2=new Select(monthLB);
	s2.selectByValue("11");
	Select s3=new Select(yearLB);
	s3.selectByVisibleText("1995");
	
	}
}
