package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedWait1 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		driver.findElement(By.id("logoutLink")).click();
		
}
}