package com.WebApplication.Online;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RaviProbleam {
	static {
		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
     	WebElement link = driver.findElement(By.xpath("//a[@class='sVXRqc']"));
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).moveToElement(link).click().perform();
  	
		
		ArrayList<String> tab =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		
		
		List<WebElement> text = driver.findElements(By.xpath("//ul[@id='globalnav-list']/child::li[2]/child::div/child::div/child::div"));

		for(WebElement li:text) {
		 System.out.println(li.getText());
	    }
	    
	
	}

}
