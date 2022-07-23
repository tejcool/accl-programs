package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.SeleniumUtility;

public class ActitmeLoginFunt extends  SeleniumUtility {

	WebDriver driver;
	 @Given("^User is in the Actitime login page$")
	    public void user_is_in_the_actitime_login_page() throws Throwable {
	       driver=setUp("chrome", "https://demo.actitime.com/login.do");
	    }

	    @When("^User enters username$")
	    public void user_enters_username() throws Throwable {
	        driver.findElement(By.name("username")).sendKeys("admin");
	    }

	    @And("^enters password$")
	    public void enters_password() throws Throwable {
	        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
	    }

	    @And("^click on login button$")
	    public void click_on_login_button() throws Throwable {
	        driver.findElement(By.id("loginButton")).click();
	    }
	    @Then("^validate user is on home page$")
	    public void validate_user_is_on_home_page() throws Throwable {
	       Thread.sleep(2000);
	    	Assert.assertEquals(getCurrentTitleOfApplication(), "actiTIME - Enter Time-Track");
	    }
	    @And("^close the browser$")
	    public void close_the_browser() throws Throwable {
	        cleanUp();
	    }

	}
