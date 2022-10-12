package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeOfWork {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		WebElement status = driver.findElement(By.xpath("//a[text()='manufacturing']/../../td[2]"));
		String text = status.getText();
		System.out.println(text);
		WebElement category = driver.findElement(By.xpath("//a[text()='testing']/../../td[3]"));
		String text2 = category.getText();
		System.out.println(text2);
		WebElement setByDefault = driver.findElement(By.xpath("//a[text()='support']/../../td[5]"));
		String text3 = setByDefault.getText();
		System.out.println(text3);
}
}