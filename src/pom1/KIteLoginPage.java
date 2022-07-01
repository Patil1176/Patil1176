package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KIteLoginPage {
	
		//1. data type & element
	
		@FindBy (id = "userid") private WebElement UN;
		@FindBy (id = "password") private WebElement PWD;
		@FindBy (xpath = "//button[@type='submit']") private WebElement LoginButton;
		
		//2. Constructor
		
		public KIteLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//3.Method
		
		public void sendusername() 
		{
			UN.sendKeys("ELR321");
		}
		
		public void sendpassword() 
		{
			PWD.sendKeys("Dhana1111");
		}
		
		public void clickbutton() 
		{
			LoginButton.click();
		}

}
