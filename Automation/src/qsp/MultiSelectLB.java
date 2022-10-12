package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectLB   // printing in alphabetical order and sorted without duplicates
{
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/himab/Desktop/hotel.html");
		WebElement mtrLB = driver.findElement(By.id("mtr"));
		Select s= new Select(mtrLB);
		ArrayList<String> al=new ArrayList<String>();
		for(WebElement options:s.getOptions())
		{
			al.add(options.getText());
		}
		Collections.sort(al);
		for(String sOptions: al)
		{
			System.out.println(sOptions);
		}
	System.out.println(" sorted and without duplicates");
	Set<String> ts=new TreeSet<String>(al);
	System.out.println(ts);
	
		

		
}
}