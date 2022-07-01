package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderList1 {

	private static final String Flights = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.name("q")).sendKeys("pune");
		
		List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		for(WebElement search:searchResult)
		{
			System.out.println(search.getText());
		}
		
		String expectedresult = "pune to goa flight";
		
		for(WebElement result:searchResult)
		{
			String actualResult = result.getText();
			
			if(actualResult.equals(expectedresult))
			{
				result.click();
				break;
			}
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.linkText("Flights")).click();
		
	}

}
