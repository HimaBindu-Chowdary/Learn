package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//ChildPopup- printing all the browsers addresses and also titles of browsers then closing 
//browsers without using quit() method
public class ChildWindowPopup // imp
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)   {
		WebDriver driver= new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		String pwh = driver.getWindowHandle();
		System.out.println(pwh);
		Set<String> allWh = driver.getWindowHandles();
		int count=allWh.size();
		System.out.println(count);
		for( String wh:allWh) {
			WebDriver text = driver.switchTo().window(wh);
			System.out.println(text);
			String title = text.getTitle();
			System.out.println(title);
			driver.close();

			
		}
		//driver.quit(); closes all opened browsers
		//if we use driver.close() here,it closes the current(parent) browser
}
}