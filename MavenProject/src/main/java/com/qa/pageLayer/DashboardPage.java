package   com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class DashboardPage extends TestBase {
	
	
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// search box
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	
	private WebElement search_box;
	
	
	public void enterCompanyName(String company)
	{
		search_box.sendKeys(company);
		
	}
	
	//company name generic xpath
	
	//@FindBy(xpath="(//div[@class='m-2 card-title'])[2]")
	
	@FindBy(xpath="//div[@class='d-none d-lg-block']/div/div/div/div")
	
	private WebElement companyName;
	
	public void clickOnCompanyName()
	{
		companyName.click();
		
	}
	
	
	
	
	
	

}
