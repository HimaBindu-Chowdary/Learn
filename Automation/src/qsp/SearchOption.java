package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchOption // imp
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the option: ");
				String option = sc.nextLine();
				WebDriver driver= new ChromeDriver();
				driver.get("file:///C:/Users/himab/Desktop/hotel.html");
				WebElement mtrLB = driver.findElement(By.id("mtr"));
				Select s= new Select(mtrLB);
				List<WebElement> allOptions = s.getOptions();
				int count = allOptions.size();
				int counter=0;
				for(int i=0;i<count;i++)
				{
					String text=allOptions.get(i).getText();
					if(option.equals(text))
					{
						counter++;
					}
				}
					 if(counter==0)
					{
					System.out.println(option+" is not present in menu");
				}
					else if(counter==1)
					{
						System.out.println(option+" is present in menu without duplicates");	
					}
					else if(counter>1)
					{
						System.out.println(option+" is present in menu with duplicates");
}
					 driver.close();
}
			}
