package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupByIndex {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("realme watch 3");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		WebElement price = driver.findElement(By.xpath("(//div[contains(text(),'realme Watch 3')])[1]/../../div[2]/div[1]/div[1]/div[1]"));
		String priceText=price.getText();
		System.out.println(priceText);  // price of first watch element 
		
}
}