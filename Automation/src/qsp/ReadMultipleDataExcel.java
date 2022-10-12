package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		int rowCount=wb.getSheet("InvalidLogin").getLastRowNum();
		short cellCount = wb.getSheet("InvalidLogin").getRow(0).getLastCellNum();
		System.out.println(cellCount);
		System.out.println(rowCount);
		for(int i=1;i<=rowCount;i++) {
			
			for(int j=0;j<cellCount;j++ ) {
				String data=wb.getSheet("InvalidLogin").getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
		}
				
		}
		

	}

}
