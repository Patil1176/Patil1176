package Test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1_TestNG {
	@Test //this for method test case
	public void kiteLoginPage()
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
	}
	@Test
	public void facebook_page()
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void whatsup_page()
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://web.whatsapp.com/");
	}

}
