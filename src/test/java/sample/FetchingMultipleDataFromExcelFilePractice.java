package sample;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class FetchingMultipleDataFromExcelFilePractice {

	public static void main(String[] args) throws Exception {
		//FileInputStream fis = new FileInputStream("C:\\Users\\Soundarya\\Desktop\\Book1.xlsx");
		//Workbook wb = WorkbookFactory.create(fis);
		//Sheet sh = wb.getSheet("Animal");
		//DataFormatter df = new DataFormatter();
		//List<String>a1=new ArrayList<String>();
		//for(int i=1;i<=sh.getLastRowNum();i++)
		//{
			//Row r = sh.getRow(i);
			//for(int j=0;j<r.getLastCellNum();j++)
			//{
				//Cell c = r.getCell(j);
				//String value = df.formatCellValue(c);
		//System.Out.print(value+" ");
	//}
		//System.out.println();
	//}
		
	    ExcelUtility eUtil=new ExcelUtility();
		List<String>a1=eUtil.getMultipleDataFromExcelFile("Animal", 1, 0);
		System.out.println(a1);
		
	}
}


