package mediflox_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import mediflox_Page_Locators.Login_Page_Locator;
import web_Common_Function.WebButton;
import web_Common_Function.WebElementCommon;
import web_Common_Function.WebTextBox;

public class Login_Page_Action {
	WebDriver driver = null;
	ExtentTest graphicalTest = null;
	Login_Page_Locator loginPL = null;
	public Login_Page_Action(WebDriver driver, ExtentTest graphicalTest) {
		this.driver = driver;
		this.graphicalTest = graphicalTest;
		loginPL = new Login_Page_Locator(driver);
	}
	public void enterUser(String user) {
		WebTextBox.enterText(loginPL.getUser(), user, graphicalTest);
	}
	public void enterPassword(String password) {
		WebTextBox.enterText(loginPL.getPassword(), password, graphicalTest);
	}
	public void clickLogin() {
		WebButton.click(loginPL.getLogin(), "Login", graphicalTest);
	}
	public void validateError(String error) {
		WebElementCommon.elementTextValidation(error, loginPL.getEssrrorLabel(), graphicalTest);
	}
	public void succesfullyLogin(String user, String pass) {
		enterUser(user);
		enterPassword(pass);
		clickLogin();
	}
	public void unsuccesfullLogin(String user, String pass, String error) {
		enterUser(user);
		enterPassword(pass);
		clickLogin();
		validateError(error);
	}
}
