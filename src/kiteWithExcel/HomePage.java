package kiteWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//span[text()='ELR321']") private WebElement UserName;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogoutButton;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateUName(String expectedUserID)
	{
		String actualUName = UserName.getText();
		String expectedUName = expectedUserID;
		
		if(actualUName.equals(expectedUName))
		{
			System.out.println("User ID is Match TC is pass");
		}
		else
		{
			System.out.println("User ID is not match TC is Failed");
		}
	}
	

	public void uName()
	{
		UserName.click();
	}
	public void logButton()
	{
		LogoutButton.click();
	}
}
