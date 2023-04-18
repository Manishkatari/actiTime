package com.WebApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcGetLink {
	static { System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe"); }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
       List<WebElement> text = driver.findElements(By.xpath("(//div[@class='top-list'])[1]"));
       
       //Tradestion way
//	    int count = text.size();
//	    System.out.println(count);
//	    for( WebElement le:text) {
//	    	System.out.println(le.getText());
//	    }
       
       //lambda parameter
       text.forEach(e->System.out.println(e.getText()));
	  driver.close();
	} 
    
}
