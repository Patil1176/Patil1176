package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingSample1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		
		j.executeScript("window.scrollBy(200,900)");
		Thread.sleep(1000);
		
		j.executeScript("window.scrollBy(50,-200)");
		Thread.sleep(1000);
		
		j.executeScript("window.scrollBy(-200,800)");
		Thread.sleep(1000);
		
		j.executeScript("window.scrollBy(-90,-600)");
		
		
	}

}
