package com.WebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CssSelectorByEbay {
   
	public static void getEbay(WebDriver driver) {
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("phones");
		driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Apple']")).click();
	    driver.navigate().back();
	    Thread.currentThread();
		driver.close();
	}

	public  void getAmazon(WebDriver driver2) {
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		//driver.manage().window().fullscreen();
	    driver2.findElement(By.id("twotabsearchtextbox")).sendKeys("poco f1");
		driver2.findElement(By.xpath("//input[@type='submit']")).click();
	    driver2.findElement(By.xpath("//input[@id='low-price']")).sendKeys("5000");
		driver2.findElement(By.xpath("//input[@id='high-price']")).sendKeys("10000");
		driver2.findElement(By.xpath("//input[@class='a-button-input']")).click();
		//driver2.findElement(By.xpath("//label/i[@xpath='1']")).click();
		//driver2.navigate().back();
		driver2.close();
		}
}
