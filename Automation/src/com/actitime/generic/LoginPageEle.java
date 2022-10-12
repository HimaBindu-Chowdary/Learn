package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageEle   // used Encapsulation concept
{
    @FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwTbx;
	 
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgBtn;
	
	public LoginPageEle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void SetLoginPage(String un,String pw) {
		untbx.sendKeys(un);
		pwTbx.sendKeys(pw);
		lgBtn.click();
	}
}
