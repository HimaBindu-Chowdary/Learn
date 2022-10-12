package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/himab/Desktop/page1.html");
		driver.switchTo().frame(0);  //index--->page 2
		driver.findElement(By.id("t2")).sendKeys("a");
		
		driver.switchTo().parentFrame();  //---> page 1
		driver.findElement(By.id("t1")).sendKeys("b");
		
		driver.switchTo().frame("f1");  //String --->page2
		driver.findElement(By.id("t2")).sendKeys("c");
		
		driver.switchTo().defaultContent();  //--->page1
		driver.findElement(By.id("t1")).sendKeys("d");
		
		WebElement f = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(f);  // WebElement--->page2
		driver.findElement(By.id("t2")).sendKeys("e");
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
