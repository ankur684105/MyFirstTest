package SeleniumFramework.Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class whatFixPage {

	WebDriver driver;
    @FindBy (id="_widget_wfx_") WebElement selfHelp;  
    @FindBy (xpath="//a[contains(text(),'embed')]") WebElement embedFlowsOption;
    @FindBy (xpath="//td[@class='WFWIOG']/input") WebElement search;
    @FindBy (xpath="//a[text()='embed']/../../td[2]") WebElement embedDropDown;
	@FindBy (xpath="//div[@class='gwt-PopupPanel']/div/div/div[1]") WebElement slideShow;
	@FindBy (xpath=".//*[@id='desktop']/div[5]/div/table/tbody/tr/td[3]/table/tbody/tr[1]/td/div/div/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a") WebElement startButton;
	@FindBy (xpath="//table[@class='WFMAAGB']/tbody/tr/td/a[text()='close']") WebElement closeButton;
	

	 public whatFixPage(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);

	    }
	public void whatFixAssignment() {
		
		try 
		{
		selfHelp.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", embedFlowsOption);
		//search.sendKeys("embed");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		executor.executeScript("arguments[0].click()", embedDropDown);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		executor.executeScript("arguments[0].click()", slideShow);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//executor.executeScript("arguments[0].click()", startButton);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		executor.executeScript("arguments[0].click()", closeButton);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
