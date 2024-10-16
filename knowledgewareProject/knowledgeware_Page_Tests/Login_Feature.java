package knowledgeware_Page_Tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dataSource.PropertyReader;
import web_Common_Function.WebBrowser;
import web_Common_Function.WebElementCommon;
import web_Common_Function.WebLink;
import web_Common_Function.WebTextBox;

public class TestClass {
	public static void main(String[] args) throws IOException {
		WebDriver driver = WebBrowser.getBrowser(PropertyReader.getPropertyValue(StaticDM.propertyPath,"browser"));
		WebBrowser.openURL(driver, PropertyReader.getPropertyValue(StaticDM.propertyPath,"url"));
		if(WebBrowser.titleMatch("Register page", driver)) {
			WebElement confPass=  driver.findElement(By.name("confirmpassword"));
			WebTextBox.enterText(WebElementCommon.findBy(driver, By.name("name")), "Dilip");
			WebTextBox.enterText(driver.findElement(By.name("password")), "DilipPass");
			WebTextBox.enterText(confPass, "DilipConfPass");
			WebLink.click(WebElementCommon.findBy(driver, By.linkText("LOGIN")));
		}
		/*List<WebElement> eles = WebElementCommon.findBys(driver, By.xpath("//*[@type='text']"));
		for(WebElement ele: eles) {
			System.out.println("Hello");
		}*/
	}
}
