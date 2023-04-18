package com.WebApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {
	static { System.setProperty("webdriver.chrome.driver","./driver//chromedriver.exe"); }
	
	public static void main(String[] args) throws InterruptedException {
		  //Open the browser
			WebDriver driver=new ChromeDriver();
         //Entering url google.com
			driver.get("https://www.google.com/");
		 // Entering value
			driver.findElement(By.name("q")).sendKeys("amazon");
			Thread.sleep(2000);
		 // In Autosagestion such result top 1
			List<WebElement> allLink = driver.findElements(By.xpath("//div/span[contains(text(),'amazon')]"));
			int count =allLink.size();
			System.out.println("Autosagesrtionsingoogle\t"+count);
			allLink.get(0).click();
			
		// In that surch result top 1
			driver.findElement(By.xpath("(//span[contains(text(),'Amazon')])[1]")).click();
			
		    driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']")).click();
		    Thread.sleep(2000);
		    
		    List<WebElement>surch=driver.findElements(By.xpath("//i[@class='nav-icon']"));
			int count1=surch.size();
			
			System.out.println("AutosagesrtionsinApplicastion\t"+count1);
			driver.manage().window().fullscreen();
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poco f1");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
	        
			driver.findElement(By.xpath("//input[@id='low-price']")).sendKeys("5000");
			driver.findElement(By.xpath("//input[@id='high-price']")).sendKeys("10000");
			driver.navigate().back();
			driver.close();
			
	}
	
}
