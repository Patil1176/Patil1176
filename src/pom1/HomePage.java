package pom1;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//1.Datamember
	
	@FindBy(xpath = "//span[text()='ELR321']")private WebElement userID;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logoutButton;
	
	//2.Constructor
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	//3.Method
	
	public void ValidateUserID()
	{
		String actualUserID = userID.getText();
		String ExpectedUserID = "ELR321";
		
		if(actualUserID.equals(ExpectedUserID))
		{
			System.out.println("User ID is Match TC is pass ");
		}
		
		else
		{
			System.out.println("User ID is NOT Match Text Case is Failed");
		}
	}
	
	public void ClickOnUserID() throws InterruptedException
	{
		userID.click();
		Thread.sleep(500);
	}
	public void ClickOnLogoutButton()
	{
		logoutButton.click();
	
	}
	
	
}
