package exalReading;

import java.io.File;
import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingSample7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File Myfile = new File("D:\\selenium\\5_March.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		
		int Totalrowcount = MySheet.getLastRowNum();
		int Totalcellcount = MySheet.getRow(Totalrowcount).getLastCellNum()-1;
		
		for(int i=0; i<=Totalrowcount; i++)
		{
			for(int j=0; j<=Totalcellcount; j++)
			{
				Cell cell = MySheet.getRow(i).getCell(j);
				CellType Type = cell.getCellType();
				
				if(Type == Type.STRING)
				{
					System.out.print(cell.getStringCellValue()+"  ");
				}
				else if(Type == Type.NUMERIC)
				{
					System.out.print(cell.getNumericCellValue()+"  ");
				}
				else if(Type == Type.BOOLEAN)
				{
					System.out.print(cell.getBooleanCellValue()+"  ");
				}
//				else if(Type == Type.BLANK)
//				{
//					 cell.setBlank();
//				}
				
			}
			System.out.println();
		}
	}

}
