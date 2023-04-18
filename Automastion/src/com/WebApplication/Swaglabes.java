package com.WebApplication;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class Swaglabes  {

	static { 
		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe"); 
		}
   public void isSwaglabes() throws InterruptedException {
	   WebDriver driver =new ChromeDriver();
	   //login to application
	   driver.get("https://www.saucedemo.com/");
	   //username
	   driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	   //password
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	   //login button
	   driver.findElement(By.xpath("//input[@id='login-button']")).click();
	   //home page 
	   driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	   Thread.sleep(3000);
	   driver.navigate().back();
	   driver.close();

   }
   
   public static void main(String args[]) throws InterruptedException {
	   int countno=0;
	   Swaglabes det=new Swaglabes();
	   for (int i=0;i<2;i++)
	   {
		   det.isSwaglabes();
		   Thread.sleep(2000);
		    countno++;
		    }
	   System.out.println(countno);
	   }
}
