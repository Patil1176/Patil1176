package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass2 {
  @Test
public void MyMethod2() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://paytm.com/");
	  Reporter.log("My Method 2 Is Running", true);
  }
}
