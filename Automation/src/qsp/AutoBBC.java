package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoBBC {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> topList = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
	int count = topList.size();
	System.out.println(count);
	for(WebElement x:topList) // Using for each loop
	{
		System.out.println(x.getText());
		
	}
			driver.close();
	}
}
