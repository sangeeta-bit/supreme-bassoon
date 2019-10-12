package com.actitime.scripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;

public class ActiInvalidLogin extends BaseTest {
	
	BaseTest bt = new BaseTest();
	@Test(priority=1)
	public void openBrowser() throws Throwable
	{
		String acTitle =bt.openbrowser();
		String expectedTitle = "actiTIME - Login";
		assertEquals(acTitle,expectedTitle);
	}
	@Test(priority=2)
	public void LoginInvalid() throws Throwable
	{
		bt.LoginInvalidData();
	}

}
