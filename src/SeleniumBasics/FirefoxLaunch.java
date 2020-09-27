package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Surya Valluri\\Desktop\\Coding\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		
		if (title.equals("Google")) {
			System.out.println("browser opened successfully with RIGHT URL");
		}
		else {
			System.out.println("browser opened successfully with WRONG URL");
		}
		driver.quit();
	}

}
