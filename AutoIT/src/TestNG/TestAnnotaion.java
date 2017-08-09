package TestNG;


import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PageClasses.Test1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAnnotaion 
	{
	public WebDriver driver;
	public String baseUrl="http://www.citruspay.com/";
	ExtentReports report;
	ExtentTest test;
	
	@BeforeClass
	public void beforeClass(){
		report=new ExtentReports("//Users//ankurmarkanda//Desktop//citrusPay.html");
		test= report.startTest("Verify Welcome Test");
	}
	
  @BeforeMethod
  @Parameters({"browser"})
  public void testSetup(String browser)
  		{
		
	  if (browser.equalsIgnoreCase("firefox"))
	  	{
		  System.setProperty("webdriver.gecko.driver", "/Users/ankurmarkanda/Documents/Selenium WebDriver/geckodriver");
		  driver = new FirefoxDriver();
		  driver.get(baseUrl);  
	  	}
	  else if(browser.equalsIgnoreCase("chrome"))
	  	{
		  System.setProperty("webdriver.chrome.driver", "/Users/ankurmarkanda/Documents/Selenium WebDriver/chromedriver");
		  driver = new ChromeDriver();
		  driver.get(baseUrl);
	  	}
	  test.log(LogStatus.INFO, "BrowserStarted");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
  		}
  
	
  @Test(dataProvider="credentials",dataProviderClass=testData.class)
  
  public void loginToApplication(String loginid,String password) 
  		{ 
	    
	  Test1 login=new Test1(driver);	  
	  login.clickLoginLink();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  login.enterCredentials(loginid,password);
	  login.clickSubmitButton();
	  
	  test.log(LogStatus.PASS, "Test Case Passed");
  		}
  
	
  
  @Test(dataProvider="credentials",dataProviderClass=testData.class)
  
  public void invalidLoginValidation(String loginid,String password) 
  	{ 
	  
	 	  
	  Test1 login=new Test1(driver);
	  login.clickLoginLink();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  login.enterCredentials(loginid, password);
	  login.clickSubmitButton();
	  login.validateErrorMessage();
	  test.log(LogStatus.PASS, "Test Case Passed");
  	}
  
  @AfterMethod
  public void afterMeathod()
  {
	  
	  driver.quit();
	  report.endTest(test);
	  report.flush();
	  
  }
  
  
  
  
  
  
  
}
