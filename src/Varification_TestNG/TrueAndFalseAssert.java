package Varification_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TrueAndFalseAssert {
  @Test
  public void MyMethod() {
	  
	  boolean a = true;
	  boolean b = false;
	  
//	  Assert.assertTrue(a, "Value Is False TC Is Failed");
//	  Reporter.log("Assert Is True TC Is Passed", true);
	  
	  Assert.assertFalse(b, "Value Is True TC Is Failed");
	  Reporter.log("Value Is False TC Is Passed", true);
  }
}
