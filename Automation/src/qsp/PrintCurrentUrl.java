package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCurrentUrl {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com/");
		String url = driver.getCurrentUrl();
		if(url.contains("google.com"))
		{
		System.out.println("url is navigating successfully and contains google.com");
		}
		else
		{
			System.out.println("url is navigating and not contains google.com");
		}
		driver.close();
			
	}

}
