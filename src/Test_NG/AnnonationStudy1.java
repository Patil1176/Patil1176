package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnonationStudy1 {
  @Test
  public void MyTest3() {
	  Reporter.log("Test Method3 Is Running", true);
  }
  @Test
  public void MyTest4()
  {
	  Reporter.log("My Test Method4 Is Running", true);
  }
  
  @BeforeMethod
  public void login()
  {
	  Reporter.log("My Before Method Is Running ", true);
  }
  @AfterMethod
  public void logout()
  {
	  Reporter.log("My After Method Is Running", true);
  }
  @BeforeClass
  public void UrlLanchued()
  {
	  Reporter.log("Before Class Is Running", true);
  }
  @AfterClass
  public void closeWebPage()
  {
	  Reporter.log("After Class Is Running", true);
  }
}
