package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	// declaration un
		@FindBy(name="username") private WebElement unTB;
	// utilization un
		public void setUsernameTB(String un)
		{
			unTB.sendKeys(un);
		}
	// declaration pwd
		@FindBy(name="pwd") private WebElement pswTB;
	// utilization
		public void setPassword(String psw)
		{
			pswTB.sendKeys(psw);
		}
	// declaration
		@FindBy(id="loginButton") private WebElement loginBtn;
	// utilization
		public void clkLoginBtn()
		{
			loginBtn.click();
		}
	// initilization
		public LogInPage(WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
		}
}
