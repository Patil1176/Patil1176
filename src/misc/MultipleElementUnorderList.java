package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementUnorderList {

	private static final String Ima = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement text = driver.findElement(By.name("q"));
		text.sendKeys("honda");
	
		List<WebElement> SearchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(WebElement Search:SearchResult)
		{
			System.out.println(Search.getText());
		}
		
		String expectedResult = "honda amaze";
		for(WebElement result:SearchResult)
		{
			String actualResult = result.getText();
			
			if(actualResult.equals(expectedResult))
			{
				result.click();
				break;
			}
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.linkText("Images")).click();
	//	driver.findElement(By.partialLinkText(Ima)).click();
		
		
	}

}
