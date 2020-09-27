package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class JavaScriptExecutorConcept {

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
		
		
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
		flash(link,driver);
		drawBorder(link,driver);
		generateAlert(driver,"test message");
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		clickElementByJS(link,driver);
		
		//refreshBrowserByJS(driver);
		
		System.out.println(getTitleByJS(driver));
		
		//System.out.println(getPageInnerText(driver));
		
		//scrollPageDown(driver);
		
		WebElement ourPolicylink = driver.findElement(By.xpath("//a[contains(text(),'Our policy')]"));
		
		scrollIntoView(ourPolicylink,driver);
		flash(ourPolicylink,driver);
		//driver.quit();
		
		
		

	}
	
	public static void flash(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i = 0; i<=20; i++) {
			changeColor("rgb(0,200,0",element,driver);
			changeColor(bgcolor,element,driver);
		}
		
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			
		}
		
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '3px solid red'", element);

	}
	
	public static void generateAlert(WebDriver driver,String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");

	}
	
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();",element);

	}
	
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");

	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String innerText = js.executeScript("return document.documentelement.innerText;").toString();
		return innerText;
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);

	}

}
