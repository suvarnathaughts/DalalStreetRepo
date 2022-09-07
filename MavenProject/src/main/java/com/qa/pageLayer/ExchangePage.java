package com.qa.pageLayer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class ExchangePage extends TestBase {
	
	
	
	public ExchangePage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	// Buy Tab
	
	@FindBy(xpath="//a[@class='active nav-link']")
	private WebElement BuyTab;
	
	public void clickOnBuyTab()
	{
		BuyTab.click();
	}
	
	// Share Quantity
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement Quantity;
	
	public void enterQuantity(int qty)
	{   
		Quantity.click(); 
		Quantity.sendKeys(String.valueOf(qty));
		
	}
	
	// Buy Button
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement BuyButton;
	
	public void clickOnBuyButton()
	{  
		BuyButton.click();
	}
		
	@FindBy(xpath="//div[text()='Low balance available']")
	private WebElement lowBalanceStatus;
	
	public String getOrderStatus()
	{
		String status = lowBalanceStatus.getText();
		
		return status;
		
		
		
	}
	// sale tab
	
	@FindBy(xpath="//a[contains(text(),'Sell')]")
	
	private WebElement sellTab;
	
	public void clickOnSellTab()
	{
		sellTab.click();
	}
	
	// sale Share quantity
	
	@FindBy(xpath="//input[@id='quantity']")
	private WebElement SellQuantity;
	
	public void enterSellQuantity(String qty)
	{   
		SellQuantity.click(); 
		SellQuantity.sendKeys(qty);
		
	}
 
     // sell button
	
	
	@FindBy(xpath="//button[contains(text(),'Sell')]")
	
	private WebElement sellButton;
	
	public void clickOnSellButton()
	{
		sellButton.click();
	}
	
	// order status
	
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement orderSuccessStatus;
	
	public String getSuccessOrderStatus()
	{
		String status = orderSuccessStatus.getText();
		
		return status;
		
		
		
	}
	
	// intraday 
	
	
	@FindBy(xpath="//label[text()='Intraday']")
	private WebElement intraDayButton;
	
	public void clickOnIntraDayButton()
	{
		intraDayButton.click();
		
	}
	
	// custom limit
	
	
	@FindBy(xpath="//label[text()='Custom Limit']")
	private WebElement customLimitButton;
	
	public void clickOnCustomLimitButton()
	{
		customLimitButton.click();
		
	}
	
	// price textBox
	
	@FindBy(xpath="(//input[@class='form-control'])[4]")
	private WebElement priceTextBox;
	
	public void enterInPriceBox(int price)
	{
		priceTextBox.click();
		priceTextBox.sendKeys(String.valueOf(price));
		
	}
	
	// limit order status
	
	
   @FindBy(xpath="//div[text()='Limit Order Created Successfully']")
   private WebElement limitOrderStatus;
   
   public String getLimitOrderStatus()
   {
	   String status = limitOrderStatus.getText();
	   return status;
	   
   }
}
