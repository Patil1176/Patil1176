package scrolling;


import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		System.out.println(driver.manage().window().getPosition());
		
		Point p = new Point(400,-200);//use to point class create the object of point class
		
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
	}

}
