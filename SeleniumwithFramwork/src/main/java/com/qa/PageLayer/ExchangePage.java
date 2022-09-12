package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class ExchangePage extends TestBase

{
	public ExchangePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//for buy button1
	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement buy_btn1;
	
	public void clickOnBuyBtn1()
	{
		buy_btn1.click();
	}
	
	
	//for quantity
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement Quantity_box;
	
	public void enterQuantity(int count)
	{
		Quantity_box.click();
		Quantity_box.sendKeys(String.valueOf(count));
	}
	
	//for buy button2
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_btn2;
	
	public void clickOnBuyBtn2()
	{
		buy_btn2.click();
	}
	
	//for order status
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement order_status;
	
	public String getSuccessOrderStatus()
	{
		String status = order_status.getText();
		
		return status;
		
	

}
}
