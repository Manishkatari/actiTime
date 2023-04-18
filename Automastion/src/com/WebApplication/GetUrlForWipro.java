package com.WebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlForWipro {
	static { System.setProperty("webdriver.chrome.driver","./driver//chromedriver.exe"); }
	
	public static void main(String[] args) throws InterruptedException {
		  //Open the browser
			WebDriver driver=new ChromeDriver();
         //Entering Url google.com
			driver.get("https://www.google.com/");
		 // Entering value
			driver.findElement(By.name("q")).sendKeys("wipro");
			
			
	}

}
