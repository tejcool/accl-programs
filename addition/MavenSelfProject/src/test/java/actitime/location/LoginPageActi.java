package actitime.location;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class LoginPageActi extends SeleniumUtility {
	WebDriver driver;
	
	public LoginPageActi(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css=".textFieldsTable>tbody>tr>td>input")
	private WebElement username;
	
	@FindBy(css=".textField.pwdfield")
	private WebElement pwd;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	public void logintoActiTime(String userid, String password ) {
		typeInput(username, userid);
		typeInput(pwd, password);
		clickOnElement(loginbutton);
	}
	
	
}
