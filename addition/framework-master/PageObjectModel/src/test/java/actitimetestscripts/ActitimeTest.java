package actitimetestscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages.ActitimeLoginPage;
import webpages.CreateTaskActiPage;

public class ActitimeTest extends SeleniumUtility {
	WebDriver driver = null;
	ActitimeLoginPage page = null;
	CreateTaskActiPage creatTaskPage = null;

	@BeforeTest
	public void loginIntoActitime() {

		driver = setUp("chrome", "https://demo.actitime.com/login.do");
		page = new ActitimeLoginPage(driver);

		page.login("admin", "manager");

	}

	@Test
	public void getPageTitle() {

		System.out.println(getCurrentTitleOfApplication());

	}

	@Test
	public void createTaskActiTime() {
		creatTaskPage = new CreateTaskActiPage(driver);
		creatTaskPage.creatTask();

	}

	@Test
	public void deleteTaskActiTime() {
		creatTaskPage.deleteTask();

	}

	@AfterTest
	public void closure() {

		cleanUp();

	}
}