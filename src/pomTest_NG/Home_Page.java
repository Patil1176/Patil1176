package pomTest_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	//Data and Variable should be declare in globally
	
	@FindBy(xpath = "//span[text()='ELR321']")private WebElement UserID;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogoutButton;
	
	//initialize the constructor
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//initialize the method
	
	public String acrualuserid()
	{
		String ActualUserID = UserID.getText();
		return ActualUserID;
	}
	
	public void Logoutbutton() throws InterruptedException
	{
		UserID.click();
		Thread.sleep(500);
		LogoutButton.click();
	}
}
