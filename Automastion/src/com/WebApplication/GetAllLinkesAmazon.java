package com.WebApplication;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetAllLinkesAmazon {

	static { System.setProperty("webdriver.chrome.driver","./driver//chromedriver.exe"); }
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a")); 
		  int alllink = links.size();
		  System.out.println("AllLinks Present in Website"+alllink);
		  
		  
		   // Tradestional way before java8 version
//			for(WebElement lk:link ) {
//			//String lk1=((WebElement) link).getAttribute("href");
//			System.out.println(lk.getAttribute("href"));
//		}
		  
		  //lambda parameters on  java8  version
		  links.forEach(link->System.out.println(link.getText()));
		  
		 long workinglinks = links.stream().filter(link->link.getAttribute("href")!=null).count();
		 System.out.println("No of workinglinks:"+workinglinks);
		 
		 System.out.println(alllink-workinglinks);
		 
		  
		  //Scrolling option with out javascipt class By using Robot class
         for(int i=0;i<=50;i++) {
      	   Robot robot=new Robot();
      	   robot.keyPress(KeyEvent.VK_DOWN);
      	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      	   
         }
		
	}
}
