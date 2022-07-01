package KiteAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPagePassWrong {
	
	
	@FindBy(id = "userid")private WebElement UserID;
	@FindBy(id = "password")private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LoginButton;
	
	@FindBy(xpath = "//span[text()='User ID should be minimum 6 characters.']")private WebElement UserIDText;
	@FindBy(xpath = "//span[text()='Password should be minimum 6 characters.']")private WebElement PassText;
	@FindBy(xpath = "//p[@class='error text-center']")private WebElement InvalidText;
	
	
	public KiteLoginPagePassWrong(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public void UserID2(String UID) {
		
		UserID.sendKeys(UID);
		
	}
	public String Password2() {
		Password.sendKeys("Dhana1112");
		
		String ActualInvalidText = InvalidText.getText();
		return ActualInvalidText;
		
	}
	public void ClickonLoginButton2() {
		
		LoginButton.click();
	}
}
