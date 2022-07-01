package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotSample {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(200);
		
		 File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 String random = RandomString.make(4);
		 
		 File desFile = new File("D:\\ScreenShot\\myScreenshot"+random+".png");
				 FileHandler.copy(screen, desFile);
	}

}
