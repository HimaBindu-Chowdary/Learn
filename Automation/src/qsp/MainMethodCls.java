package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.LoginPage;

public class MainMethodCls  // login using business logic method(Encapsulation)
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPage l=new LoginPage(driver);
		l.setLogin("admin", "manager");

	}

}
