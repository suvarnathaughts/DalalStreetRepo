package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class BuyShareIntraDayCustomLimit extends TestBase {
	@Test
	public void verifyBuyShareIntraDayCustomLimit() throws InterruptedException
	{   Thread.sleep(20000);
		dash.enterCompanyName("hdfc");
		Thread.sleep(2000);
		dash.clickOnCompanyName();
		Thread.sleep(2000);
		exch.clickOnIntraDayButton();
		exch.clickOnCustomLimitButton();
		Thread.sleep(2000);
		exch.enterQuantity(5);
		Thread.sleep(2000);
		exch.enterInPriceBox(456);
		Thread.sleep(2000);
		exch.clickOnBuyButton();
		Thread.sleep(5000);
		String ExpectedStatus = exch.getLimitOrderStatus();
		String Actualstatus = "Limit Order Created Successfully";
		Assert.assertEquals(Actualstatus, ExpectedStatus);
  }

}
