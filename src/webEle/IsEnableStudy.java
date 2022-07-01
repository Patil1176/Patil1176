package webEle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//h6[@class='styles-heading-E_ZblLp7 styles-headingSix-2pSP1QRI styles-signIn-3Bqg9V-a'])[1]")).click();
		Thread.sleep(400);
		
		
		WebElement OTPButton = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(200);
		
		boolean result = OTPButton.isEnabled();
		System.out.println("This Result is "+result);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("1234567890");
		Thread.sleep(200);
		
		boolean result1 = OTPButton.isEnabled();
		System.out.println("This Result Is "+result1);
		
		
		
		
	}

}
