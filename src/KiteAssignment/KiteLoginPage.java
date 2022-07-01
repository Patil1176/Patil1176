package KiteAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KiteLoginPage {
  
	@FindBy(id = "userid")private WebElement UserID;
	@FindBy(id = "password")private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LoginButton;
	
	@FindBy(xpath = "//span[text()='User ID should be minimum 6 characters.']")private WebElement UserIDText;
	@FindBy(xpath = "//span[text()='Password should be minimum 6 characters.']")private WebElement PassText;
	
	public KiteLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public String UserID() {
	  
	  String ActualUserID = UserIDText.getText();
	  return ActualUserID;
  }
  
	public String Password() {
		
		
  		String ActualPassword = PassText.getText();
  		return ActualPassword;
  	}
	
	public void ClickOnLoginButton() {
		LoginButton.click();
	}
 
}
