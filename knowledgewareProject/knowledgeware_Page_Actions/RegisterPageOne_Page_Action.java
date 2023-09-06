package knowledgeware_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import knowledgeware_Page_Locators.RegisterPageOne_Page_Locator;
import web_Common_Function.WebLink;
import web_Common_Function.WebTextBox;

public class RegisterPageOne_Page_Action {
	WebDriver driver = null;
	ExtentTest graphicalTest = null;
	RegisterPageOne_Page_Locator pageOnePL = null;
	
	public RegisterPageOne_Page_Action(WebDriver driver, ExtentTest graphicalTest) {
		this.driver = driver;
		this.graphicalTest = graphicalTest;
		pageOnePL = new RegisterPageOne_Page_Locator(driver);
	}
	
	public void enterUserName(String user) {
		WebTextBox.enterText(pageOnePL.getUserName(), user);
		graphicalTest.log(LogStatus.PASS, "I have succesfully entered "+user+" username");
	}
	
	public void enterPassword(String password) {
		WebTextBox.enterText(pageOnePL.getPassword(), password);
		graphicalTest.log(LogStatus.PASS, "I have succesfully entered "+password+" password");
	}
	
	public void enterConfPass(String confPassword) {
		WebTextBox.enterText(pageOnePL.getConfirmPassword(), confPassword);
		graphicalTest.log(LogStatus.PASS, "I have succesfully entered "+confPassword+" Confirm Password");
	}
	
	public void clickLogin() {
		WebLink.click(pageOnePL.getLoginLink());
		graphicalTest.log(LogStatus.PASS, "I have succesfully clicked on login ");
	}
	
	public RegisterPageTwo_Page_Action enterDetails(String u, String p, String cf) {
		RegisterPageTwo_Page_Action regTwoPA = null;
		try {
			enterUserName(u);
			enterPassword(p);
			enterConfPass(cf);
			clickLogin();
			regTwoPA = new RegisterPageTwo_Page_Action(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return regTwoPA;
	}
}
