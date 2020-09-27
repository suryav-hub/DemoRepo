package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Valluri\\Desktop\\Coding\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
