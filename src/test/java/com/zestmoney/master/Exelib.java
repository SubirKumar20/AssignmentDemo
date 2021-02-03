package com.zestmoney.master;

public class Exelib
{
	public static void main(String[] args) 
	{
		Library lb=new Library();
		lb.openApp("http://Amazon.in");
		lb.amazonMobile("iPhone XR (64GB) - Yellow");
		lb.amazonPrice();
		lb.openFlipkart("http://Flipkart.com");
		lb.flipkartMobile("iPhone XR (64GB) - Yellow");
		lb.flipkartPrice();

	}

}
