package KiteAppBaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteAppUtility.UtilityUsingPropertyFile;

public class BaseClasses {
	
	protected WebDriver driver;
	
	public void OpenBrowser() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(UtilityUsingPropertyFile.readDataFromProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
}
