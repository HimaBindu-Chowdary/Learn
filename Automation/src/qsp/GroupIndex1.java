package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupIndex1   //pending
{
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme note 10 pro max");
        driver.findElement(By.id("nav-search-submit-button")).submit();
        //driver.findElement(By.xpath(""))
	
	}
}