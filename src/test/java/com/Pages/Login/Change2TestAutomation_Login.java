package com.Pages.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Change2TestAutomation_Login {
	WebDriver driver;

	public Change2TestAutomation_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="username")
	WebElement userNameTextBox;

	@FindBy(id="password")
	WebElement passwordTextBox;

	@FindBy(xpath= "//a[@Class='login_url']")
	WebElement logInonHomePage; 

	@FindBy(xpath= "//button[@type='submit']")
	WebElement logInButton; 

	@FindBy(xpath= "(//*[text()='Login'])[3]")
	WebElement rememberMeCheckBox;

	@FindBy(xpath = "//div[@class='learnpress']")
	WebElement SuccessMessage;

	@FindBy(linkText= "Lost your password?")
	WebElement foregotPassword;

	public void findUserNameTextBox(String userNameOrEmail) {
		userNameTextBox.sendKeys(userNameOrEmail);
	}

	public void findPasswordTextBox(String password) {
		passwordTextBox.sendKeys(password);
	}

	public boolean findRememberMeCheckBox() {
		return rememberMeCheckBox.isSelected();
	}

	public void findforegotPassword() {
		foregotPassword.click();
	}

	public void findlogInButtononHomePage() {
		logInonHomePage.click();
	}

	public void findlogInButton() {
		logInButton.click();
	}

	public String getSuccessMesage() {
		return SuccessMessage.getText();
	}
}
