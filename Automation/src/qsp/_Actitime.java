package qsp;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Actitime    //imp
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
		Set<String> allWh = driver.getWindowHandles();
		
		Iterator<String> it=allWh.iterator();
		String tab1 = it.next();
		String tab2 = it.next();
		driver.switchTo().window(tab2);
		List<WebElement> heads = driver.findElements(By.xpath("//h2"));
		for(WebElement h:heads)
		{   String headText = h.getText();
			System.out.println(headText);
		}
}
}