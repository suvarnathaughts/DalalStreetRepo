package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LogInPage extends TestBase {
	
	public LogInPage()
	{
		PageFactory.initElements(driver, this);
	}
	// email
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_address;
	
	public void enterEmailAddress(String email)
	
	{    email_address.clear();
		 email_address.sendKeys( email);
	}
	
	//password
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	public void enterPassword(String pass)
	{   password.clear();
		password.sendKeys( pass);
	}
	
	//loginButton
	
	
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")
	private WebElement logIn_button;
	
	public void clickOnLogInButton()
	{
		logIn_button.click();
	}


}
