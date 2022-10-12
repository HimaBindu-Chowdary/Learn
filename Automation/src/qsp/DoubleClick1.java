package qsp;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement target = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		
		WebElement dClick = driver.findElement(By.partialLinkText("READ FULL STORY"));
		dClick.sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
		
		Thread.sleep(2000);
		a.doubleClick(dClick).perform();
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.vtiger.com/customers/hackerearth-case-study/"))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.close();
}
}