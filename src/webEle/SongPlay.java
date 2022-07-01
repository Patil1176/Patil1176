package webEle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SongPlay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(400);
		
		WebElement search = driver.findElement(By.name("search_query"));
		Thread.sleep(500);
		search.click();
		search.sendKeys("Aye Khuda Song");
		Thread.sleep(500);
		
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//yt-formatted-string[text()='Aye Khuda [Full Song] Paathshaala']")).click();
		//text.click();
		
		
		

		             
	}

}
