package com.qa.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.PageLayer.DashboardPage;
import com.qa.PageLayer.ExchangePage;
import com.qa.PageLayer.LoginPage;
import com.qa.utiliti.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;




public class TestBase {
	
public static WebDriver driver;
	
	public DashboardPage dash;
	public ExchangePage exchange;
	public UtilClass ut;
	
	
	
	
	@BeforeMethod
	public void setup()
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	driver.get("https://www.apps.dalalstreet.ai/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
	LoginPage lp=new LoginPage();
	lp.enterusername();
	lp.enterpassword();
	lp.clickonlogin_btn();
	//lp.screens();
	
	 dash=new DashboardPage();
	 exchange=new ExchangePage();
	ut=new UtilClass();
	
	}
	
	@AfterMethod
	public void Down()
	{
		//driver.quit();
	}

}
