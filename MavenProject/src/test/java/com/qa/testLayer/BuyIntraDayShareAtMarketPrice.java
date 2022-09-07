package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class BuyIntraDayShareAtMarketPrice extends TestBase {
	@Test
	public void verifyBuyIntraDayShareAtMarketPrice() throws InterruptedException
	{
		
		Thread.sleep(10000);
		dash.enterCompanyName("axis");
		
		Thread.sleep(20000);
		dash.clickOnCompanyName();
		
		Thread.sleep(10000);
		exch.clickOnIntraDayButton();
		exch.enterQuantity(5);
		
		
		Thread.sleep(10000);
		
	    exch.clickOnBuyButton();
	}
	

	
	
	

}
