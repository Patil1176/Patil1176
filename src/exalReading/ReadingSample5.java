package exalReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingSample5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File MyFile = new File("D:\\selenium\\5_March.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
		int lastrownum = MySheet.getLastRowNum();
		int TotalRowNum = lastrownum;
		
		int lastcellnum = MySheet.getRow(8).getLastCellNum();
		int TotalCellNum = lastcellnum-1;
		
		System.out.println(TotalRowNum);
		System.out.println(TotalCellNum);
		
		for(int i=8; i<=TotalRowNum; i++)
		{
			for(int j=8; j<=TotalCellNum; j++)
			{
				String value = MySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");
			}
			
			System.out.println();
		}
	}

}
