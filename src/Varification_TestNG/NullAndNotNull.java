package Varification_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NullAndNotNull {
  @Test
  public void MyMethod() {
	  
	  String a = null;
	  String b = "hi";
	  
//	  Assert.assertNull(a, "String Is Not Null TC Is Failed");
//	  Reporter.log("String Is Null TC Is Passed", true);
	  
	  Assert.assertNotNull(b,"String Is Null TC Is Failed");
	  Reporter.log("String Is Not Null TC Is Passed", true);
  }
}
