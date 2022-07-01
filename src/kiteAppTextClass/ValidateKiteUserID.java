package kiteAppTextClass;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppBaseClass.BaseClasses;
import kiteAppPOM.KIteHomePage;
import kiteAppPOM.KIteLoginPage;
import kiteAppPOM.KitePinPage;
import kiteAppUtility.UtilityClass;
import kiteAppUtility.UtilityUsingPropertyFile;

public class ValidateKiteUserID extends BaseClasses {
	
	KIteLoginPage Login;
	KitePinPage Pin;
	KIteHomePage Home;
	
	@BeforeClass
	public void LanuchedBrowser() throws IOException {
		
		OpenBrowser();
		
		Login = new KIteLoginPage(driver);
		Pin = new KitePinPage(driver);
		Home = new KIteHomePage(driver);
			
	}
	
	@BeforeMethod
	public void LoginPage() throws EncryptedDocumentException, IOException {
		
		Login.UserID(UtilityClass.readDataFromeExcel(1, 0));
		Login.Password(UtilityClass.readDataFromeExcel(1, 1));
		Login.ClickOnLoginButton();
		
		UtilityUsingPropertyFile.implicitWait(driver, 1000);
		
		Pin.PinPage(UtilityClass.readDataFromeExcel(1, 2));
		Pin.ClickOnContinueButton();
		
	}

	@Test
	public void ValidateUserID() throws EncryptedDocumentException, IOException {
	
	String ActualUserID = Home.actualuserID();
	String ExpectedUserID = UtilityClass.readDataFromeExcel(1, 0);
	
	Assert.assertEquals(ActualUserID,ExpectedUserID,"TC Is Failed UserID Is Not Match" );
	Reporter.log("TC Is Passed User ID Is Match", true);
	
	UtilityClass.takeScreenShot(driver);
	}
	
	@AfterMethod
	public void logoutKiteApplication() throws InterruptedException {
		
		Home.LogoutText();
	}
	@AfterClass
	public void CloseBrowser() {
		
		driver.close();
		
	}

}
