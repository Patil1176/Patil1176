package kiteAppTextClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import KiteAppBaseClass.BaseClassUsingPropertyfile;
import kiteAppPOM.KIteHomePage;
import kiteAppPOM.KIteLoginPage;
import kiteAppPOM.KitePinPage;
import kiteAppUtility.UtilityUsingPropertyFile;

@Listeners(testNGListener.Listener.class)

public class KiteUsingPropertyFIleVArification extends BaseClassUsingPropertyfile {
	
	KIteHomePage Home;
	KIteLoginPage Login;
	KitePinPage Pin;
	WebDriver driver;
	
	@BeforeClass
	public void LaunchedBrowser() throws IOException {
		
		OpenBrowser();
		
		Home = new KIteHomePage(driver);
		Login = new KIteLoginPage(driver);
		Pin = new KitePinPage(driver);
	
	}

	@BeforeMethod
	public void LoginApp() throws IOException {
		
		Login.UserID(UtilityUsingPropertyFile.readDataFromProperty("Un"));
		Login.Password(UtilityUsingPropertyFile.readDataFromProperty("PWd"));
		Login.ClickOnLoginButton();
		
		UtilityUsingPropertyFile.implicitWait(driver,1000);
		
		Pin.PinPage(UtilityUsingPropertyFile.readDataFromProperty("PIn"));
		Pin.ClickOnContinueButton();
		
	}
	
	@Test
  public void VarifyTheUN() throws IOException {
		
		String ActualUserID = Home.actualuserID();
		String ExpectedUserID = UtilityUsingPropertyFile.readDataFromProperty("UN");
		
		Assert.assertEquals(ActualUserID, ExpectedUserID,"TC Is Failed UN Is Nor Matching");
		Reporter.log("TC Is Passed UN Is Matching", true);
		
		UtilityUsingPropertyFile.implicitWait(driver, 500);
		
//		UtilityUsingPropertyFile.takeScreenshot(driver);
  }
	
	@AfterMethod
	public void logoutKiteApp() throws InterruptedException {
		
		Home.LogoutText();
	}
	
	@AfterClass
	public void closeTheBrowser() {
		
		driver.close();
	}
}
