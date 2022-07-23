package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Example6 {
	@Test
	public void testCase8() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 20);
	    WebElement str=driver.findElement(By.className("className"));
	    wait.until(ExpectedConditions.elementToBeClickable(str));
		displayDetails();
		
		System.out.println("Hello, I am TC8 from example6 class");
	}

	@Test
	public void testCase7() {
		System.out.println("Hello, I am TC7 from example6 class");
		displayDetails();
	}
	
	void displayDetails() {
		System.out.println("I am display method of Example6 class");
	}
	
    
}
