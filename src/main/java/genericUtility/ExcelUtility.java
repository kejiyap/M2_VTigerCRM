package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is a utility class which deals with excel file
 * @author Soundarya
 * @version 25.03.04
 */
public class ExcelUtility {

	/**
	 * This is a generic method to fetch a single cell data from excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws Exception
	 */
	public String getDataFromExcelFile(String sheetName, int rowIndex, int cellIndex) throws Exception
	{
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row r = sh.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(c);
		return value;
	}
	/**
	 * This is a generic method to fetch a mulpile data from excel file
	 * @param sheetName
	 * @param startRowIndex
	 * @param startCellIndox
	 * @return
	 * @throws Exception
	 * @throws IOException
	 */
	public List<String> getMultipleDataFromExcelFile(String sheetName,int startRowIndex,int startCellIndox) throws Exception, IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Soundarya\\Desktop\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Animal");
		DataFormatter df = new DataFormatter();
		List<String>a1=new ArrayList<String>();
		for(int i=startRowIndex;i<=sh.getLastRowNum();i++)
		{
			Row r = sh.getRow(i);
			for(int j=startCellIndox;j<r.getLastCellNum();j++)
			{
				Cell c = r.getCell(j);
				String value = df.formatCellValue(c);
				a1.add(value);
			
			}
		}
		return a1;		
	}	
	
		/**
		 * This is a generic to write data to excel file
		 * @param sheetName
		 * @param rowIndex
		 * @param cellIndex
		 * @return
		 * @throws Exception 
		 * @throws Exception
		 */



public void writeDataToExcelFile(String sheetName,int rowIndex,int cellIndex,String value) throws Exception
{
	FileInputStream fis=new FileInputStream("C:\\Users\\Soundarya\\Desktop\\Book1.xlsx\\");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	Row r=sh.createRow(rowIndex);
	Cell c=r.createCell(cellIndex);
	c.setCellValue(value);
	FileOutputStream fos=new FileOutputStream("C:\\Users\\Soundarya\\Desktop\\Book1.xlsx\\");
	wb.write(fos);
}

}