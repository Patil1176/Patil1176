package exalReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingSample2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File MyFile = new File("D:\\selenium\\5_March.xlsx");
		
		Workbook Book = WorkbookFactory.create(MyFile);
		Sheet sheet = Book.getSheet("Sheet1");
		Row row = sheet.getRow(8);
		Cell cell = row.getCell(8);
		CellType type = cell.getCellType();
		System.out.println(type);
		
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		
		
	}

}
