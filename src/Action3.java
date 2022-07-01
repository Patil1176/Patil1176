import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dis = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		//1st way
//		act.dragAndDrop(src, dis).perform();
		
		//2nd way
		act.clickAndHold(src).moveToElement(dis).release().build().perform();
	}
}
