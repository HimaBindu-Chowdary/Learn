package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)   {
		System.out.println("enter the title of browser to be closed");
		Scanner sc=new Scanner(System.in);
		String expectedTitle = sc.nextLine();
		WebDriver driver= new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		
		Set<String> allWh = driver.getWindowHandles();
		
		for(String wh:allWh) {
			String actualtitle = driver.switchTo().window(wh).getTitle();
			if(!(expectedTitle.equals(actualtitle))) {
				driver.close();
		
			
}
	}

}
}