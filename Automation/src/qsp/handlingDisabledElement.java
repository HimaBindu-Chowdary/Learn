package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class handlingDisabledElement {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/himab/Desktop/disabled.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		
		RemoteWebDriver r=(RemoteWebDriver) driver;  // Down casting to use JavascriptExecutor interface methods for disabled element
		r.executeScript("document.getElementById(\"d2\").value='manager'");

		
			

		

		
}
}