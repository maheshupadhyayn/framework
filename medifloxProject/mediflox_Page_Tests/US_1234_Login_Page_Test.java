package mediflox_Page_Tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import initializerPkg.BaseClass;
import mediflox_Page_Actions.Login_Page_Action;

public class Login_Page_Test extends BaseClass{
	@Test
	public void sucess(Method method) throws IOException {
		try {
			new Login_Page_Action(driver, graphicalTest).succesfullyLogin("admin", "admin");
			graphicalTest.log(LogStatus.PASS, graphicalTest.addScreenCapture(screenCapture(driver,method))+ "Test Succesfully run");
		} catch (Exception e) {
			graphicalTest.log(LogStatus.FAIL, graphicalTest.addScreenCapture(screenCapture(driver,method))+ "Test Failed  because got exception");
		}
	}
	
	@Test
	public void wrongPassword(Method method) throws IOException {
		try {
			new Login_Page_Action(driver, graphicalTest).unsuccesfullLogin("admin", "abc", "Username or Password incorrect");
			graphicalTest.log(LogStatus.PASS, graphicalTest.addScreenCapture(screenCapture(driver, method))+ "Test Succesfully run");
		} catch (Exception e) {
			graphicalTest.log(LogStatus.FAIL, graphicalTest.addScreenCapture(screenCapture(driver,method))+ "Test Failed  because got exception");
		}
	}
	
	@Test
	public void wrongUser(Method method) throws IOException {
		try {
			new Login_Page_Action(driver, graphicalTest).unsuccesfullLogin("admin", "abc", "Username or Password incorrect");
			graphicalTest.log(LogStatus.PASS, graphicalTest.addScreenCapture(screenCapture(driver, method))+ "Test Succesfully run");
		} catch (Exception e) {
			graphicalTest.log(LogStatus.FAIL, graphicalTest.addScreenCapture(screenCapture(driver,method))+ "Test Failed  because got exception");
		}
	}
}
