package com.qa.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;


public class BuyShareTest extends TestBase
{
	@Test
	public void buyScnerio() throws InterruptedException
	{
	
		Thread.sleep(2000);
		dash.enterCompanyName("WIPRO");
		Thread.sleep(2000);
		dash.clickOnCompanyNameWipro();
		Thread.sleep(2000);
		exchange.clickOnBuyBtn1();
		ut.util(0,200);
		Thread.sleep(2000);
		exchange.enterQuantity(5);
		//Thread.sleep(2000);
		
		exchange.clickOnBuyBtn2();
		Thread.sleep(2000);
		String expected_result ="Order Created successfully";
		String actual_result=exchange.getSuccessOrderStatus();
		Assert.assertEquals(actual_result, expected_result);
	
		
	
	}
}
