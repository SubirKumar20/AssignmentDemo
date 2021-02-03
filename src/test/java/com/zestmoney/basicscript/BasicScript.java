package com.zestmoney.basicscript;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicScript 
{
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone XR (64GB) - Yellow");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);



		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
		js.executeScript("arguments[0].scrollIntoView();", element);

		driver.findElement(By.xpath("//a[@class='a-link-normal a-text-normal']/span")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	
	
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));


		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("iPhone XR (64GB) - Yellow");
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,350)", "");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div/div[2]/div[3]/div/div/div/a/div[1]/div[2]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div/a/span/span")).click();
		
		
	}
}
