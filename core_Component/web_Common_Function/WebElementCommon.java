package web_Common_Function;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebElementCommon {
	/*
	 * This method is used to validate wether element is present in DOM
	 * Param: - WebElement
	 * Return: - Boolean
	 */
	public static boolean isPresent(WebElement element) {
		boolean isPre = false;
		if(element.isDisplayed()) {
			isPre = true;
		}
		return isPre;
	}
	/*
	 * This method is used to validate wether element is clickable
	 * Param: - WebElement
	 * Return: - Boolean
	 */
	public static boolean isClickable(WebElement element) {
		boolean isClick = false;
		if(isPresent(element)) {
			if(element.isEnabled()) {
				isClick = true;
			}
		}
		return isClick;
	}
	
	public static boolean elementTextValidation(String expetedTitle, WebElement element, ExtentTest test) {
		boolean isTextMatch = false;
		if(element.getText().equals(expetedTitle)) {
			isTextMatch = true;
			test.log(LogStatus.PASS, expetedTitle+ " match on UI");
		}else {
			test.log(LogStatus.PASS, expetedTitle+ " does not match on UI");
		}
		return isTextMatch;
	}
	
	public static boolean isClickable(WebElement element, ExtentTest test) {
		boolean isClick = false;
		if(isPresent(element)) {
			if(element.isEnabled()) {
				isClick = true;
			}else {
				test.log(LogStatus.FAIL, "Element is not able to clickable");
			}
		}else {
			test.log(LogStatus.FAIL, "Element is not present in dom");
		}
		return isClick;
	}
	public static WebElement findBy(WebDriver driver, By by) {
		WebElement ele = null;
		try {
			ele = driver.findElement(by);
		} catch (Exception e) {
			System.out.println("Element is wrong");
		}
		return ele;
	}
	
	public static List<WebElement> findBys(WebDriver driver, By by) {
		List<WebElement> eles = null;
		try {
			eles = driver.findElements(by);
		} catch (Exception e) {
			System.out.println("Element is wrong");
		}
		return eles;
	}
	//getattribute
	//multiple elements
	//findBys
}
