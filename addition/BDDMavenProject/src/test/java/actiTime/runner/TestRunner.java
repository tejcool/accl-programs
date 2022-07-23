package actiTime.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src\\test\\resources\\features\\ActiTimeLogin.feature"},
		glue     = {"stepdefinations"},
		plugin = {"html:target/cucumber-html-report"},// reporting
	    monochrome = true,
	    dryRun= true
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
