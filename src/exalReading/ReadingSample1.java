package exalReading;


import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadingSample1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myFile = new File("D:\\selenium\\5_March.xlsx");
		
		String name = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(5).getStringCellValue();
		System.out.print(name);
		
		String name1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(6).getStringCellValue();
		System.out.println(" "+name1);
		
		String name2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
		System.out.print(name2);
		
		String name3 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(6).getStringCellValue();
		System.out.println(" "+name3);
		
		double name4 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(5).getNumericCellValue();
		System.out.print(name4);
		
		double name5 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(6).getNumericCellValue();
		System.out.println(" "+name5);
		
		boolean num1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(4).getCell(5).getBooleanCellValue();
		System.out.print(num1);
		
		boolean num2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(4).getCell(6).getBooleanCellValue();
		System.out.println(" "+num2);
	}

}
