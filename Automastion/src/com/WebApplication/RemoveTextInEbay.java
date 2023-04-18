package com.WebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveTextInEbay {
	static { System.setProperty("webdriver.chrome.driver","./driver\\\\chromedriver.exe"); }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("phones");
		driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Apple']")).click();
		boolean imge =driver.findElement(By.xpath("//img[@alt=\"Apple iPhone 8 | 8 Plus 64GB 128GB 256GB GSM Unlocked ATT T-Mobile Metro Cricket\"][1]")).isDisplayed();
	    if (imge==true)
	    	System.out.println("pass");
	    else
	    	System.out.println("faild");
		driver.navigate().back();
		driver.findElement(By.cssSelector("input[type='text']")).clear();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Smart tv");
		driver.findElement(By.xpath("//input[@value='Search']")).submit();
		 
		System.out.println("All systeam test case pass");
		driver.close();
	}
}
