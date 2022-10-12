package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
       String data = wb.getSheet("CreateCustomer").getRow(1).getCell(2).getStringCellValue();
        System.out.println(data);
        String data1 = wb.getSheet("CreateCustomer").getRow(1).getCell(3).getStringCellValue();
        System.out.println(data1);
        
	}

}
