package com.zestmoney.basicscript;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.zestmoney.master.Library;

public class Base
{
	Library lb=new Library();
	@Test
	public void Test()
	{

	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class...");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class...");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Amazon Login...");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("Amazon Logout...");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("close Driver..");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		lb.openApp("http://Amazon.in");
	}


}
