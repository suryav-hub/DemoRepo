package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class GoogleSearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Valluri\\Desktop\\Coding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("testing");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role = 'listbox']//li/descendant::div[contains(@class,'sbl1')]/span"));
		
		System.out.println(list.size());
		
		
		
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("testing tools")) {
				list.get(i).click();
				break;
			}
		}
		
		driver.quit();
		
	}

}
