package Varification_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VarificationSample {
  @Test
  public void MyMethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	  Thread.sleep(500);
	  
	  Assert.assertTrue(LoginButton.isEnabled(), "LoginButton Is Not Enable TC Is Failed");
	  Reporter.log("LoginButton Is Displyed TC Is Passed", true);
	  
	  
  }
}
