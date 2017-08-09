package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Test1 {
	
	WebDriver driver;
	
	@FindBy(id="consumerLink") WebElement loginLink;
	
	@FindBy(xpath=".//*[@id='txt_username']") WebElement userName;
	
	@FindBy(id="txt_password") WebElement passWord;
	
	@FindBy(id="login_submit") WebElement submitButton;
	
	@FindBy(id="login-error") WebElement errorMessage;
	
	public Test1(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLoginLink() {
		loginLink.click();
	}
	
	public void enterCredentials(String user_name,String pass_word) {
		userName.sendKeys(user_name);
		
		passWord.sendKeys(pass_word);
	}
	
	public void clickSubmitButton() {
		submitButton.click();
	}
	
	public void validateErrorMessage(){
		if(errorMessage.getText().equals("Invalid username or password."))
		{
			System.out.println("Correct Message");
		}
		else{
			System.out.println("Please Check Invalid Message");
		}
	}
}
