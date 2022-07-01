package Test_NG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeyword {
//  @Test(invocationCount = 5)
//  public void myTest() {
//	  Reporter.log("myTest Method Is Running", true);
//  }

//	@Test(priority = -2)
//	public void TestD()
//	{
//		Reporter.log("My Test Method D Is Running", true);
//	}
//	
//	@Test(priority = 1)
//	public void TestB()
//	{
//		Reporter.log("My Test Method B Is Running", true);
//	}
//	
//	@Test(priority = 0)
//	public void TestA()
//	{
//		Reporter.log("My Test Method A Is Running", true);
//	}
//	@Test(priority = 1)
//	public void TestC()
//	{
//		Reporter.log("My Test Method C Is Running", true);
//	}
	
//	@Test
//	public void MyTest1()
//	{
//		Reporter.log("My Test 1 Method Is Running", true);
//	}
//	
//	@Test(enabled = false)
//	public void MyTest2()
//	{
//		Reporter.log("My Test 2 Method Is Running", true);
//	}
//	
//	@Test(enabled = true)
//	public void MyTest3()
//	{
//		Reporter.log("My Test 3 Method Is Running", true);
//	}
//	
//	@Test
//	public void MyTest4()
//	{
//		Reporter.log("My Test 4 Method IS Running", true);
//	}
	
//	@Test
//	public void MyTest()
//	{
//		Reporter.log("My Test Method Is Running", true);
//	}
//	
//	@Test (timeOut = 1000)
//	public void MyTest1() throws InterruptedException
//	{
//		Reporter.log("My Test 1 Method Is Running", true);
//		Thread.sleep(1200);
//	}
	
	@Test
	public void TestD()
	{
		Reporter.log("My Test D Method Is Running", true);
		Assert.fail();
	}
	
	@Test (dependsOnMethods = "TestD")
	public void TestC()
	{
		Reporter.log("My Test C Method Is Running",true);
	}
	
	@Test
	public void TestB()
	{
		Reporter.log("My Test B Method Is Running", true);
	}
	
	@Test
	public void TestA()
	{
		Reporter.log("My Test A Method Is Running", true);
	}
	
}