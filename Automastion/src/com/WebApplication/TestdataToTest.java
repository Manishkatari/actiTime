package com.WebApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestdataToTest  {
	static {
		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception  {
		
		FileInputStream file=new FileInputStream("./TestData/TestData.propartes");
		Properties p=new Properties();
		p.load(file);
        String url=p.getProperty("url");
        String un=p.getProperty("usarname");
        String ps=p.getProperty("password");
	    WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(ps);
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();

	}

}
