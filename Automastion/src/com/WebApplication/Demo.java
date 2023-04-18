package com.WebApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");
	}
	public static void main(String[] args) { //throws InterruptedException {
		ChromeDriver der=new ChromeDriver();
		der.get("https://www.amazon.in/");
		der.findElement(By.id("twotabsearchtextbox")).sendKeys("poco f1");
		//Thread.sleep(2000);
		der.findElement(By.id("nav-search-submit-button")).click();
		der.findElement(By.linkText("Android 11.0")).click();
		//Thread.sleep(2000);
		der.navigate().back();
		der.manage().window().maximize();
		//Thread.sleep(2000);
		der.findElement(By.id("twotabsearchtextbox")).sendKeys(" phone");
		//Thread.sleep(2000);
		der.findElement(By.id("nav-search-submit-button")).click();
		//Thread.sleep(2000);
		der.close();
	}	
}
