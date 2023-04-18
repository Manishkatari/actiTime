package com.WebApplication;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataExclelamdbaclass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		 final String path = "./TestData/manish.xlsx";
		Workbook wb = WorkbookFactory.create(new File(path)); 
		wb.forEach(sheet->System.out.println("=>"+sheet.getSheetName()));
		 Sheet sheet = wb.getSheetAt(0);
		 
		 DataFormatter dataFormatter = new DataFormatter();
		 
		sheet.forEach(row-> 
		                    {row.forEach(cell ->
		                                         {String cellValue = dataFormatter.formatCellValue(cell);
                                                   System.out.print(cellValue + "\t");
                                                   });
         System.out.println();});
        
	}


}
