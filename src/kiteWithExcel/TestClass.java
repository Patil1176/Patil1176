package kiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File myFile = new File("D:\\selenium\\5_March.xlsx");
		Sheet Sheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		
		String UnName = Sheet.getRow(1).getCell(0).getStringCellValue();
		String PWD = Sheet.getRow(1).getCell(1).getStringCellValue();
		
		KiteLoginPage Login = new KiteLoginPage(driver);
		Login.userName(UnName);
		Login.password(PWD);
		Login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		String Pin = Sheet.getRow(1).getCell(2).getStringCellValue();
		
		PinPage Epin = new PinPage(driver);
		Epin.pin(Pin);
		Epin.ConBoutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		HomePage HPage = new HomePage(driver);
		
		HPage.validateUName(UnName);
		
		HPage.uName();
		HPage.logButton();
		Thread.sleep(1000);
		
		driver.close();
		
		
		
	}

}
