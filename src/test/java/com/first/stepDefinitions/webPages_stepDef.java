package com.first.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;


public class webPages_stepDef {

	  @Given("^User navigates to \"([^\"]*)\"$")
	    public void user_navigates_to_something(String url) throws Throwable {

		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  driver.get(url);
		  Thread.sleep(5000);
		  driver.quit();
		  Assert.assertTrue("time pass asser", false);
	    }
}
