package com.WebApplication;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class GetTextFormCleartrip {
	static {
		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException  {
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().fullscreen();
			
//	    Actions action=new Actions(driver);
//	    Action sendEsc=action.sendKeys(Keys.ESCAPE).build();
//	    sendEsc.perform();
		
     // Escape the login pop-up
	 	 Robot robot=new Robot();
	 	 robot.keyPress(KeyEvent.VK_ESCAPE);
	 	 
		
	 	
	 // Entering and selecting place to start 	
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("Bangalore");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='flex flex-middle'])[4]")).click();
		
	//  It is a another method to selected options
//		List<WebElement> allLink = driver.findElements(By.xpath("(//div[@class='flex flex-middle'])[4]"));
//		int count =allLink.size();
//		allLink.get(0).click();

	 // Entering and selecting place to end	
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("Goa"); 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		List<WebElement> allLink1 = driver.findElements(By.xpath("(//p[contains(text(),'Goa')])[1]"));
		int count1 =allLink1.size();
		allLink1.get(0).click();
	   
	 // clicking on calendar button	 
		driver.findElement(By.xpath("(//button[contains(@class,'flex flex-middle')])[3]")).click();
		
	 // clicking on data button
		driver.findElement(By.xpath("(//div[contains(@class,'day-gridContent')])[29]")).click();
		
	 // Entering search button
		driver.findElement(By.xpath("//div[contains(@class,'flex flex-around')]")).click();
			
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
	    List<WebElement> name = driver.findElements(By.xpath("//div[@class='flex flex-row nmx-1']"));
	    int count2=name.size();	
	    System.out.println(count2);
	
	    List<WebElement> startTime = driver.findElements(By.xpath("//div[@class='flex flex-row nmx-1']/../../../../../..//div[2]/div[1]/div[1]/p"));
	    int count3=startTime .size();	
	
	    for(int i=0;i<count2;i++) {
		String nameOfFlite=name.get(i).getText();
		String nameOfStaringTime=startTime.get(i).getText();
		
		System.out.println("Flightname.."+nameOfFlite+"....Departure Time"+nameOfStaringTime);
	    }
//	    name.forEach(e->System.out.println(e.getLocation().getX()));
	  //  driver.close();
	
	}
}