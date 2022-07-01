package KiteAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPageUserIDNotFilled {
	
	@FindBy(id = "userid")private WebElement UserID;
	@FindBy(id = "password")private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LoginButton;
	
	@FindBy(xpath = "//span[text()='User ID should be minimum 6 characters.']")private WebElement UserIDText;
	@FindBy(xpath = "//span[text()='Password should be minimum 6 characters.']")private WebElement PassText;
	
	
	public KiteLoginPageUserIDNotFilled(WebDriver driver) {
		PageFactory.initElements(driver,this);	
}


	public  String UserID1() {
		
		//UserID.submit();
		
		String ActualUserID = UserID.getText();
		return ActualUserID;
	}
	
	public void Password1(String Pass) {
		
		Password.sendKeys(Pass);
	}
	
	public void ClickOnLoginButton1() {
		LoginButton.click();
	}
}
