package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass1 {
  @Test
  public void MyMethod1() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/login/");
	  Reporter.log("My Method 1 Is Running", true);
  }
}
