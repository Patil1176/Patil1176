package kiteWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	//1.Data Member and Variable 
	
	@FindBy(id = "userid")private WebElement unID;
	@FindBy(id = "password")private WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	
	//2.Initialize the constructor
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3.Initialize the Method
	
	public void userName(String userID)
	{
		unID.sendKeys(userID);	
	}
	
	public void password(String pass)
	{
		pwd.sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
}
