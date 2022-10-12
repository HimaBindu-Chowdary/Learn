package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	static {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(" http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr438975");
		driver.findElement(By.name("password")).sendKeys("gEzezat");
		driver.findElement(By.name("btnLogin")).click();
		
		

	}

}
