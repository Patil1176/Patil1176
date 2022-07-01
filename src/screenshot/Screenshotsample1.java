package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshotsample1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
//		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		File Distinction = new File("D:\\ScreenShot\\MyScreenshot1.png");
//		FileHandler.copy(Source, Distinction);
		
		File Source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(3);
		
		File Distinction1 = new File("D:\\ScreenShot\\IsScreenShot"+random+".png");
		FileHandler.copy(Source1, Distinction1);
	}

}
