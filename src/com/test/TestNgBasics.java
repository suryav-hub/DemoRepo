package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	
	//pre conditions
	@BeforeSuite
	public void setUp() {
		System.out.println("setup system property for chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch Chrome Browser");
	}
	
	
	@BeforeClass
	public void login() {
		System.out.println("Login method");
	}
	
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter URL");
	}
	
	
	
	//test case starting with @test
	@Test
	public void googleTitleTest() {
		System.out.println("google title test");
	}
	
	@Test 
	public void googleTest() {
		System.out.println("google test");
	}
	
	
	//post conditions
	@AfterMethod
	public void logout() {
		System.out.println("Logout method");
	}
	
	@AfterClass
	public void deleteAllCookies() {
		System.out.println("Delete Cookies");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterSuite
	public void generateReport() {
		System.out.println("Generate report");
	}
	
	

}
