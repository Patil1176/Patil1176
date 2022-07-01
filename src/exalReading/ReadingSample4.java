package exalReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingSample4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myFile = new File("D:\\selenium\\5_March.xlsx");
		Sheet MySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		int lastrownum = MySheet.getLastRowNum();
		int TotalRowNum = lastrownum;
		
		int lastcellnum = MySheet.getRow(8).getLastCellNum();
		int TotalCellNum = lastcellnum-1;
		
		System.out.println(TotalRowNum);
		System.out.println(TotalCellNum);
		
		for(int i=8; i<=TotalRowNum; i++)
		{
			String Value = MySheet.getRow(i).getCell(10).getStringCellValue();
			System.out.println(Value);
		}
		
	}

}
