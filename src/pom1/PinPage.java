package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {
	
	//1. data members/variables
	
	@FindBy (id = "pin")private WebElement PIN;
	@FindBy (xpath = "//button[@type='submit']")private WebElement ConButton;
	
	//2. constructor
	
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3. method
	
	public void sendpin() 
	{
		PIN.sendKeys("982278");
	}
	
	public void clickconbutton() 
	{
		ConButton.click();
	}
}
