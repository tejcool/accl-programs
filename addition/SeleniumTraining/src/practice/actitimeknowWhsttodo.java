package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class actitimeknowWhsttodo {

	public static void main(String[] args) throws InterruptedException {
		
	 SeleniumUtility s1=new SeleniumUtility();
	 WebDriver driver= s1.setUp("chrome", "https://demo.actitime.com/login.do");

	driver.findElement(By.cssSelector(".textFieldsTable>tbody>tr>td>input")).sendKeys("admin");
	driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	driver.findElement(By.id("container_tasks")).click();
	System.out.println(driver.getTitle());
	driver.findElement(By.cssSelector(".title.ellipsis")).click();
	driver.findElement(By.cssSelector(".item.createNewTasks")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#closeCreateTasksPopupButton"));
	driver.findElement(By.cssSelector("#createTasksPopup_content>div>div>div>div>div>table>tbody>tr>td>div>div>div>div.dropdownButton")).click();
	List<WebElement> options1=driver.findElements(By.cssSelector(".innerContent>div>div>table>tbody>tr>td>div>div>div.scrollableDropdownView>div>div>div>div"));
	System.out.println("first box elemnts size= "+options1.size());
	for(int i=0;i<options1.size();i++) {
		WebElement select1=options1.get(i);
		String textoption1=select1.getText();
		if(textoption1.equalsIgnoreCase("- New Customer -")) {
			select1.click();
	break;	}

	}
	}

}
