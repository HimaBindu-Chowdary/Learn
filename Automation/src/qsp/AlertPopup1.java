package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
	    a.sendKeys("Hima Bindu");
	    Thread.sleep(1000);
		a.accept();
		String msg = driver.findElement(By.id("demo1")).getText();
		System.out.println(msg);
		driver.close();
	
}
}