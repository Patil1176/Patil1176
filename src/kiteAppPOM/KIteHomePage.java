package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KIteHomePage {
	
	@FindBy(xpath = "//span[text()='ELR321']")private WebElement UserID;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogoutText;
	
	public KIteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String actualuserID() {
		String ActualUserID = UserID.getText();
		return ActualUserID;
		
	}
	public void LogoutText() throws InterruptedException {
		UserID.click();
		Thread.sleep(500);
		LogoutText.click();
	}
}
