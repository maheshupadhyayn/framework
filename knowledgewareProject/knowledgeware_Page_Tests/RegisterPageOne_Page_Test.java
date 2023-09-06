package knowledgeware_Page_Tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import initializerPkg.BaseClass;
import knowledgeware_Page_Actions.RegisterPageOne_Page_Action;
import knowledgeware_Page_Actions.RegisterPageTwo_Page_Action;
import web_Common_Function.WebBrowser;

public class RegisterPageOne_Page_Test extends BaseClass{
	@Test
	public void registrationTC(Method method) throws IOException {
		try {
			RegisterPageTwo_Page_Action regTwoPA = 
					new RegisterPageOne_Page_Action(driver, graphicalTest).enterDetails("Dilip", "Rahul", "Maheshwari");
			Assert.assertEquals(WebBrowser.titleMatch("Reg2", driver), true);
			regTwoPA.enterPageTwoDetails("Asha");
			graphicalTest.log(LogStatus.PASS, graphicalTest.addScreenCapture(screenCapture(driver, method))+ "Test Succesfully run");
		} catch (Exception e) {
			graphicalTest.log(LogStatus.FAIL, graphicalTest.addScreenCapture(screenCapture(driver, method))+ "Test Failed  because got exception");
		}
	}
}
