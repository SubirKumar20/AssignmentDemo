package com.zestmoney.master;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Library
{
	public static WebDriver driver;

	//openApp
	public void openApp(String url)
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	//Amazon Home page
	public void amazonMobile(String mobiletype)
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(mobiletype);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	//Amazon Price page
	public void amazonPrice()
	{

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
		js.executeScript("arguments[0].scrollIntoView();", element);

		driver.findElement(By.xpath("//a[@class='a-link-normal a-text-normal']/span")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}

	//Open Flikart Home Page
	public void openFlipkart( String url2)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(url2);
	}

	//Flikart mobile page
	public void flipkartMobile(String mobiletype2)
	{
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys(mobiletype2);
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.ENTER).build().perform();
	}

	//Flipkart Price page
	public void flipkartPrice()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,350)", "");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[3]/div/div/div/a/div[1]/div[2]/div")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div/a/span/span")).click();
	}

}