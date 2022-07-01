package softAssertTest_NG;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsAndNotEquals {
  @Test
 public void MyMethod()
 {
	SoftAssert Soft = new SoftAssert();
	
	String a = "Pune";
	String b = "Pune";
	String c = "Mumbai";
	
	Soft.assertEquals(a, c, "TC is Failed Both Are Not Equals");
	
	Soft.assertNotEquals(a, c,"TC Is Pass Both Are Equals");
	Soft.assertAll();
 }
  
  @Test
  public void MyMethod1() {
	  
	  SoftAssert soft = new SoftAssert();
	  
	  boolean a = true;
	  boolean b = false;
	  
	  soft.assertTrue(a, "TC Is Failed Value Is False");
	  soft.assertAll();
  }
}
