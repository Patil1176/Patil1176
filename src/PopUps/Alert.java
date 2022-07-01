package PopUps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(200);
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(500);
		
		org.openqa.selenium.Alert alt = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(alt.getText());
		Thread.sleep(500);
		
		alt.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(500);
		
		 org.openqa.selenium.Alert alt1 = driver.switchTo().alert();
		 Thread.sleep(10000);
		 alt1.accept();
		
	}

}
