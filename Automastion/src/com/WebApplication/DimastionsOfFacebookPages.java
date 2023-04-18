package com.WebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DimastionsOfFacebookPages {
	static { 
		//System.setProperty("webdriver.chrome.driver","./drvier\\chromedriver.exe"); 
		System.setProperty("webdriver.gecko.driver","./driver\\geckodriver.exe"); 
	}
	public static void main(String[] args) {
		//WebDriver driver=new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/campaign/landing");
		
	   boolean logo = driver.findElement(By.xpath("//img[@class='fb_logo _agiv img']")).isDisplayed();
	    
	     if (logo) {
	    	 System.out.println("Pass");
	     }
	     else {
	    	 System.out.println("Faild");
	     }
	     //Alignment  caking of data text field
	       Dimension day = driver.findElement(By.xpath("//select[@id='day']")).getSize();
	     System.out.println(day);
	   
	   int radio1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
	   int radio2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY(); 
	   int radio3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
	   
	     if (radio1==radio2&&radio2==radio3) {
	  	   System.out.println("Pass");
	      }
	    else {
		   System.out.println("Faild");
	   }
	  driver.close();
	 }
      
}
