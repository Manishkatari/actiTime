package com.PomPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ganarikpackage.Ganarikclass;

public class TestMethod  {

	static { System.setProperty("webdriver.chrome.driver","./driver//chromedriver.exe"); }
	WebDriver driver;
	@Test
	public void validateLogin() throws IOException {
	 driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().fullscreen();
	
	 Ganarikclass gk =new  Ganarikclass();
	 String un = gk.getProperty("username");
	 String pw = gk.getProperty("password");
	
	 LoginPage log=new LoginPage(driver);
	 

	 log.setlogin(un, pw);
	}

	
}
