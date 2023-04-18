package com.WebApplication;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemantInStaticWebPage {
static { System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe"); }
	
	public static void main(String[] args) throws InterruptedException {
		  //Open the browser
			WebDriver driver=new ChromeDriver();
			driver.get("file:///D:/Selenium/Static.html");
			
	    String text = driver.findElement(By.xpath("(//input[@type='text'])[1]")).getText();
	    System.out.println(text); 
	    driver.close();	}

}
