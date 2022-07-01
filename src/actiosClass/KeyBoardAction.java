package actiosClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		WebElement textBox = driver.findElement(By.id("email"));
		
		//By Webelements Method
		//textBox.sendKeys("Velocity");
		
		Actions act = new Actions(driver);
		
		//act.sendKeys(textBox,"Pune").perform();
		
		act.keyDown(textBox,Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("une").build().perform();
		
	}

}
