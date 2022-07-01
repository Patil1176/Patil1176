package kiteAppUtility;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class UtilityUsingPropertyFile {
	
//	public static void takeScreenshot(WebDriver driver) throws IOException {
//		
//		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String Random = RandomString.make(3);
//		
//		File Des = new File("D:\\ScreenShot\\"+Random+".png");
//		FileHandler.copy(Src, Des);
//	}
	
	public static String readDataFromProperty(String Key) throws IOException {
		
		Properties Obj = new Properties();
		
		FileInputStream myprop = new FileInputStream("C:\\Users\\patil\\eclipse-workspace\\Selenium_5March\\myProperties.properties");
		
		Obj.load(myprop);
		String value = Obj.getProperty(Key);
		
		return value;
	}
	
	public static void implicitWait(WebDriver driver, int timeunit)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeunit));
	}
	
}
