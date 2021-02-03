package com.zestmoney.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartPricePage 
{
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement element;
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[3]/div/div/div/a/div[1]/div[2]/div")
	WebElement element1;
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div[2]/div/a/span/span")
	WebElement element2;
	
	
	
	public void fpp()
	{
		element.click();
		element1.click();
		element2.click();
	}

	

}
