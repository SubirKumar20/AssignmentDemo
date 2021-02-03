package com.zestmoney.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage 
{
	@FindBy(xpath="/*[@id=\"twotabsearchtextbox\"]")
	WebElement search;
	
	public void ahp()
	{
		search.sendKeys("iPhone XR (64GB) - Yellow");
		search.click();
	}

	

}
