package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	
	@FindBy(id = "pin")private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")private WebElement ContinueButton;
	
	public KitePinPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void PinPage(String Pin) {
		PIN.sendKeys(Pin);
	}
	public void ClickOnContinueButton() {
		
		ContinueButton.click();
	}
}