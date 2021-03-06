package kiteWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {
	
	//1.Data Members And Variables
	
	@FindBy(id = "pin")private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")private WebElement ContinueButton;
	
	//2.Initialize Constructor
	
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3.Initialize The Method
	
	public void pin(String Enterpin)
	{
		PIN.sendKeys(Enterpin);
	}
	public void ConBoutton()
	{
		ContinueButton.click();
	}
	
	
}
