package actitime.location;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class DeleteTask extends SeleniumUtility {
	WebDriver driver;
	public DeleteTask(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(id="container_tasks")
	private WebElement taskButton;
	
	@FindBy(xpath="//div[div[text()='Libra Texas']]/div")
	private WebElement libraTexasSelect;
	
	@FindBy(xpath="//tr[td[div[@class='taskRowCellWrapper']]]/td[2]/div/div")
	private List<WebElement> checkOption;
	
	@FindBy(xpath="//tr[td[div[@class='taskRowCellWrapper']]]/td[1]/div")
	private WebElement checkbox;
	
	@FindBy(css="[class='delete button']")
	private WebElement deleteButton;
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement deletePermanant;
	
	@FindBy(id="container_tasks")
	private WebElement taskoption1;
	
	@FindBy(xpath="//div[div[text()='Libra Texas']]/div")
	private WebElement libraTexasFind;
	

	public void deleteCreatedTask() {
		clickOnElement(taskButton);
		//clickOnElement(libraTexasSelect);
		
		for(int i=0;i<checkOption.size();i++) {
			WebElement select1=checkOption.get(i);
			String textoption1=select1.getText();
			if(textoption1.equalsIgnoreCase("testing")) {
				clickOnElement(select1);
				break;}
		}
		//clickOnElement(checkOption);
		clickOnElement(checkbox);
		clickOnElement(deleteButton);
		clickOnElement(deletePermanant);
	
	}
	public void checkDeleted() {
		clickOnElement(taskoption1);
		isElementExist(libraTexasFind);
	}
}