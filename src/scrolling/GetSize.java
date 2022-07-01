package scrolling;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		System.out.println(driver.manage().window().getSize());
		
		Dimension d = new Dimension(1000,20);//use dimension class create the object of dimension class
		
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(500);
		
		Dimension d1 = new Dimension(300,500);
		
		driver.manage().window().setSize(d1);
		System.out.println(driver.manage().window().getSize());
	}

}
