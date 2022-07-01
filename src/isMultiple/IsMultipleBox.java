package isMultiple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(200);
//		
//		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
//		Thread.sleep(2000);
//		
//		WebElement Day = driver.findElement(By.id("day"));
//		Thread.sleep(1000);
//		
//		Select s = new Select(Day);
//		
//		boolean result = s.isMultiple();
//		System.out.println("Result Is"+result);
		
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement DropDownBox = driver.findElement(By.id("cars"));
		Thread.sleep(500);
		
		Select s1 = new Select(DropDownBox);
		
		boolean result1 = s1.isMultiple();
		
		System.out.println(result1);
//		
//		s1.selectByIndex(0);
//		Thread.sleep(200);
//		s1.selectByIndex(1);
//		Thread.sleep(200);
//		s1.selectByIndex(2);
//		Thread.sleep(200);
//		s1.selectByIndex(3);
//		Thread.sleep(500);
//		
//		s1.deselectAll();
		
		s1.selectByVisibleText("Volvo");
		Thread.sleep(200);
		s1.selectByVisibleText("Saab");
		Thread.sleep(200);
		s1.selectByVisibleText("Opel");
		Thread.sleep(500);
		
		//s1.deselectByVisibleText("Volvo");
		
		System.out.println(s1.getFirstSelectedOption().getText());
		
//		WebElement FirstWebElement = s1.getFirstSelectedOption();
//		 String myText = FirstWebElement.getText();
//		 System.out.println("1 Selected Option"+myText);
//		 Thread.sleep(1000);
		 
//		 System.out.println(s1.getAllSelectedOptions().size());
		 
		 for(int i=0; i<=s1.getAllSelectedOptions().size(); i++)
		 {
			 System.out.println(s1.getAllSelectedOptions().get(i).getText());
		 }
		
		
	}

}
