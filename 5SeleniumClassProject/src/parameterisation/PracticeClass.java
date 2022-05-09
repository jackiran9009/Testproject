package parameterisation;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PracticeClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "G:\\er\\NameList.xlsx";

		FileInputStream file = new FileInputStream(path);

		Sheet a = WorkbookFactory.create(file).getSheet("NameList");

		int rowCount = a.getLastRowNum();
		int newRowCount = rowCount + 1;
		System.out.println(newRowCount);

		// if we want to find exact rowcount in excel sheet we have to add +1 …