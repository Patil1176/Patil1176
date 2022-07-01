package pomTest_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin_Page {
	
	//Data And Variable Should be decleare in globally
	
	@FindBy(id = "pin")private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")private WebElement ConButton;
	
	//Initialize the constructor
	
	public Pin_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Initialize The Method 
	
	public void Pin(String Pin)
	{
		PIN.sendKeys(Pin);
	}
	public void ConButton()
	{
		ConButton.click();
	}
	
	

}
