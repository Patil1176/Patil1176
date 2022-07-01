package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableReadSample1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		WebElement text = driver.findElement(By.xpath("(//td[text()='Velocity Trainers'])[1]"));
		System.out.println(text.getText());
		
		List<WebElement> tableheader = driver.findElements(By.xpath("//table//th"));
		
		for(WebElement th:tableheader)
		{
			System.out.print(th.getText()+"||");
		}
		
		System.out.println();
		
		List<WebElement> row3 = driver.findElements(By.xpath("//table//tr[3]"));
		for(WebElement r:row3)
		{
			System.out.print("||"+r.getText()+" ||");
		}
		
	}

}
