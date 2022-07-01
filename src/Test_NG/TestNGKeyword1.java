package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeyword1 {
  @Test
  public void MyTest1() {
	  
	  Reporter.log("My Test 1 Method Is Running", true);
  }
  
  @Test( priority = -1, timeOut = 100, dependsOnMethods = "MyTest1")
  public void MyTest2()
  {
	  Reporter.log("My Test 2 Method Is Running", true);
  }
  
  @Test
  public void MyTest3()
  {
	  Reporter.log("My Test 3 Method Is Runnning", true);
  }
}
