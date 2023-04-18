package com.WebApplication;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ademo {

	static { System.setProperty("webdriver.chrome.driver","./driver//chromedriver.exe"); }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.getWindowHandle();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.id("login-google-button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("apple-signin-button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		 
		
		
		
		
		
		
		
		
		
		
		driver.quit();
	     
		}

}
