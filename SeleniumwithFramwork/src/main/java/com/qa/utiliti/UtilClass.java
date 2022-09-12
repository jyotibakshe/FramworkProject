package com.qa.utiliti;

import org.openqa.selenium.JavascriptExecutor;

import com.qa.TestBase.TestBase;

public class UtilClass extends TestBase
{
	
	public void util(int x,int y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")", "");
	}

}
