package com.WebApplication;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxInAutomastion {
	static { 
		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe"); 
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//		driver.findElement(By.className("btn btn-danger")).click();
		
		Alert al=driver.switchTo().alert(); 
		String list=al.getText();
		System.out.println(list);
		Thread.sleep(2000);
     	al.accept();
     	
     	
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
     	driver.findElement(By.xpath("//button[contains(text(),'confirm box ')]")).click();
     	Alert al1=driver.switchTo().alert();
    	String list1=al.getText();
    	System.out.println(list1);
    	Thread.sleep(2000); 
    	al1.dismiss();
   
//    	String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
//    	if(text.equals("You pressed Ok"))
//    	{
//    		System.out.println("You pressed Ok...>"+"is present");
//    	}else {
//    		System.out.println("You Pressed Cancel...>"+"is present");
//    	}
    	
    boolean text = driver.findElement(By.xpath("//p[@id='demo']")).isDisplayed();
    	if(text)
    	{  
    	    System.out.println("Displayed...>confarmastion Message!");
    	}else {
    		System.out.println("Not Displayed...>confarmastion Message!");
    	}
		driver.close();

	}
	

}
