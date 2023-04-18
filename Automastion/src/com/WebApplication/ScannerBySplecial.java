package com.WebApplication;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScannerBySplecial {
	static 
	{ 
		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/multiselectlistbox.html");
		
		String text=null;
		String list=null;
		 
		try{
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the value");
		    list=sc.next();
		    sc.close();
		   }
		 catch(Exception e){
			 System.out.println("not mached found");
     		// driver.close();
		 }
		
	  
		List<WebElement> alllist = driver.findElements(By.id("mtr"));
		int count=alllist.size();
		System.out.println(count);
		
		
		
		for(WebElement le:alllist) {
		     text = le.getText();	
		}
		
			ArrayList<String> list1=new ArrayList<String> ();
			list1.add(text);
			
			list1.add(list);
		    System.out.print(list1);
		    
		    WebElement mulsellistbox=driver.findElement(By.id("mtr"));
			Select sel1= new Select(mulsellistbox);
			sel1.selectByVisibleText(list);
			Thread.sleep(5000);
			//driver.close();

//         WebElement mulsellistbox=driver.findElement(By.id("mtr"));
//         try{
//        	 if(list==list) {
//      		   Select sel1= new Select(mulsellistbox);
//                 sel1.selectByVisibleText(list);     
//                 Thread.sleep(3000);
//                 System.out.println(list);
//                 driver.close();
//              }
//			 catch(NoSuchElementException e){
//				 System.out.println("not mached found");
//	     		 driver.close();
//			 }

	}

}
