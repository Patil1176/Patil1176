package testNGListener;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListener.Listener.class)

public class MyTestClassLIstener {
  
	@Test
  public void MyTest() {
		Assert.fail();
		Reporter.log("Hi GM", true);
  }
	
	@Test(dependsOnMethods = "MyTest")
	public void MyMethod() {
		Reporter.log("Hi GoodAfternoon", true);
	}
}
