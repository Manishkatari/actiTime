package com.WebApplication.Online;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class UsingLambdaExp {
	static {
		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver\\geclodriver.exe");
	}
	
	public static  void main(String[] args) throws AWTException, IOException {
		
		 
	  WebDriver driver=new ChromeDriver();  
	 // WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		// This using sendKeys method to click on the cancel button
		Actions action=new Actions(driver);
//		action.sendKeys(Keys.ESCAPE).build().perform();
		
		// This using moveByOffset method to click on the cancel button
		int locater = driver.findElement(By.tagName("button")).getSize().getWidth();
		action.moveByOffset(0, locater).click().build().perform();

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone14 pro max");
		
		 driver.findElement(By.xpath("//button")).click();
		 
		 
		 
		 //Tacking screen shot code 
		 TakesScreenshot sk=  (TakesScreenshot)driver;      //casting the WebElemant to TakesScreeanshot 
		 File source=sk.getScreenshotAs(OutputType.FILE);    // calling method  as a getScreeanshotAs 
		 FileUtils.copyFile(source,new File("./Screenshot/surchpage.png"));  // passing the file location
		 

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.navigate().forward();
		
		List<WebElement> titleofiteam = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
		List<WebElement> priseofitem = driver.findElements(By.xpath("//div[contains(text(),'APPLE')]/../..//div[2]/div[1]/div[1]/div[1]"));
		  
		 Map<String,String> product_map= new HashMap<String,String>();
		 
	  Robot robot=new Robot();
//		    for(int i=0;i<=50;i++) {
//	         robot.keyPress(KeyEvent.VK_DOWN);
//	         driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//		    }
//		    robot.keyPress(KeyEvent.VK_CONTROL);
//		    robot.keyPress(KeyEvent.VK_SHIFT);
//		    robot.keyPress(KeyEvent.VK_I);
//		    
//		    robot.keyRelease(KeyEvent.VK_CONTROL);
//		    robot.keyRelease(KeyEvent.VK_SHIFT);
//		    robot.keyRelease(KeyEvent.VK_I);
		 

		    
		for(int i=0;i<titleofiteam.size();i++) {
			  String title=titleofiteam.get(i).getText();
			  String price=priseofitem.get(i).getText();
			  product_map.put(title,price);
		  }
        //lambda statement		
	    product_map.forEach((t,p)->System.out.println(t+"  "+p));
	    
	    //opting new tab using robot class
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_T);
	    robot.keyRelease(KeyEvent.VK_T);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    
	    driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS);
	   driver.close();

	}

}
