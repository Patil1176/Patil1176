package KiteAppBaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import kiteAppUtility.UtilityUsingPropertyFile;


public class BaseClassUsingPropertyfile {
	
	protected static WebDriver driver;
	
	public void OpenBrowser() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(UtilityUsingPropertyFile.readDataFromProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	public void takeScreenShot(String TCName) throws IOException {
		
		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//String Random = RandomString.make(3);
		
		File Des = new File("D:\\ScreenShot"+TCName+".png");
		FileHandler.copy(Src, Des);
	}
}
