package initializerPkg;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import dataSource.PropertyReader;
import knowledgeware_Page_Tests.StaticDM;
import web_Common_Function.WebBrowser;

public class BaseClass {
//I am writing a code to automate GoRestAPI for Get operation
	public WebDriver driver  = null;
	public static ExtentTest graphicalTest;
	public static ExtentReports graphicalReport;
	@BeforeSuite
	public void beforeSuiteStart(){
		graphicalReport = new ExtentReports(StaticDM.reportPath, true);
	}
	@BeforeMethod
	public void beforeEachTestCase(Method testMethod) throws IOException {
		driver = WebBrowser.getBrowser(PropertyReader.getPropertyValue(StaticDM.propertyPath,"browser"));
		WebBrowser.openURL(driver, PropertyReader.getPropertyValue(StaticDM.propertyPath,"url"));
		graphicalTest = graphicalReport.startTest(testMethod.getName());
	}
	@AfterMethod
	public void afterEachTestCase() {
		graphicalReport.endTest(graphicalTest);
		graphicalReport.flush();
	}
	
	public static String screenCapture(WebDriver driver, Method test) throws IOException {
		TakesScreenshot takeSS = (TakesScreenshot) driver;//Typecast driver to TakesScreenShot
		File sourceOutputFile = takeSS.getScreenshotAs(OutputType.FILE);//Make it SourceFile & type
		File Dest = new File("./Screenshot/"+test.getName()+ ".png");//Destination Path
		FileUtils.copyFile(sourceOutputFile, new File("./Screenshot/"+test.getName()+ ".png"));//Copy
		return Dest.getAbsolutePath();//Absolute Path nothing but from root
	}
}
