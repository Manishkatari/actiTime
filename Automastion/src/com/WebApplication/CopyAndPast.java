package com.WebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyAndPast {
	static { 
		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe"); 
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
     	driver.get("file:///D:/Selenium/Static.html");
//		Thread.sleep(2000); 
//		String text = driver.findElement(By.xpath("//input[@value='A']")).getText();
//		System.out.println(text);
//		Thread.sleep(2000);
//		String text1="manish";
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(text);
//		Thread.sleep(2000);

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.CONTROL+"av");
		Thread.sleep(2000);
		driver.close();	
		}

}