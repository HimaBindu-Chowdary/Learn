package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggQsp //pending
{
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Qspiders");
		Thread.sleep(1500);
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'Qspiders') or contains(text(),'qspiders')] "));
		int count=allSugg.size();
		System.out.println(count);
		for(WebElement x:allSugg)
		{
			System.out.println(x.getText());
		}
		allSugg.get(count-1).click();
		Thread.sleep(2000);
		driver.close();
}
}