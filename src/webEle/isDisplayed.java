package webEle;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		Thread.sleep(500);
		
		//WebElement TextBox = driver.findElement(By.id("displayed-text"));
		
//		boolean result = TextBox.isDisplayed();
//		System.out.println("Result is "+result);
//		TextBox.sendKeys("Hi GM");
//		
//		driver.findElement(By.id("hide-textbox")).click();
//		boolean result1 = TextBox.isDisplayed();
//		System.out.println("Result is "+result1);
		
	//	driver.findElement(By.linkText("Services")).click();
//		
//		if(TextBox.isDisplayed())
//		{
//			System.out.println("TextBox is Displayed");
//		}
//		else
//		{
//			System.out.println("TextBox Is Not Displayed");
//			driver.findElement(By.id("show-textbox")).click();
//			
//			if(TextBox.isDisplayed())
//			{
//				System.err.println("TextBox is now displayed");
//			}
//			else
//			{
//				System.out.println("Faild to is Displayed element");
//			}
//		}
	}

}
