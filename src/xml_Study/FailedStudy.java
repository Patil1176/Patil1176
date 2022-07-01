package xml_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedStudy {
  
	// I Want 1 3 5, I dont Want 2 4 
	
	@Test
  public void MyMethod1() {
		Assert.fail();
	  Reporter.log("My Method 1 Is Running", true);
  }
  
  @Test
  public void MyMethod2() {
	  Reporter.log("My Method 2 Is Running", true);
  }
  
  @Test
  public void MyMethod3() {
	  Assert.fail();
	  Reporter.log("My Method 3 Is Running", true);
  }
  
  @Test
  public void MyMethod4() {
	  Reporter.log("My Method 4 Is Running ", true);
  }
  
  @Test
  public void MyMethod5()
  {
	  Assert.fail();
	  Reporter.log("My Method 5 Is Running", true);
  }
}
