package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver; // Type casting from webDriver
		//j.executeScript("window.scrollBy(0,3000)"); //--> for scrolling by specific pixels

		int y=driver.findElement(By.xpath("//span[text()='Future Planet']")).getLocation().getY();
		j.executeScript("window.scrollBy(0,"+y+")"); //---> for scrolling to particular element
		Thread.sleep(3000);

		j.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // to scroll down total height..i.e to bottom
		Thread.sleep(3000);
		j.executeScript("window.scrollTo(0,0)");
		Thread.sleep(3000);
        j.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);

        j.executeScript("window.scrollBy(0,-2000)");
}
}