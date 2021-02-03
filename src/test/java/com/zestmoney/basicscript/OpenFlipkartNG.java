package com.zestmoney.basicscript;
import org.testng.annotations.Test;
public class OpenFlipkartNG extends Base
{
	@Test
	public void ofNG() throws InterruptedException

	{
		lb.openFlipkart("http://flipkart.com");
	}



}
