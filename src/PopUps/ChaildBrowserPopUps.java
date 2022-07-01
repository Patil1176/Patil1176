package PopUps;



import java.util.ArrayList;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChaildBrowserPopUps {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(200);
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(500);
		
		String IdOfMainPage = driver.getWindowHandle();
		System.out.println("This is Main Page ID"+IdOfMainPage);
		
		Set<String> AllID = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<>(AllID);
		
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		
		//String mainpageid = al.get(0);
		String ChildBrowserID = al.get(1);
		
		driver.switchTo().window(ChildBrowserID);//switch to selenium focus to child page.
		Thread.sleep(500);
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.id("the7-search")).sendKeys("Slenium");
		Thread.sleep(500);
		
		
		
		
		
	}

}
