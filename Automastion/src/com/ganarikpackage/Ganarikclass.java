package com.ganarikpackage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author KATARI MOUNIKA
 *
 */
public class Ganarikclass {
	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getProperty(String key) throws IOException {
		FileInputStream file = new FileInputStream("./TestData/TestData.propartes");
		Properties p=new Properties();
		p.load(file);
		String data = p.getProperty(key);
		return data;	
	 }
	/**
	 * 
	 * @param sheetName
	 * @param rowNumber 
	 * @param cellNumber
	 * @return cell Value
	 * @throws IOException
	 */
	 
	public String getExclProperty(String sheet1,int row,int cell) throws IOException {
		FileInputStream file=new FileInputStream("./TestData/manish.xlsx");
		Workbook wb = WorkbookFactory.create(file);
	    String exaldata = wb.getSheet(sheet1).getRow(row).getCell(cell).getStringCellValue();
	    return exaldata; 
	 }
	/**
	 * 
	 * @param sheet Name
	 * @param row Number
	 * @param cell Number
	 * @param result Value
	 * @return
	 * @throws EncryptedDocumentException 
	 * @throws IOException
	 */
	public void setExclProperty(String sheet1,int row,int cell,String result) throws EncryptedDocumentException, IOException  {
		FileInputStream file=new FileInputStream("./TestData/manish.xlsx");
		Workbook wb = WorkbookFactory.create(file);
	     wb.getSheet(sheet1).getRow(row).getCell(cell).setCellValue(result);
	    FileOutputStream files=new FileOutputStream("./TestData/manish.xlsx");
	    wb.write(files);
	    wb.close();
	 }

	}
	
