package Varification_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ZerodhaVarification {
  @Test
  public void MyTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  WebElement TextFiled1 = driver.findElement(By.id("userid"));
	  Thread.sleep(500);
	  WebElement TextFiled2 = driver.findElement(By.id("password"));
	  Thread.sleep(500);
	  
	  TextFiled1.click();
	  TextFiled2.click();
	  
//	  Assert.assertTrue(TextFiled1.isDisplayed(),"TextFiled1 Is NotDisplyed TC Is Failed");
//	  Reporter.log("TextFiled1 Is Displyed TC Is Passed",true);
//	  Thread.sleep(500);
	  
	  Assert.assertTrue(TextFiled2.isDisplayed(), "TextFiled2 Is NotDiaplyed TC Is Failed");
	  Reporter.log("TextFiled2 Is Displyed TC Is Passed", true);
	  
  }
  
 
}
