package com.WebApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedScript {
	static { System.setProperty("webdriver.chrome.driver","./driver//chromedriver.exe"); }
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> allLink = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count =allLink.size();
		System.out.println(count);
		
//		for(int i=0;i<count;i++) {
//			String text=allLink.get(i).getText();
//			System.out.println(text);
//		}
		//lambda
		allLink.forEach(e->System.out.println(e.getText()));
		allLink.get(count-1).click();		
		driver.close();
	}

}
