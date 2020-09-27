package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	
		WebDriver driver;
		
		@BeforeMethod
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Valluri\\Desktop\\Coding\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("http://www.google.com");
			
		}
		
		
		@Test(priority = 1)
		public void googleTitleTest() {
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		@Test(priority = 2)
		public void googleLogoTest() {
			boolean check = driver.findElement(By.xpath("//img[contains(@id,'hplogo')]")).isDisplayed();
			System.out.println("The logo displayed in the main page: " + check);
		}
		
		@Test(priority = 3)
		public void test1() {
			System.out.println("test1");
		}
		
		@Test(priority = 4)
		public void test2() {
			System.out.println("test1");
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		
}
