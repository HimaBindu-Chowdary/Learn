package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
}
}