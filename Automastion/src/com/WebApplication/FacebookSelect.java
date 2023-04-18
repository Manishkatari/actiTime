package com.WebApplication;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelect {

	static { System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe"); 
	}
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 //click after
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 WebElement data = driver.findElement(By.xpath("//select[@id='day']"));
		 Select sel1= new Select(data);
		 sel1.selectByIndex(21);
         //
		 WebElement mounth = driver.findElement(By.xpath("//select[@id='month']"));
		 Select sel2= new Select(mounth);
		 sel2.selectByIndex(7);
         //
		 WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		 Select sel3= new Select(year);
		 sel3.selectByVisibleText("1997");
	}
}
