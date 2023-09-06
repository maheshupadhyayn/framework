package knowledgeware_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageTwo_Page_Locator {
	WebDriver driver = null;
	public RegisterPageTwo_Page_Locator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(name = "abcFirst_Name")	
	private WebElement firstName;
	
	public WebElement getFirstName() {
		return firstName;
	}
}
