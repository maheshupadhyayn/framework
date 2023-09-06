package web_Common_Function;

import org.openqa.selenium.WebElement;

public class WebLink {
	public static void click(WebElement link) {
		if(WebElementCommon.isClickable(link)) {
			link.click();
		}
	}
}
