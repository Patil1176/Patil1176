package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass3 {
  @Test
  public void MyMethod3()
  {
	 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://kite.zerodha.com/");
	 Reporter.log("My Method 3 Is Running", true);
  }
}
