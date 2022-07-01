package kiteAppUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityClass {
	
	
	public static String readDataFromeExcel(int a, int b) throws EncryptedDocumentException, IOException {
		
		File MyFile = new File("D:\\selenium\\5_March.xlsx");
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		String MyValue = MySheet.getRow(a).getCell(b).getStringCellValue();
		return MyValue;
	}
	
	public static void takeScreenShot(WebDriver driver) throws IOException {
		
		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(3);
		File Des = new File("D:\\ScreenShot\\"+random+".png");
		FileHandler.copy(Src, Des);
		
	}
}
