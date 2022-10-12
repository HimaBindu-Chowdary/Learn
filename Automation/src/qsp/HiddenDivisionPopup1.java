package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup1 //Calender popup
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class=\'ui-datepicker-month\']"));
		Select s1=new Select(month);
		s1.selectByValue("10");
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2= new Select(year);
		s2.selectByVisibleText("1995");
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[13]")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9642008709");
		driver.findElement(By.id("renew_policy_submit")).click();
		 String text = driver.findElement(By.id("policynumberError")).getText();
		System.out.println(text);
		driver.close();
}
}