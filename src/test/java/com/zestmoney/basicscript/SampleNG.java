package com.zestmoney.basicscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleNG
{
	WebDriver driver;
	@BeforeTest
	public void xyz()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();

	}
	@Test
	public void pqr()
	{
		driver.get("http://www.Amazon.in");

	}
	@AfterTest
	public void abc()
	{
		driver.close();
	}

}
