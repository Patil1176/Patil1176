package pomTest_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	//Data And Variable Should Be Declere In Globally
	
	@FindBy(id = "userid")private WebElement UID;
	@FindBy(id = "password")private WebElement Pass;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LoginButton;
	
	//Initialize The Constructor
	
	public  KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Initialize The Method
	
	public void Username(String UserID)
	{
		UID.sendKeys(UserID);
	}
	
	public void Password(String PASS)
	{
		Pass.sendKeys(PASS);
	}
	
	public void loginbutton()
	{
		LoginButton.click();
	}
}
