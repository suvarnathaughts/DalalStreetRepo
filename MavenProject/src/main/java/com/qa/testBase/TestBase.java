package com.qa.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.pageLayer.DashboardPage;
import com.qa.pageLayer.ExchangePage;
import com.qa.pageLayer.LogInPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Logger logger;
	public  DashboardPage dash;
	public ExchangePage exch;
		 @BeforeClass
	     public void start()
	     {
	    	logger =  Logger.getLogger("DalalStreet07May");
	    	PropertyConfigurator.configure("Log4j.properties");
	    	logger.info("Execution Started");
	     }
	     @AfterClass
	    public void stop()
	    {
	    	
	    	logger.info("Execution stopped");
	    }
	
	

		@Parameters("browser")
		@BeforeMethod
		public void setUp(String browser)
		
		{	
			//String br ="firefox";
			
			if(browser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("Firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase("Edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			else
			{
				System.out.println("Please provide correct browser name");
			}
			driver.get("https://www.apps.dalalstreet.ai/login");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			
			LogInPage login = new LogInPage();
			login.enterEmailAddress("bhamaresuvarna24@gmail.com");

			login.enterPassword("lohitdeore");
			login.clickOnLogInButton();
			
			dash = new DashboardPage();
			
			exch = new ExchangePage();
			
		}
		
		
		
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}

	}
