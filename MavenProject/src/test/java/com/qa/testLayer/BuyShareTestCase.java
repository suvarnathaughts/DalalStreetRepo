package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class BuyShareTestCase extends TestBase {     //Buy share without having enough balance in account
	
	@Parameters({"company","Quantity"})
	@Test
	public void verifyBuyScenarion(String company, int Quantity) throws InterruptedException
	{   
		Thread.sleep(20000);
		dash.enterCompanyName(company);
		dash.clickOnCompanyName();
		Thread.sleep(20000);
		exch.clickOnBuyTab();
		
		exch.enterQuantity(Quantity);
		Thread.sleep(20000);
		exch.clickOnBuyButton();
		String ExpectedStatus= "Low balance available";
		Thread.sleep(2000);
		String actualStatus = exch.getOrderStatus();
		System.out.println(actualStatus);
		
		Assert.assertEquals(actualStatus, ExpectedStatus);
		
		
		
}
	
}
