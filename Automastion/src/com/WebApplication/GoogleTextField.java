package com.WebApplication;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTextField {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException { //throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> autosagestion = driver.findElements(By.xpath("//ul/li/div"));
		System.out.println(autosagestion);
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
	}
	
	

}
