package com.zestmoney.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPricePage 
{
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
	WebElement element;
	@FindBy(xpath="//a[@class='a-link-normal a-text-normal']/span")
	WebElement element1;


	public void click()
	{
		element1.click();

	}


}
