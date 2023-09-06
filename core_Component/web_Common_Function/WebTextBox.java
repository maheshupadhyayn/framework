package web_Common_Function;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebTextBox {
	public static void enterText(WebElement textBox, String textToEnter) {
		if(WebElementCommon.isClickable(textBox)) {
			textBox.sendKeys(textToEnter);
		}
	}
	public static void enterText(WebElement textBox, String textToEnter, ExtentTest test) {
		if(WebElementCommon.isClickable(textBox, test)) {
			textBox.sendKeys(textToEnter);
			test.log(LogStatus.PASS, "User entered "+textToEnter+ " username succesfully.");
		}else {
			test.log(LogStatus.PASS, "User not able to entered "+textToEnter+ " username succesfully.");
			
		}
	}
	//clear
	//getText
	
}
