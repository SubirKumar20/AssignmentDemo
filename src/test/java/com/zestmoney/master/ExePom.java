package com.zestmoney.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExePom 
{
	WebDriver driver;
	@BeforeTest
	public void launch()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://Amazon.in");
	}
	
	@Test
	public void pom() throws InterruptedException
	{
		AmazonHomePage ahome=PageFactory.initElements(driver,AmazonHomePage.class);
		ahome.ahp();

		AmazonPricePage app=PageFactory.initElements(driver,AmazonPricePage.class);
		app.click();

		FlipkartHomePage fhp=PageFactory.initElements(driver,FlipkartHomePage.class);
		fhp.fhp();

		FlipkartPricePage fpp=PageFactory.initElements(driver,FlipkartPricePage.class);
		fpp.fpp();

	}


}
