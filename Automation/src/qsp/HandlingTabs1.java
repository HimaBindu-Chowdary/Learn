package qsp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs1   //closing child tab first then parent tab by using Iterator
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> tabs = driver.getWindowHandles();
			
		Iterator<String> it=tabs.iterator();
		String tab1 = it.next();
		String tab2 = it.next();
		Thread.sleep(3000);
		driver.switchTo().window(tab2);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(tab1);
		driver.close();
		
		
}
}