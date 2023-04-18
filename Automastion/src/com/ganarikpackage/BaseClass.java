package com.ganarikpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public WebDriver driver;
	public Ganarikclass gk;
	
	@BeforeClass
	public void openBrowes() { 
		Reporter.log("openBrowes");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeBrower() {
		Reporter.log("closeBrowes");
		driver.close();
	}
	
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login");
	     //creating the ganarikcalss odject 
		 gk=new Ganarikclass();
		 //get url form ganarikclass odject class
		String url = gk.getProperty("url");
		driver.get(url);
		//get the username form the ganarikclass 
		  String username = gk.getProperty("username");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		
		//get the password from the ganarikclass 
		   String password = gk.getProperty("password");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		 //click on login button 
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout");
		driver.findElement(By.id("logoutLink")).click();
      
	}

	

}
