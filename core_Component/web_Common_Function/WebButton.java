package web_Common_Function;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebButton {
	//click
	//getText
	//getattribute
	public static void click(WebElement button, String btnName, ExtentTest test) {
		if(WebElementCommon.isClickable(button, test)) {
			button.click();
			test.log(LogStatus.PASS, btnName +" succesfully clicked.");
		}else {
			test.log(LogStatus.PASS, btnName +" not able to clicked.");
		}
	}
}
