package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/himab/Desktop/hotel.html");
		WebElement mtrLB = driver.findElement(By.id("mtr"));
		Select s= new Select(mtrLB);
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("dosa");
		if(s.isMultiple()==true)
		{
			s.deselectByIndex(2);
		}
				boolean status = s.isMultiple();
				System.out.println(status);
				System.out.println("get the First selected option");
				WebElement selF = s.getFirstSelectedOption();
				System.out.println(selF.getText());
				System.out.println("get all the selected options");
				List<WebElement> allSel = s.getAllSelectedOptions();
				int count=allSel.size();
				System.out.println(count);
				for(WebElement all:allSel)
				{
					String text=all.getText();
					System.out.println(text);
				}
				System.out.println("get all the options");
				List<WebElement> allOptions = s.getOptions();
				int countall=allOptions.size();
				System.out.println(countall);
				for(WebElement allOp:allOptions)
				{
					String text=allOp.getText();
					System.out.println(text);
				}
				
}
}