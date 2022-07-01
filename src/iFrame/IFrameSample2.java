package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameSample2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
//		driver.switchTo().frame("google_esf");
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	}

}
