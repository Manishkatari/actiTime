package com.WebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreinsuranceAutomatedScript {
	static { System.setProperty("webdriver.chrome.driver","./driver//chromedriver.exe"); }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("1234");
		driver.findElement(By.id("dob")).click();
		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		 Select sel1= new Select(year);
		 sel1.selectByVisibleText("1997");
		 WebElement mounth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		 Select sel2= new Select(mounth);
		 sel2.selectByIndex(7); 
		 
	   driver.findElement(By.xpath("//a[contains(text(),'22')]")).click();
	   
		driver.findElement(By.cssSelector("#alternative_number")).sendKeys("9845098450");
		
		 driver.findElement(By.xpath("//button[@id='renew_policy_submit']")).click();
		 
//		String text = driver.findElement(By.xpath("//span/strong/span[@id='policynumberError']")).getText();
//		 System.out.println(text);

		 
	boolean text1 = driver.findElement(By.xpath("//span[contains(text(),'valid Policy No.')]")).isDisplayed();
		
	if(text1) {
		System.out.println("Please enter valid Policy No."+" present\t"+"[Pass]");
	}else {
		System.out.println("Please enter valid Policy No."+" not present\t"+"Faild");
	}
		 
	//driver.close();
	
	}
}
