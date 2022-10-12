package qsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithoutDuplicates {
	static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	
		public static void main(String[] args) {
			WebDriver driver= new ChromeDriver();
			driver.get("file:///C:/Users/himab/Desktop/hotel.html");
			WebElement mtrLB = driver.findElement(By.id("mtr"));
			Select s= new Select(mtrLB);
			HashSet<String> hs=new HashSet<>();
			List<WebElement> allOptions = s.getOptions();
			int count = allOptions.size();
			for(int i=0;i<count;i++)
			{
				String text = allOptions.get(i).getText();
				hs.add(text);
			}
			for(String option:hs)
			{
				System.out.println(option);
			}
			driver.close();
			
			
				
}
}