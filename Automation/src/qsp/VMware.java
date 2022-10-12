package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VMware {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/crm/HomePage.do");
}
}