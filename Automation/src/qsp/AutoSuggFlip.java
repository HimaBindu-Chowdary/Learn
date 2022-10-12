package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggFlip  
{
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		Thread.sleep(1500);
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[text()='iphone']/.."));
		int count=allSugg.size();
		System.out.println(count);
		/*for(int i=0;i<count;i++)
		{
			String text=allSugg.get(i).getText();
			System.out.println(text);
		}*/
		for(WebElement x:allSugg)
		{
			System.out.println(x.getText());
		}
		
		allSugg.get(count-1).click();
		
	
	}
	
}
