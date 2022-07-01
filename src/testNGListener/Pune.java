package testNGListener;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListener.Listener.class)
public class Pune {
  @Test
  public void swarGate() {
	  
	  Reporter.log("TC Is Running ", true);
  }
  @Test
  public void shivajiNagr() {
	  Reporter.log("TC Is Running ", true);
  }
}
