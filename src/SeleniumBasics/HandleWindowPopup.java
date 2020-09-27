package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Valluri\\Desktop\\Coding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.popuptest.com/");
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		// ---------- driver.findElement(By.id()); ///click on link to open new popup
		
		driver.findElement(By.xpath("//a[contains(text(),'Come & Go Test')]")).click();;
		
		Thread.sleep(3000);
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowID = it.next();
		
		System.out.println("The id of the parent window"+parentWindowID);
		
		String childWindowID = it.next();
		
		System.out.println("The id of the child window"+childWindowID);
		
		driver.switchTo().window(childWindowID);
		
		System.out.println("Child window popup title"+ driver.getTitle());
		
		driver.close(); //to close child window
		
		driver.switchTo().window(parentWindowID);
		
		driver.navigate().back();
		
	}

}
