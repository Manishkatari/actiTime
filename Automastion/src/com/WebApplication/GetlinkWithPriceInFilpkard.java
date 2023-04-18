package com.WebApplication;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GetlinkWithPriceInFilpkard {

	static { System.setProperty("webdriver.chrome.driver","./driver\\\\chromedriver.exe"); }
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Actions action=new Actions(driver);
		Action sendEsc=action.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("POCO M4 Pro ");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 List<WebElement> text = driver.findElements(By.xpath("//div[contains(text(),'POCO M4 Pro')] "));
		 int co1=text.size();
		 System.out.println(co1);
		 
		 List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'POCO M4 Pro')]/../../div[2]/div[1]/div[1]/div[1] "));
		 int co=price.size();
		 System.out.println(co);
		 try {
			 for(int i=0;i<co1;i++) {
					String get = price.get(i).getText();
					String get1 =text.get(i).getText();
					System.out.println("PhoneName:"+get1+"------->"+"priceOfPhone:"+get);
					
				}
				driver.close();
		 }
		 catch(IndexOutOfBoundsException e) {
			 driver.close();
			 
		 }
	}
}
