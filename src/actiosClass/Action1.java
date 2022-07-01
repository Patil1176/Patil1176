package actiosClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		//Move to the element using mouse action
		
		WebElement MyElement = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		act.moveToElement(MyElement).perform();
		
		//click using mouse action.
		
		WebElement testelement = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		
		//1st way
//		act.moveToElement(testelement).perform();
//		act.click().perform();
		
		//2nd way
//		act.moveToElement(testelement).click().build().perform();
		
		//3rd way
		act.click(testelement).perform();
		
//		act.moveToElement(testelement).contextClick().build().perform();
		act.contextClick(testelement).perform();
		
	}

}
