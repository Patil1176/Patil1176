package Varification_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EqualsNotEqualsAssert {
  @Test
  public void MyMethod() {
	  
	  String m = "Velocity";
	  String n = "Velocity";
	  String p = "Pune";
	  
//	  Assert.assertNotEquals(n, m, "String Is Matching TC Is Failed");
//	  Reporter.log("String Is Match TC Is True", true);
	  
	  Assert.assertEquals(n, p,"String Is Not Match TC Is Failed");
	  Reporter.log("String Is Match TC Is Pass", true);
  }
}
