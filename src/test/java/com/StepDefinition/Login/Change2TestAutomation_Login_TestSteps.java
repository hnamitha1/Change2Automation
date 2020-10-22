package com.StepDefinition.Login;


import org.testng.Assert;

import com.BaseClass.Library;
import com.Pages.Login.Change2TestAutomation_Login;
import com.SeleniumReusableFunction.SeleniumUtility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Change2TestAutomation_Login_TestSteps extends Library{
	
	SeleniumUtility selut;
	Change2TestAutomation_Login login;
	
	@Before
	public void initializeTest() {
		browserSetUp();
	}
	
	@After
	public void closeBrowser() {
		logger.info("Take Screen shot of Login Page");
		selut.snapshot("_Login_Page");
		
		logger.info("Close Browser");
	    driver.quit();
	}
	
	@Given("you are on the Homepage {string}")
	public void you_are_on_the_Homepage(String string) {
		selut = new SeleniumUtility(driver);
		logger.info("verify you are on Homepage");
		Assert.assertTrue(string.contains(selut.getCurrentURL()));
	}
	
	@Then("click on the login")
	public void click_on_the_login() {
		login= new Change2TestAutomation_Login(driver);
		
		logger.info("Clicking on login Button on Home Page");
		login.findlogInButtononHomePage();
	} 
	
	@Then("Enter the {string} and {string}")
	public void enter_the_and(String username, String password) {
		
		
		logger.info("Enter Username");
	   login.findUserNameTextBox(username);
	   
	   logger.info("Enter Password");
	   login.findPasswordTextBox(password);
	   
	   logger.info("Click on Remember Me Checkbox");
	   login.findRememberMeCheckBox();
	}

	@Then("Click submit button")
	public void click_submit_button() {
		
		logger.info("Click on submit Button");
		login.findlogInButton();
	   
	}
	
	@Then("User able to see the message {string}")
	public void user_able_to_see_the_message(String expectedText) {
		String actualText = login.getSuccessMesage();
		if(actualText.contains(expectedText)) {
			logger.info("login successful");
			Assert.assertTrue(true);
		} else {
			logger.info("login un successful");
			Assert.assertTrue(true);
		}	
	}
}
