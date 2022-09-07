package com.qa.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;


public class SellShareScenario extends TestBase{
	
	@Test(dataProvider="Data", dataProviderClass=ExcelDataProvider.class)
	public void VerifySellShareScenario(String company, String quantity) throws InterruptedException, IOException
	
	{ 	logger.info("We are on Exchange Page");	
		Thread.sleep(10000);
		logger.info("enter company name");
		dash.enterCompanyName(company);
		logger.info("company name entered successfully");
		dash.clickOnCompanyName();
		logger.info("click on company name we get after search");
		Thread.sleep(10000);
		logger.info("successfully company get selected");
		exch.clickOnSellTab();
		logger.info("clicked on Sell Tab sucessfully");
		Thread.sleep(10000);
		exch.enterSellQuantity(quantity);
		logger.info("sell quantity entered sucessfully");
		Thread.sleep(10000);
		exch.clickOnSellButton();
		logger.info("clicked on sellButton successfully");
		//Thread.sleep(10000);
//		String actualStatus = exch.getSuccessOrderStatus();
//		String expectedStatus = "Order Created successfully";
//	    Assert.assertEquals(actualStatus, expectedStatus);
	}
	
//	@DataProvider(name = "SellScenarioTestData")
//	public Object[][] Testdata()
//	{
//		Object [][] data = {{"wipro", 5},{"axis", 2}};
//		return data;
//	}


}
