package webEle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(200);
		
		WebElement Button = driver.findElement(By.id("checkBoxOption1"));
		Thread.sleep(400);
		
		boolean result = Button.isSelected();
		System.out.println("Result is "+result);
		
//		if(Button.isSelected())
//		{
//			System.out.println("CheckBox is Alredy selected");
//		}
//		else
//		{
//			
//			System.out.println("Selecting Checkbox Now");
//			Button.click();
//			
//			if(Button.isSelected())
//			{
//				System.out.println("CheckBox is now selecting");
//			}
//			else
//			{
//				System.out.println("Failed to select CheckBox");
//			}
//		}
//		
}
	}
