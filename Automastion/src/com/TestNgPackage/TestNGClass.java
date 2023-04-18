package com.TestNgPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ganarikpackage.BaseClass;

public class TestNGClass extends BaseClass  {

	@Test
	public void testlogin() {
		Reporter.log("manish");
	}
	@Test
	public void testlogin1() {
		Reporter.log("mounika");  
	}
	@Test
	public void testlogin2() { 
		Reporter.log("syam");
	}
	
	

}
