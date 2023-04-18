package com.WebApplication;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDataExcle {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	    public static void main(String[] args) throws Exception {
		
		FileInputStream file=new FileInputStream("./TestData/manish.xlsx");
		
		Workbook wb = WorkbookFactory.create(file); 
		  
			    String usardata = wb.getSheet("manish.xlsx").getRow(0).getCell(3).getStringCellValue();
				String password = wb.getSheet("manish.xlsx").getRow(2).getCell(3).getStringCellValue();
				 
		        WebDriver driver=new ChromeDriver();
				driver.get("https://demo.actitime.com/login.do"); 
				driver.manage().window().fullscreen();
					
				//login to the application 
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys(usardata);
				driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
				driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
				 
	   }

}
