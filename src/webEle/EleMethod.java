package webEle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EleMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(100);
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Patil");
		//Thread.sleep(200);
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
		//Thread.sleep(300);
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.id("email")).clear();
		
		WebElement Element1 = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with')]"));
		System.out.println(Element1.getText());
		String actualText = Element1.getText();
		
		
		String expectedtext = "Facebook helps you connect and share with the people in your life.";
		
		if(actualText.equals(expectedtext))
		{
			System.out.println("Text Case is matching and TC is pass");
		}
		else
		{
			System.out.println("Text Case is not matching and TC is not pass");
		}
		
		
		
	}

}
