package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckHeightandWidth // getCssValue() used
{
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		String color = link.getCssValue("color");
		System.out.println(color);
		String fontSize = link.getCssValue("font-size");
		System.out.println(fontSize);
		driver.close();

		

	}

}
