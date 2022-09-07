package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.LogInPage;
import com.qa.testBase.TestBase;

public class LogInTest extends TestBase {
	
	@Test
	public void verifyLogIn() throws InterruptedException
	{
		LogInPage login = new LogInPage();
		
		login.enterEmailAddress("bhamaresuvarna24@gmail.com");
		Thread.sleep(2000);
		login.enterPassword("lohitdeore23");
		login.clickOnLogInButton();
		
	}

}
