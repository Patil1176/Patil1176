package exalReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingSample3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File MyFile = new File("D:\\selenium\\5_March.xlsx");
		Sheet Book = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
//		for(int i=8; i<=11; i++)
//		{
//			String value = Book.getRow(8).getCell(i).getStringCellValue();
//			System.out.println(value);
//		}
		
		int lastrownum = Book.getLastRowNum();
		int TotalRowCount = lastrownum;
		
		int lastCellNum = Book.getRow(8).getLastCellNum();
		int TotalCellCount = lastCellNum-1;
		
		System.out.println(TotalRowCount);
		System.out.println(TotalCellCount);
		
		for(int i=8; i<=TotalCellCount; i++)
		{
			String value = Book.getRow(8).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
		
	
	}

}
