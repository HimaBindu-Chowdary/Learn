package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HandlingMouseDoubleClick  //tried other way 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement target = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
		WebElement target1 = driver.findElement(By.partialLinkText("Customers"));
		a.contextClick(target1).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		
		Set<String> allWh = driver.getWindowHandles();
		Iterator<String> it=allWh.iterator();
		String tab1 = it.next();
		String tab2 = it.next();
		driver.switchTo().window(tab2);
		
		Thread.sleep(2000);
		WebElement dClick = driver.findElement(By.xpath("//a[text()='READ FULL STORY']"));
		dClick.sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
		Thread.sleep(2000);

		a.doubleClick(dClick).perform();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.vtiger.com/customers/hackerearth-case-study/"))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.quit();	
}
}