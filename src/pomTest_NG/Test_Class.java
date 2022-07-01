package pomTest_NG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class {
	
	KiteLoginPage login;
	Pin_Page pin;
	Home_Page home;
	WebDriver driver;
	Sheet mySheet;
	
	
	@BeforeClass
	public void LauchedURL() throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/#loggedout");
		
		Reporter.log("Launching URL",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		File MyFile = new File("D:\\selenium\\5_March.xlsx");
		mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
	}
	
	@BeforeMethod
	public void LoginButton() {
		
		login = new KiteLoginPage(driver);
		login.Username(mySheet.getRow(1).getCell(0).getStringCellValue());
		Reporter.log("Sending UserID", true);
		login.Password(mySheet.getRow(1).getCell(1).getStringCellValue());
		Reporter.log("Sending Password", true);
		
		login.loginbutton();
		Reporter.log("Click on LoginButton", true);
		
		pin = new Pin_Page(driver);
		pin.Pin(mySheet.getRow(1).getCell(2).getStringCellValue());
		Reporter.log("Sending PIN", true);
		
		pin.ConButton();
		Reporter.log("Click On Continue Button", true);
				
		
	}
	
  @Test
  public void VerifyUserID() {
	 
	  home = new Home_Page(driver);
	  String ExpectedUserID = mySheet.getRow(1).getCell(0).getStringCellValue();
	  String ActualUserID = home.acrualuserid();
	  Reporter.log("Validating UserID", true);
	  
	  Assert.assertEquals(ActualUserID, ExpectedUserID, "UserID Is Not Match TC Is Failed");
	  Reporter.log("UserID Is Match TC Is Passed", true);
	  
  }
  @AfterMethod
  public void LogoutButton() throws InterruptedException {
	  
	  home.Logoutbutton();
	  Reporter.log("Click On Logout Button ", true);
	  
  }
  @AfterClass()
  public void CloseBrowser() {
	  
	  driver.close();
	  Reporter.log("Browser Is close", true);
	  
  }
}
