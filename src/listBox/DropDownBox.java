package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(2000);
		
//		WebElement Day = driver.findElement(By.name("birthday_day"));
//		
//		Select s = new Select(Day);
//		
//		s.selectByVisibleText("2");
//		s.selectByIndex(2);
//		s.selectByValue("4");
		
		WebElement month = driver.findElement(By.id("month"));
		//Thread.sleep(1500);
		Select s1 = new Select(month);
		
		s1.selectByVisibleText("Mar");
		s1.selectByIndex(3);
		s1.selectByValue("5");
		
//		for(int i=0; i<=11; i++)
//		{
//			Thread.sleep(200);
//			s.selectByIndex(i);
//		}
//		
//		for(int i=11; i>=0; i--)
//		{
//			Thread.sleep(200);
//			s.selectByIndex(i);
//		}
		
		for(int i=0; i<=11; i++)
		{
			Thread.sleep(200);
			s1.selectByIndex(i);
		}
		for(int i=11; i>=0; i--)
		{
			Thread.sleep(200);
			s1.selectByIndex(i);
			
		}
		
	}
	
	

}
