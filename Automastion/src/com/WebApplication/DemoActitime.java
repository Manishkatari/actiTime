package com.WebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.ganarikpackage.Ganarikclass;

public class DemoActitime {
	static {
	System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
	  Ganarikclass gk =new Ganarikclass();
		String url = gk.getProperty("url");
		String un=gk.getProperty("username");
		String ps=gk.getProperty("password");
		
	  WebDriver driver=new ChromeDriver();  
		driver.get(url);
		driver.manage().window().fullscreen();
		//login to the application 
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(ps);
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
		driver.getWindowHandle();
		driver.navigate().forward();
		boolean log = driver.findElement(By.xpath("//div[@id='logo_aT']")).isDisplayed();
		
	      if(log==true) 
		gk.setExclProperty("manish", 6, 5, "pass");
	      else
	    	  gk.setExclProperty("manish", 6, 5, "skip");
	
	}

}
