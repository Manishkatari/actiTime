package com.WebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopUPDemo {
static {
	System.setProperty("webdriver.gecko.driver","./driver\\geckodriver.exe"); 
}

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.google.com/");
	    driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]")).click();
	    driver.findElement(By.name("q")).sendKeys("manish");
	    

	}

}
