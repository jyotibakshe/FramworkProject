package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class DashboardPage extends TestBase{
	
	public DashboardPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement Search_box;
	
	
	public void enterCompanyName(String CompanyName)
	{
		Search_box.sendKeys(CompanyName);
	}
	
	@FindBy(xpath="//div[@class='d-none d-lg-block']/div/div/div/div")
	private WebElement click_company_name_wipro;
	
	public void clickOnCompanyNameWipro()
	{
		click_company_name_wipro.click();
	}
	
	
	
	
	
}
