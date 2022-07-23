package actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actitime.location.DeleteTask;
import actitime.location.LoginPageActi;
import actitime.location.TaskCreation;
import utilities.SeleniumUtility;

public class actiTimeScript extends SeleniumUtility {
	WebDriver driver;
	LoginPageActi logintoActiTime;
	TaskCreation  getTaskCreation;
	TaskCreation check_taskCreated;
	DeleteTask deleteCreatedTask;
	//CheckForTask checkDeleted;
	DeleteTask checkDeleted;
	
	
	@BeforeTest
	public void startTest() throws InterruptedException {
		driver=setUp("chrome", "https://demo.actitime.com/login.do");
//		logintoActiTime=new LoginPageActi(driver);
//		logintoActiTime.logintoActiTime("admin", "manager");
		}
	
	@BeforeMethod
	public void loginstarttest() {
		logintoActiTime=new LoginPageActi(driver);
		logintoActiTime.logintoActiTime("admin", "manager");
	}
	
	@Test(priority=1)
	public void taskpage() throws InterruptedException {
		//Thread.sleep(4000);
		//Assert.assertEquals(getCurrentTitleOfApplication(), "actiTIME -  Enter Time-Track", "No. its not the same page");
		getTaskCreation=new TaskCreation(driver);
		getTaskCreation.getTaskCreation("Libra Texas", "Global Revolution", "Testing");
		check_taskCreated=new TaskCreation(driver);
		
	}
	
	@Test(priority=2)
	public void deleteTask() {
		deleteCreatedTask = new DeleteTask(driver);
		deleteCreatedTask.deleteCreatedTask();
	}
	
	@Test(priority=3)
		public void checkIfDeleted() {
		checkDeleted = new DeleteTask(driver);	
		checkDeleted.checkDeleted();
	}
	
	@AfterMethod
	public void logout() {
		getTaskCreation.logout();
	}
	
	@AfterTest
	public void closeBrowser() {
		cleanUp();
	}
	
}