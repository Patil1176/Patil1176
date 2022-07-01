package KiteAssignment;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Kite_TestNGClass {
  
	KiteLoginPage Login;
	WebDriver driver;
	Sheet MySheet;
	KiteLoginPage1 Login1;
	Sheet MySheet1;
	KiteLoginPageUserIDNotFilled Login2;
	KiteLoginPagePassWrong Login3;
	
	@BeforeMethod
	public void LaunchingURL() throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File MyFile = new File("D:\\selenium\\5_March.xlsx");
		MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet4");
		MySheet1 = WorkbookFactory.create(MyFile).getSheet("Sheet3");
	}
	@Test
  public void LoginPage() throws InterruptedException {
		Login = new KiteLoginPage(driver);
		
		Login.ClickOnLoginButton();
		Thread.sleep(500);
		
		String ExpectedUserID = MySheet.getRow(1).getCell(0).getStringCellValue();
		String ActualUserID = Login.UserID();
		
		Assert.assertEquals(ExpectedUserID,ActualUserID,"Text Is Not Matching TC Is Failed" );
		Reporter.log("Text Is Matching TC Is Passed", true);	
		
		String ExpectedPassword = MySheet.getRow(1).getCell(1).getStringCellValue();
		String ActualPassword = Login.Password();
		
		Assert.assertEquals(ExpectedPassword,ActualPassword,"Text Is Not Matching TC Is Failed" );
		Reporter.log("Txet Is Matching TC Is Passed", true);
		
	}
	
	@Test
	public void LoginPage1() {
		
		 Login1 = new KiteLoginPage1(driver);
		 Login1.UserID(MySheet1.getRow(1).getCell(0).getStringCellValue());
		 
		 Login1.Password();
		 
		 String ExpectedText = MySheet.getRow(1).getCell(1).getStringCellValue();
		 String ActualUserID = Login1.Password();
		 
		 Assert.assertEquals(ExpectedText,ActualUserID,"Text Is Not Matching TC Is Failed");
		 Reporter.log("Text Is Matching TC Is Pass", true);
		
		 Login1.ClickOnLoginButton();
	}
	
//	@Test
//	public void LoginPage2() throws InterruptedException {
//		
//		Login2 = new KiteLoginPageUserIDNotFilled(driver);
//		
//		//Login2.UserID1();
//		
//		Login2.Password1(MySheet1.getRow(1).getCell(1).getStringCellValue());
//		Login2.ClickOnLoginButton1();
//		Thread.sleep(500);
//		
//		String ExpectedUserID = MySheet.getRow(1).getCell(0).getStringCellValue();
//		String ActualUserID = Login2.UserID1();
//		
//		Assert.assertEquals(ExpectedUserID,ActualUserID, "UserID Text Is Not Matching TC Is Failed");
//		Reporter.log("UserID Text Is Matching TC Is Passed", true);
//		
//		
//	}
	
	@Test
	public void LoginPage3() {
		Login3 = new KiteLoginPagePassWrong(driver);
		
		Login3.UserID2(MySheet1.getRow(1).getCell(0).getStringCellValue());
		
		Login3.Password2();
		
		Login3.ClickonLoginButton2();
		
//		String ActualInvalidText = Login3.Password2();
//		String ExpectedInvalidText = MySheet.getRow(1).getCell(2).getStringCellValue();
//		
//		Assert.assertEquals(ActualInvalidText,ExpectedInvalidText,"Text Is Not Matching TC Is Failed");
//		Reporter.log("Test Is Match TC Is Passed", true);
		
		
		
	}
	
	
}
