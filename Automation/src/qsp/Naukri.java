package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri // imp
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)   {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		
	driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("himabindupurimetla@gmail.com");
	// not working xpath:	driver.findElement(By.xpath("//input[@class='err-border']")).sendKeys("himabindupurimetla@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("getJob@2022");
	driver.findElement(By.xpath("(//button)[1]")).click();
}
}