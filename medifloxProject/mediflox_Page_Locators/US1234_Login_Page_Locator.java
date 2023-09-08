package mediflox_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Locator {
	WebDriver driver = null;
	public Login_Page_Locator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Username")
	private WebElement user;
	
	public WebElement getUser() {
		return user;
	}
	
	@FindBy(id="Password")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(xpath = "//div[@class='validation-summary-errors']")
	private WebElement errorLabel;
	
	public WebElement getEssrrorLabel() {
		return errorLabel;
	}
}
