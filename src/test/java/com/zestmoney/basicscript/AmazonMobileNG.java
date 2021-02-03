package com.zestmoney.basicscript;
import org.testng.annotations.Test;
public class AmazonMobileNG extends Base
{
	@Test
	public void amNG() throws InterruptedException
	{
		lb.amazonMobile("iPhone XR (64GB) - Yellow");
	}


}
