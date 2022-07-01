package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableReadSample3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		List<WebElement> Rows = driver.findElements(By.xpath("//tr"));
		List<WebElement> Coulmns = driver.findElements(By.xpath("//th"));
		
		int NoOfRows = Rows.size();
		int NoOfCoulmns = Coulmns.size();
		
		System.out.println("No Of Rows Are "+NoOfRows);
		System.out.println("No Of Coulmns Are "+NoOfCoulmns);
		
		for(int i=1; i<=NoOfRows; i++)
		{
			for(int j=1; j<=NoOfCoulmns; j++)
			{
				if(i==1)
				{
					String text = driver.findElement(By.xpath("//table//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(text+" ");
				}
				else
				{
					String text = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text+" ");
				}
				
			}
			System.out.println();
			
		}
	
		
	}

}
