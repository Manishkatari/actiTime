package com.WebApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupeSelector {
	static {
		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");
	}
 public static void main(String args[]) {
	  
	  WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().fullscreen();
		
	 CssSelectorByEbay driver1=new CssSelectorByEbay();
	driver1.getAmazon(driver);
}
 
}
