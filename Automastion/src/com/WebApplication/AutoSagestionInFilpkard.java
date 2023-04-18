package com.WebApplication;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class AutoSagestionInFilpkard {

	static { System.setProperty("webdriver.chrome.driver","./driver//chromedriver.exe"); }
	public static void main(String[] args) throws AWTException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
	
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone14 pro max");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    List<WebElement> auto = driver.findElements(By.xpath("//div[contains(text(),'iphone 14 pro max')]"));
		int number = auto.size(); 
		System.out.println("No of Autosagestion:"+number);
		
		TakesScreenshot sh=(TakesScreenshot)driver;
		File scr=sh.getScreenshotAs(OutputType.FILE);
		File dest= new File("./ScreeanShort/autosagestion.png");
		FileUtils.copyFile(scr, dest);
  
		// Tradestional way before java8 version
//		for (int i=0;i<number;i++) {
////			String get = auto.get(i).getText(); 
////			System.out.println(get);
//		    System.out.println(auto.get(i).getText());
//		}
		
//		for(WebElement li:auto) {
//			System.out.println(li.getText());
//		}
//		System.out.println(" ");
		
		//lambdas parameters get text form the list of autosagestion and selecting the value 
		auto.forEach(e->System.out.println(e.getText()));
		auto.get(number-2).click(); 
		
		 //Scrolling option with out javascipt class By using Robot class
        for(int i=0;i<=50;i++) {
     	   Robot robot=new Robot();
     	   robot.keyPress(KeyEvent.VK_DOWN);
     	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }

	}

}
 
