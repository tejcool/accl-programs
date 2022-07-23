package selniumAsngWebManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.SeleniumUtility;

public class SeleniumAsgnVtiger {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1= new SeleniumUtility();
		WebDriver driver= s1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		WebElement loginB = driver.findElement(By.cssSelector(".button.buttonBlue"));
		wait.until(ExpectedConditions.elementToBeClickable(loginB)).click();
		
		driver.findElement(By.xpath("//*[@id='appnavigator']/div")).click();
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("MARKETING_modules_dropdownMenu")).click();          //marketing
		driver.findElement(By.xpath("//a[@title='Contacts']/span[2]")).click();         //contacts
		driver.findElement(By.xpath("//button[@type='button']/div")).click();
		
		driver.findElement(By.id("s2id_autogen1")).click();
		driver.findElement(By.xpath("//div[text()='Mr.']")).click();
		
		
		WebElement name=driver.findElement(By.cssSelector("input[name='firstname']"));
		name.click();
		name.sendKeys("tejas",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("sananse",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("8596958770",Keys.TAB);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.cssSelector("p[title='All']>a")).click();
		
		List<WebElement> verify=driver.findElements(By.cssSelector(".overflow-y>tr>td:nth-child(2)"));
		for(int i=0;i<verify.size();i++) {
			WebElement g=verify.get(i);
			String get=g.getText();
			if(get.equalsIgnoreCase("tejas")) {
				System.out.println("Yes, it has been created");
				driver.findElement(By.className("listViewEntriesCheckBox")).click();
				
			}else {
				System.out.println("No, it is not created");
			}break;
		}
		
		
		
		
		
		

	}

}
