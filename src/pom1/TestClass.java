package pom1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KIteLoginPage login = new KIteLoginPage(driver);
		PinPage pin = new PinPage(driver);
		
		login.sendusername();
		login.sendpassword();
		login.clickbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendpin();
		pin.clickconbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		HomePage log = new HomePage(driver);
		
		log.ClickOnUserID();
		log.ClickOnLogoutButton();
		
		driver.close();
		
		
		
	}

}
