package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckRadioButtons {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div/a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		int y1 = driver.findElement(By.xpath("//div/span[@class='_5k_3']/span[1]")).getLocation().getY();
		int y2 = driver.findElement(By.xpath("//div/span[@class='_5k_3']/span[2]")).getLocation().getY();
		int y3 = driver.findElement(By.xpath("//div/span[@class='_5k_3']/span[3]")).getLocation().getY();

		if(y1==y2 && y2==y3)
		{
			System.out.println("All gender radio buttons are aligned properly");
		}
		else
		{
			System.out.println("All gender radio buttons are not aligned properly");
		}
		driver.close();
	}

}
