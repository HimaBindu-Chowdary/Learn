package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlphabetWise {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/himab/Desktop/hotel.html");
		WebElement mtrLB = driver.findElement(By.id("mtr"));
		Select s= new Select(mtrLB);
		ArrayList<String>al= new ArrayList<String>();
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		for(int i=0;i<count;i++)
		{
			String text = allOptions.get(i).getText();
			al.add(text);
		}
		Collections.sort(al);
		/*System.out.println(al); not to use much this direct sop...
		instead..go for for loop or for each loop*/
		for(String option:al)
		{
			System.out.println(option);
		}
		driver.close();
			

	}

}
