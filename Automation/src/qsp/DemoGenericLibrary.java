package qsp;

import java.io.IOException;

import com.actitime.generic.FileLib;

public class DemoGenericLibrary  //pending
{

	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		// get URL data from property file
		String url = f.getPropertyData("url");
		System.out.println(url);
		//get cell data from excel file
		String data = f.getExcelData("CreateCustomer", 1, 2);
		System.out.println(data);
		//set data...read back to excel file
		
	
		f.setExceldata("CreateCustomer", 1, 5, "pass");
		

	}

}
