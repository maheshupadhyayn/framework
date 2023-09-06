package web_Common_Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebBrowser {
	public static WebDriver getBrowser(String browserName) {
		WebDriver driver = null;
		switch(browserName) {
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			case "safari":
				driver = new SafariDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			default:
				driver = new ChromeDriver();
		}
		return driver;
	}
	
	public static void openURL(WebDriver driver, String url) {
		driver.get(url);
	}
	
	public static boolean titleMatch(String expetedTitle, WebDriver driver) {
		boolean isTitle = false;
		if(driver.getTitle().equals(expetedTitle)) {
			isTitle = true;
		}
		return isTitle;
	}
	
}
