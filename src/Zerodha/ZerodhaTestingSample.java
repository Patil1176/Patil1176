package Zerodha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaTestingSample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement Username = driver.findElement(By.id("userid"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement Loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		Username.sendKeys("ELR321");
		Password.sendKeys("Dhana1111");
		Loginbutton.click();
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement Continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		Continuebutton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement Userid = driver.findElement(By.xpath("//span[text()='ELR321']"));
		
		String actualuserid = Userid.getText();
		
		String expecteduserid = "ELR321";
		
		if(actualuserid.equals(expecteduserid))
		{
			System.out.println("User id match TC is pass");
		}
		else
		{
			System.out.println("User id not match TC is faild");
		}
		
		Userid.click();
		
		WebElement Logoutbutton = driver.findElement(By.xpath("//a[@target='_self']"));
		Logoutbutton.click();
		Thread.sleep(1000);
		driver.close();
		
		
		
		
		
		
		
		
	}

}
