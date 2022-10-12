package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
	
		String text = a.getText();
		System.out.println("text present on popup is "+ text);
		a.dismiss();
		String poped = driver.findElement(By.id("demo")).getText();
		System.out.println("text after clicking on cancel button is "+poped);
		
driver.close();
	}

}
