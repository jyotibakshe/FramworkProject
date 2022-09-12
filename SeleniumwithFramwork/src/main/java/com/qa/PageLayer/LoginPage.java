package com.qa.PageLayer;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class LoginPage extends TestBase
{
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement Email;
	
	public void enterusername()
	{
		Email.sendKeys("jagtapashu2222@gmail.com");
	}
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass;
	
	public void enterpassword()
	{
		pass.sendKeys("Ganesh@98823");
	}
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]")
	private WebElement login_btn;
	
	public void clickonlogin_btn()
	{
		login_btn.click();
	}

	public void screens() throws IOException
	{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\Ashwini\\eclipse-workspace\\SeleniumFrameworkTDD\\Screenshot\\scree.png");
	FileHandler.copy(src,des);
	
	}
	
	
}
