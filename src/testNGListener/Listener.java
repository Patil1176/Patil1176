package testNGListener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteAppBaseClass.BaseClassUsingPropertyfile;

public class Listener implements ITestListener {
	
	BaseClassUsingPropertyfile T = new BaseClassUsingPropertyfile();
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		String TCName = result.getName();
		
		try {
			T.takeScreenShot(TCName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("TC Is Success",true);
		ITestListener.super.onTestSuccess(result);
		Reporter.log("TC Name Is "+result.getName(), true);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("TC Is Skipped", true);
		ITestListener.super.onTestSkipped(result);
		Reporter.log("TC Name Is "+result.getName(), true);
	}
}

