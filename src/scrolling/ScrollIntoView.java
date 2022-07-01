package scrolling;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		Thread.sleep(4000);
		
		WebElement Ref = driver.findElement(By.id("hide-textbox"));
		Thread.sleep(2000);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].ScrollIntoView(true);",Ref);
		Thread.sleep(2000);
		
		Ref.click();
		
		

	}

}
