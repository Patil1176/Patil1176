package exalReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingSample6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File Myfile = new File("D:\\selenium\\5_March.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		
		Cell cell = MySheet.getRow(1).getCell(3);
		CellType Type = cell.getCellType();
		
		if(Type == Type.STRING)
		{
			System.out.println(cell.getStringCellValue());
			
		}
		else if(Type == Type.NUMERIC)
		{
			System.out.println(cell.getNumericCellValue());
		}
		else if(Type == Type.BOOLEAN)
		{
			System.out.println(cell.getBooleanCellValue());
			
		}
		
		
		
	}

}
