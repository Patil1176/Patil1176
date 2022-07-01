package Varification_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Varification {
  @Test
  public void MyMethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  WebElement CheckBox1 = driver.findElement(By.id("checkBoxOption1"));
	  Thread.sleep(500);
	  CheckBox1.click();
	  
//	  if(CheckBox1.isSelected())
//	  {
//		  Reporter.log("CheckBox Is selected TC is Pass", true);
//	  }
//	  else
//	  {
//		  Reporter.log("CheckBox is not selected TC is failed ", true);
//	  }
	  
	  Assert.assertTrue(CheckBox1.isSelected(),"CheckBox1 Is Not Selected TC Is Failed");
	  Reporter.log("CheckBox1 Is Selected TC Is Passed", true);
  }
}
