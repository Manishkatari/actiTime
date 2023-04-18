package com.WebApplication;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphaOderInMtr {



	static { System.setProperty("webdriver.chrome.driver","./driver//chromedriver.exe"); }
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/multiselectlistbox.html");
		
		List<WebElement> text = driver.findElements(By.id("mtr"));
	    int count = text.size(); 
	    System.out.println(count);
  
//      ArrayList<String> aul=new ArrayList<String>(); 
//	    for(int i=0;i<count;i++) 
//	    {
//	    	String  link=text.get(i).getText();
//	    	aul.add(link);
//	    }
//	    Collections.sort(aul);
//		System.out.println(aul);
	    
	    //Advance  
	  	WebElement mulsellistbox = driver.findElement(By.id("mtr"));
	    Select sel= new Select(mulsellistbox);
	    List<WebElement> sortlist = sel.getOptions();
	          
	    List<String> beforsorted = sortlist.stream().map(e->e.getText()).collect(Collectors.toList());
	    System.out.println("BeforSorted"+beforsorted);
	    
	    List<String> aftersorted = sortlist.stream().map(e->e.getText()).sorted().collect(Collectors.toList());
	    System.out.println("AfterSorted"+aftersorted); 
	          
//	    Robot robot=new Robot();
	    //opting new tab using robot class
//	    robot.keyPress(KeyEvent.VK_CONTROL);
//	    robot.keyPress(KeyEvent.VK_T);
//	    String url=driver.getCurrentUrl();
//	    robot.keyRelease(KeyEvent.VK_T);
//	    robot.keyRelease(KeyEvent.VK_CONTROL);
//	    driver.navigate().to(url);
//	    driver.manage().window().maximize();
//	    driver.findElement(By.name("q")).sendKeys("manis");
	    
	}
	 
}

  



    
   

	