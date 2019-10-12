package com.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void run()
	{
		Reporter.log("I am run meth of Demo class", true);
		//System.out.println("I am sop wala msg");
		//Reporter.log("I am report wala msg");
		//Reporter.log("I am both report wala and console wala", true);
		//Reporter.log("i am  report wala only", false);
		
	}

}
