package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertCheck {
	
	
	
	@Test(priority = 1)
	public void test1() {
		
		SoftAssert softAssert = new SoftAssert();
		System.out.println("open browser");
		System.out.println("Enter URL");
		softAssert.assertEquals(false, true,"URl doesnt exist");
		System.out.println("enter username");
		System.out.println("Enter password");
		softAssert.assertEquals(false, true,"user dint logged into system");
		softAssert.assertAll();
		
	}
	
	@Test(priority = 2)
	public void test2() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Close the browser");
		softAssert.assertEquals(false, true,"browser dint get closed successfully");
		softAssert.assertAll();
		
	}

}
