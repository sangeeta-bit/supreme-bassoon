package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.actitime.pages.LogInPage;

public class BaseTest implements AutoCounts {
	FileLib fLib =new FileLib();
	LogInPage lp;
	public static WebDriver driver;
	
	public String openbrowser() throws Throwable
	{
		String browsvalue = fLib.getPropValue(Prop_Path, "browser");
		if(browsvalue.equals("chrome"))
		{
			System.setProperty(Chrome_key, Chrome_value);
			driver= new ChromeDriver();
		}
		else if (browsvalue.equals("fireFox"));
		{
			System.setProperty(Gecko_key, Gecko_value);
			driver= new FirefoxDriver();
		}
		driver.get(fLib.getPropValue(Prop_Path, "url"));
		return driver.getTitle();
	}
	
	public void LogInApp() throws Throwable
	{
		lp= new LogInPage(driver);
		Thread.sleep(2000);
		lp.setUsernameTB(fLib.getPropValue(Prop_Path, "username"));
		lp.setPassword(fLib.getPropValue(Prop_Path, "password"));
		lp.clkLoginBtn();
	}
	public void LoginInvalidData() throws Throwable
	{
		int rc=fLib.getRowCount(Excel_Path, "Invalid");
		
		for (int i=0;i<=rc;i++)
		{
			lp= new LogInPage(driver);
			String username = fLib.getExceldata(Excel_Path, "Invalid", i, 0);
			lp.setUsernameTB(username);
			String password = fLib.getExceldata(Excel_Path, "Invalid", i, 1);
			lp.setPassword(password);
			lp.clkLoginBtn();
		//	lp.setUsernameTB.clear();
			
		}	
	}
	public void closebrowser()
	{
		driver.close();
	}
	
}
