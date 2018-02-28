package SeleniumFramework.Maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class testClass {
	WebDriver driver;
	whatFixPage page;
	String baseUrl="https://whatfix.com/quickolabs.com/#!flows/how-to-import-google-analytics-solution-of-whatfix/8174f470-9df9-11e3-8178-386077c653fe/";
  @Test
  public void f() {
	  
	  page.whatFixAssignment();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  String driverPath=System.getProperty("user.dir")+"/drivers/chromedriver";
	  System.setProperty("webdriver.chrome.driver",driverPath);
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  page = new whatFixPage(driver);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
