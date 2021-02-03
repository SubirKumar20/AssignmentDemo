package com.zestmoney.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartHomePage 
{

	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input\")).sendKeys(mobiletype2)")
	WebElement ele;
	
	
	public void fhp()
	{
		ele.sendKeys("iPhone XR (64GB) - Yellow");
	}

}
