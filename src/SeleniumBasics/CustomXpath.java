package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Valluri\\Desktop\\Coding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//dynamic xpath
		
		//1. //tagname[@attrname = 'value']
		
		//2. //tagname[contains(@attrname, 'Value')]
		
		//3. //tagname[starts-with(@attrname, 'Value')]
		
		//4. //tagname[ends-with(@attrname, 'Value')]
		
		//for links - custom xpath
		
		//a[contains(text(),'My Account')]

	}

}
