package testNGListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListener.Listener.class)
public class MumbaiTest {
  @Test
  public void gateWayOfIndia() {
	  
	  Reporter.log("TC Is Running", true);
  }
  @Test
  
  public void Sanpada() {
	  
	  Assert.fail();
	  Reporter.log("TC Is Running", true);
  }
}
