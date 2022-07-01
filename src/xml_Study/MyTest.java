package xml_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test(groups = "Sanity")
  public void MyMethod1() {
	  Reporter.log("My Method 1 Is Running", true);
  }
  
  @Test()
  public void MyMethod2() {
	  Reporter.log("My Method 2 Is Running", true);
  }
  
  @Test(groups = "Regression")
  public void MyMethod3() {
	  Reporter.log("My Method 3 Is Running", true);
  }
  
  @Test
  public void MyMethod4() {
	  Reporter.log("My Method 4 Is Running", true);
  }
  
  @Test(groups = "Regression")
  public void MyMethod5() {
	  Reporter.log("My Method 5 Is Running", true);
  }
}
