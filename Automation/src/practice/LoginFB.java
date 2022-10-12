package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFB {

	  static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	  public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.name("login")).click();
		
		
		
	}
}
