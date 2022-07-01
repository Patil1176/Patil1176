package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@value='Radio4']")).click();
		
		//driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and ')]"));
		
	}

}
