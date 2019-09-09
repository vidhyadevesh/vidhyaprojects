package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutableClass extends BaseClass    {
	public static void main(String[] args) {
		LaunchBrowser("http://www.facebook.com/");
		WebElement e = driver.findElement(By.id("email"));
		type(e,"vidhya");
		WebElement f = driver.findElement(By.id("pass"));
		type(f,"1234");
		WebElement btn = driver.findElement(By.id("loginbutton"));
		click(btn);
		closeBrowser();
		
	}
	

}
