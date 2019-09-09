package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static void LaunchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohini.Ramakrishnan.AMERICANTOWER\\eclipse-workspace\\Base\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	public static void type(WebElement loc, String input) {
		loc.sendKeys(input);
		
	}
	public static void click(WebElement loc) {
		loc.click();
	}
	public static void closeBrowser() {
		driver.quit();
	
	

}}
