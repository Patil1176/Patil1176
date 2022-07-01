package Zerodha;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaTestingSample2 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File Myfile = new File("D:\\selenium\\5_March.xlsx");
		Sheet Sheet = WorkbookFactory.create(Myfile).getSheet("Sheet3");
		
		String ID = Sheet.getRow(1).getCell(0).getStringCellValue();
		String pass = Sheet.getRow(1).getCell(1).getStringCellValue();
		String Pin = Sheet.getRow(1).getCell(2).getStringCellValue();
		
		WebElement Username = driver.findElement(By.id("userid"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement Loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		Username.sendKeys(ID);
		Password.sendKeys(pass);
		Loginbutton.click();
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement Continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys(Pin);
		Continuebutton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement Userid = driver.findElement(By.xpath("//span[text()='ELR321']"));
		
		String actualuserid = Userid.getText();
		
		String expecteduserid = ID;
		
		if(actualuserid.equals(expecteduserid))
		{
			System.out.println("User id match TC is pass");
		}
		else
		{
			System.out.println("User id not match TC is faild");
		}
		
		Userid.click();
		
		WebElement Logoutbutton = driver.findElement(By.xpath("//a[@target='_self']"));
		Logoutbutton.click();
		Thread.sleep(1000);
		driver.close();
		
		
	}

	}


