package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFreameSample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(500);
		
		
		driver.switchTo().frame("iframe-name");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
		Thread.sleep(500);
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
	}

}
