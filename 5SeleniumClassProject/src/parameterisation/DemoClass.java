package parameterisation;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoClass {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path = "G:\\PracticeDoc.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		String str = WorkbookFactory.create(file).getSheet("Junaid").getRow(0).getCell(0).getStringCellValue();
		System.out.println(str);
		
		FileInputStream file1 = new FileInputStream(path);
		String str1 = WorkbookFactory.create(file1).getSheet("Junaid").getRow(1).getCell(0).getStringCellValue();
		System.out.println(str1);
		
		FileInputStream file2 = new FileInputStream(path);
		CellType str2 = WorkbookFactory.create(file2).getSheet("Junaid").getRow(1).getCell(0).getCellType();
		System.out.println(str2);
	}

}