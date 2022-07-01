package xmlTestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void MyMethod() {
	  Reporter.log("My Method Is Running", true);
  }
  
  @Test
  public void MyTest1()
  {
	 Reporter.log("My Method 1 Is Running ", true);
  }
  
  @Test
  public void MyTest2()
  {
	  Reporter.log("My Method 2 Is Running", true);
  }
  
  @Test
  public void MyTest3()
  {
	  Reporter.log("My Method 3 Is Running", true);
  }
  
  @Test
  public void MyTest4()
  {
	  Reporter.log("My Method 4 Is Running", true);
  }
  
  @Test
  public void MyTest5()
  {
	  Reporter.log("My Method 5 Is Running", true);
  }
}
