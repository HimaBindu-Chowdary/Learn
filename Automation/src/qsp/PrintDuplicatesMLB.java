package qsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDuplicatesMLB // imp printing duplicates present in multi select list box
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
		Set<String> st=new HashSet();
		for(String dup:al)
		{
			if(st.add(dup)==false)
			{
				System.out.println(dup);
			}
			/*if(st.contains()==true)
			{
				System.out.println("dosa is present in list");
			}*/
		}
		driver.close();
}
}