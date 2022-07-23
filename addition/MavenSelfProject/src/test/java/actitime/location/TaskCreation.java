package actitime.location;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class TaskCreation extends SeleniumUtility {
	WebDriver driver;
	public TaskCreation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="container_tasks")
	private WebElement tasksoption;
	
	@FindBy(css=".title.ellipsis")
	private WebElement addnewButton;
	
	@FindBy(css=".item.createNewTasks")
	private WebElement newTaskOption;

	@FindBy(css=".selectCustomerRow>td div:nth-of-type(3)")
	private WebElement newCustomer;
	
	@FindBy(xpath="//div[text()='- New Customer -']")   //  //div[div[text()='- New Customer -']]/div
	private WebElement newCustomerOption;
	
	@FindBy(xpath="//td[input[@placeholder='Enter Customer Name']]/input")
	private WebElement  companyName;
	
	@FindBy(xpath="//td[input[@placeholder='Enter Project Name']]/input")
	private WebElement projectName;
	
	@FindBy(css=".nameCell.first>input")
	private WebElement passTesting;
	
	@FindBy(xpath="//td[@class='billingTypeCell']/div[2]")
	private WebElement typeOfWork;
	
	@FindBy(xpath="//td[5]/div/div/div/div/div/div[11]")
	private WebElement selectTesting;
	
	
	
	@FindBy(xpath="//div[text()='Create Tasks']")
	private WebElement createTaskButton;
	
	@FindBy(xpath="//tr[td[div[@class='taskRowCellWrapper']]]/td[2]/div/div")
	private WebElement checkForTesting;
	
	@FindBy(id="logoutLink")
	private WebElement logoutbutton;
	

	public void getTaskCreation(String company, String project, String field ) throws InterruptedException {
		clickOnElement(tasksoption);
		clickOnElement(addnewButton);
		clickOnElement(newTaskOption);
		Thread.sleep(2000);
		clickOnElement(newCustomer);
		
//		for(int i=0;i<newCustomerOption.size();i++) {
//			WebElement select1=newCustomerOption.get(i);
//			String textoption1=select1.getText();
//			if(textoption1.equalsIgnoreCase("- New Customer -")) {
//				clickOnElement(select1);
//				break;}
//		}
		
		clickOnElement(newCustomerOption);
		clickOnElement(companyName);
		typeInput(companyName, company);
		clickOnElement(projectName);
		typeInput(projectName, project);
		clickOnElement(passTesting);
		typeInput(passTesting, field);
		clickOnElement(typeOfWork);
		clickOnElement(selectTesting);
		clickOnElement(createTaskButton);
	}
	public boolean check_taskCreated() {
		return isElementExist(checkForTesting);
	
	}
	public void logout() {
		clickOnElement(logoutbutton);
	}
}
