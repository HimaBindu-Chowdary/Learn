package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobs {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Wipro jobs"+Keys.ENTER);
	
		List<WebElement> all= driver.findElements(By.xpath("//a"));
		int count=all.size();
		System.out.println(count);
		
		/*for(int i=0;i<count;i++)
		{
			String links = all.get(i).getAttribute("href");
			System.out.println(links);
		}*/
		for(WebElement wh:all) {
			String links = wh.getAttribute("href");
			System.out.println(links);
		}
		driver.close();

		
		
}
}