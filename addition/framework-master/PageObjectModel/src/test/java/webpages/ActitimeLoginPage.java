package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActitimeLoginPage extends SeleniumUtility {
	WebDriver driver;

	public ActitimeLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(name = "pwd")
	private WebElement pwd;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return pwd;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void login(String username, String passward) {
		typeInput(userName, username);
		typeInput(pwd, passward);
		clickOnElement(loginButton);
	}

}
