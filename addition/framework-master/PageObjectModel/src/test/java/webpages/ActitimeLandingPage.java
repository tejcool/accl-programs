package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActitimeLandingPage extends SeleniumUtility {
	WebDriver driver;
	ActitimeLandingPage (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id="container_tasks")
	private WebElement task;
	
	@FindBy(id="logoutLink")
	private WebElement logoutButton;


	


}
