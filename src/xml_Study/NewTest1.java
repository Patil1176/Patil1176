package xml_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test(groups = "Regression")
  public void MyMethod6() {
	  Reporter.log("My Method 6 Is Running", true);
  }
  
  @Test
  public void MyMethod7() {
	  Reporter.log("My Method 7 Is Running", true);
  }
  
  public void MyMethod8() {
	  Reporter.log("My Method 8 Is Running", true);
  }
  
  @Test(groups = "Sanity")
  public void MyMethod9() {
	  Reporter.log("My Method 9 Is Running", true);
  }
  
  @Test
  public void MyMethod10() {
	  Reporter.log("My Method 10 Is Running", true);
  }
}
