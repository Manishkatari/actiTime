package com.WebApplication;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiListBox {
	
	static { System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe"); }
	
	public static void main(String[] args) throws InterruptedException {
		
				WebDriver driver=new ChromeDriver();
				driver.get("file:///D:/Selenium/multiselectlistbox.html");
				//Fist list box
				WebElement mulsellistbox = driver.findElement(By.id("mtr"));
	            Select sel= new Select(mulsellistbox);
	            sel.selectByIndex(0);
	            Thread.sleep(2000);
	            sel.selectByValue("k");
	           driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	            sel.selectByVisibleText("vada");
	            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	            sel.deselectAll();
	       
	           List<WebElement> allop = sel.getOptions();
	           List<String> sortop = allop.stream().map(e->e.getText()).sorted().collect(Collectors.toList());
	           System.out.println(sortop); 
	            
	            
	            
	            
	          //Second list box
	            boolean icon= driver.findElement(By.id("cp")).isDisplayed();
	            if(icon) {
		            	 WebElement mulsellistbox1 = driver.findElement(By.id("cp"));
		 	            Select sel1= new Select(mulsellistbox1);
		 	            sel1.selectByIndex(0);
		 	            Thread.sleep(2000);
		 	            sel1.selectByValue("i");
		 	            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 	            sel1.selectByVisibleText("badham milk");
		 	            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 	            
		 	              List<WebElement> sellall = sel1.getAllSelectedOptions();
//  		 	              for(WebElement li: sellall) {
// 		 	            	  System.out.println(li.getText());
//    	 	              }
		 	              sellall.forEach(e->System.out.println("sellect option\t"+e.getText()));
		 	              sel1.deselectAll(); 
		 	              
		 	           List<String> beforelist = sellall.stream().map(all->all.getText()).collect(Collectors.toList());
		 	          System.out.println("Beforesort\t"+beforelist);
		 	          
		 	           List<String> afterlist = sellall.stream().map(all->all.getText()).sorted().collect(Collectors.toList());
		 	           System.out.println("Aftersort\t"+afterlist);
		 	          
		 	             
		 	               driver.close()  ;
	            	
	            }
	            else {
	            	driver.close();
	            }   
	            
	 
				
	}
	


}
