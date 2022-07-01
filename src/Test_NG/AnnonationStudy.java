package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnonationStudy {
  @Test
  public void MyTest() {
	  
	  Reporter.log("My Test Method Is Running", true);
  }
  @Test
  public void MyTest1()
  {
	  Reporter.log("My Test1 Method Is Runnng ", true);
  }
  @BeforeMethod
  public void login()
  {
	  Reporter.log("My Before Method Is Running", true);
  }
  
  @AfterMethod
  public void logout()
  {
	  Reporter.log("My After Method Is Running", true);
  }
  
  @BeforeClass
  public void UrlLanuched()
  {
	  Reporter.log("My Before CLass Is Running", true);
  }
  
  @AfterClass
  public void closeWebPage()
  {
	  Reporter.log("My After Class Is Running", true);
  }
  
}
