package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableReadSample2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		int TotalNoOfRows = rows.size();
		System.out.println("Total No Of Rows Are "+TotalNoOfRows);
		
		for(WebElement r:rows)
		{
			System.out.print("||"+r.getText()+" ||");
			System.out.println();
		}
		
		List<WebElement> coulmns= driver.findElements(By.xpath("//th"));
		int TotalNoOfCoulmns = coulmns.size();
		System.out.println("Total No Of Coulmn Are "+TotalNoOfCoulmns);
		
		for(WebElement c:coulmns)
		{
			System.out.print(c.getText()+" ||");
			//System.out.println();
		}
	}

}
