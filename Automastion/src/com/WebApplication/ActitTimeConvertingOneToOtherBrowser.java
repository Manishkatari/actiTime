package com.WebApplication;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActitTimeConvertingOneToOtherBrowser extends TestdataToTest {
	static {
		System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver\\geclodriver.exe");
	}

	public static void main(String[] args) {
		 
	  WebDriver driver=new ChromeDriver();  
	 // WebDriver driver = new FirefoxDriver();
          
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().fullscreen();
	

		
		//login to the application 
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
	   
		//clicking on the help icon 
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		
		//clicking on the link present in help icon
		driver.findElement(By.xpath("(//li/a[@class='item_link'])[13]")).click();
		
		//clicking the child windows link
	    String title = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(title);
	
		
		//Converting the control one browser to other browser
        driver.navigate().to("https://www.actitime.com/legal/service-agreement");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //Get the child windows headings 
	     List<WebElement> title1 = driver.findElements(By.xpath("//h2"));
	    int count=title1.size();
	    for(int i=0;i<count;i++) {
		   String heading=title1.get(i).getText();
		   System.out.println(heading);
	   }
        driver.quit();
	}
}
