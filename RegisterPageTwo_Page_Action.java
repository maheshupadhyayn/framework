package knowledgeware_Page_Actions;

import org.openqa.selenium.WebDriver;
import knowledgeware_Page_Locators.RegisterPageTwo_Page_Locator;
import web_Common_Function.WebTextBox;

public class RegisterPageTwo_Page_Action {
	WebDriver driver = null;
	RegisterPageTwo_Page_Locator pageTwoPL = null;
	
	public RegisterPageTwo_Page_Action(WebDriver driver) {
		this.driver = driver;
		pageTwoPL = new RegisterPageTwo_Page_Locator(driver);
	}
	
	public void enterFirstName(String user) {
		WebTextBox.enterText(pageTwoPL.getFirstName(), user);
	}
	
	public void enterPageTwoDetails(String fN) {
		enterFirstName(fN);
	}
}
