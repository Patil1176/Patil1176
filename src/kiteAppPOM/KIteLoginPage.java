package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KIteLoginPage {
	
	@FindBy(id = "userid")private WebElement UserID;
	@FindBy(id = "password")private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LoginButton;
	

	public KIteLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void UserID(String UID) {
		
		UserID.sendKeys(UID);
	}
	public void Password(String PASS) {
		
		Password.sendKeys(PASS);
	}
	
	public void ClickOnLoginButton() {
		
		LoginButton.click();
	}
}
