package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductAndPrice   //output should come as productName--> price
{
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 13 pro max"+Keys.ENTER);
		//driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		List<WebElement> allProd = driver.findElements(By.xpath("//div[contains(text() ,'APPLE iPhone 13 Pro Max ')]"));
		List<WebElement> allProdPrice = driver.findElements(By.xpath("//div[contains(text() ,'APPLE iPhone 13 Pro Max')]/../../div[2]/div[1]/div[1]/div"));
		int count=allProdPrice.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String prodName=allProd.get(i).getText();
			String prodPrice=allProdPrice.get(i).getText();
			System.out.println(prodName+"--->"+prodPrice);
	}
		
	
		
		
	
}
}
