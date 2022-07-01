package KiteAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 {

	@FindBy(id = "userid")private WebElement UserID;
	@FindBy(id = "password")private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LoginButton;
	
	@FindBy(xpath = "//span[text()='User ID should be minimum 6 characters.']")private WebElement UserIDText;
	@FindBy(xpath = "//span[text()='Password should be minimum 6 characters.']")private WebElement PassText;

	public KiteLoginPage1(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void UserID(String UID) {
		
		UserID.sendKeys(UID);
		
	}
	public String Password() {
		
		//Password.submit();
		
		Password.submit();
		
		String ActualUserID = PassText.getText();
		return ActualUserID; 
	}
	public void ClickOnLoginButton() {
		
		LoginButton.click();
		
	}
}