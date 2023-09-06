package web_Common_Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyWordFramework {
	static WebDriver driver = null;
	public static void performAction(String keyword, String object, String locator, String val) {
		driver = new ChromeDriver();
		switch (keyword) {
			case "GOTOURL": {
				driver.get(val);
			}
			case "SETEXT": {
				driver.findElement(By.name("name")).sendKeys("val");
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + keyword);
			}
	}
}
