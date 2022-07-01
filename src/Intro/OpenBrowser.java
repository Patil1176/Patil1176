package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		//driver.get("https://vctcpune.com/");
//		driver.get("https://www.facebook.com/");
//		//driver.close();
//		//driver.quit();
//		
//		driver.manage().window().maximize();
//		driver.manage().window().minimize();
		
//		driver.get("https://vctcpune.com/");
//		Thread.sleep(100);
//		driver.navigate().to("https://www.google.com/");
//		Thread.sleep(200);
//		driver.navigate().back();
//		Thread.sleep(300);
//		driver.navigate().forward();
//		Thread.sleep(400);
//		driver.navigate().refresh();
		
		//Get Title;
		
		driver.get("https://vctcpune.com/");
		//System.out.println(driver.getTitle());
		String Title = driver.getTitle();
		System.out.println("Title is "+Title);
		
		
		
		
		
	}

}
