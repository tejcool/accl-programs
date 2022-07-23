package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class CreateTaskActiPage extends SeleniumUtility {
	WebDriver driver;

	public CreateTaskActiPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "container_tasks")
	private WebElement task;

	@FindBy(css = ".addNewButton")
	private WebElement addNew;

	@FindBy(css = ".item.createNewTasks")
	private WebElement newTasks;

	@FindBy(css = ".customerSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>.components_combobox.cpCombobox>.comboboxButton>:nth-of-type(3)")
	private WebElement selectCustomerDropdown;

	@FindBy(css = ".customerSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>.components_combobox.cpCombobox>.scrollableDropdownView>.scrollableContainer >.contentWrapper >.searchItemList>.itemRow:nth-of-type(1)")
	private WebElement newCustomer;

	@FindBy(css = ".newCustomer.newCustomerProjectField.inputFieldWithPlaceholder")
	private WebElement newCustomerName;

	@FindBy(css = ".newProject.newCustomerProjectField.inputFieldWithPlaceholder")
	private WebElement projectName;

	@FindBy(css = "tbody>tr:nth-of-type(1)>td.nameCell.first>.inputFieldWithPlaceholder:nth-of-type(1)")
	private WebElement taskName;

	@FindBy(css = "tr:nth-of-type(1)>td.billingTypeCell>.typeOfWorkButton.editable")
	private WebElement typeOfWork;

	@FindBy(css = "tr:nth-of-type(1)>td.billingTypeCell>div>div>div>div>.typeOfWorkList>.typeOfWorkRow:nth-of-type(11)")
	private WebElement typeOfWorkList;

	@FindBy(css = ".commitButtonPlaceHolder>.components_button.withPlusIcon>.components_button_label")
	private WebElement createTaskButton;

	@FindBy(css = ".namesContainer>.title")
	private WebElement createdTask;

	@FindBy(css = ".titleEditButtonContainer>.editButton")
	private WebElement editTask;

	@FindBy(css = ".actionButtonWrapper.pressed>.actionButton")
	private WebElement actionButton;

	@FindBy(xpath = "//body[1]/div[18]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[3]/div[1]")
	private WebElement deleteButton;

	@FindBy(xpath = "//body[1]/div[18]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")
	private WebElement deletePermanantly;

	public WebElement getTask() {
		return task;
	}

	public void setTask(WebElement task) {
		this.task = task;
	}

	public WebElement getAddNew() {
		return addNew;
	}

	public WebElement getNewTasks() {
		return newTasks;
	}

	public WebElement getSelectCustomerDropdown() {
		return selectCustomerDropdown;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getNewCustomerName() {
		return newCustomerName;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getTaskName() {
		return taskName;
	}

	public WebElement getTypeOfWork() {
		return typeOfWork;
	}

	public WebElement getTypeOfWorkList() {
		return typeOfWorkList;
	}

	public WebElement getCreatedTask() {
		return createdTask;
	}

	public WebElement getEditTask() {
		return editTask;
	}

	public WebElement getActionButton() {
		return actionButton;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getDeletePermanantly() {
		return deletePermanantly;
	}

	public void creatTask() {
		clickOnElement(task);
		clickOnElement(addNew);
		clickOnElement(newTasks);
		clickOnElement(selectCustomerDropdown);
	
		clickOnElement(newCustomer);
		typeInput(newCustomerName, "furu");
		typeInput(projectName, "QA-Automation");
		typeInput(taskName, "Task Creation");
		clickOnElement(typeOfWork);
		clickOnElement(typeOfWorkList);
		clickOnElement(createTaskButton);

	}

	public void deleteTask() {
		clickOnElement(editTask);
		clickOnElement(actionButton);
		clickOnElement(deleteButton);
		clickOnElement(deletePermanantly);
	}

}
