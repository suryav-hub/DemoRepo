package SeleniumBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Surya Valluri\\Desktop\\Coding\\Java\\SeleniumSessions\\src\\SeleniumBasics\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		
		String browser = prop.getProperty("browser");
		
		System.out.println(url);
		
		System.out.println(browser);
		
		if(browser.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya Valluri\\Desktop\\Coding\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Surya Valluri\\Desktop\\Coding\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			
		}
		
		
		
		
		
		
	}

}
