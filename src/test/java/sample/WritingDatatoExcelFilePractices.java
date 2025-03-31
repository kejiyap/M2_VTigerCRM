package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;
import genericUtility.JavaUtility;

public class WritingDatatoExcelFilePractices {

	public static void main(String[] args) throws Exception {
		//FileInputStream fis=new FileInputStream("C:\\Users\\Soundarya\\Desktop\\Book1.xlsx\\");
		//Workbook wb=WorkbookFactory.create(fis);
		//Sheet sh=wb.getSheet("Animal");
	//    Sheet sh=wb.createSheet("Flower");
		//Row r=sh.createRow(2);
		//Cell c=r.createCell(2);
		//c.setCellValue("hello");
		//FileOutputStream fos=new FileOutputStream("C:\\Users\\Soundarya\\Desktop\\Book1.xlsx\\");
		//wb.write(fos);
		//ExcelUtility eUtil=new ExcelUtility();
		//eUtil.writeDataToExcelFile("Animal",4, 3, "hello");
		//ExcelUtility eUtil=new ExcelUlity();
		//eUtil.writeDataToExcelFile("Animal", 4, 2,"hello");
		//Random r=new Random();
		//int value=r.nextInt(1000);
		//System.out.println(value);
		
		JavaUtility jUtil=new JavaUtility();
		int value=jUtil.generateRandomNumber(10);
		System.out.println(value);
		String dateStamp=jUtil.getCaldenderDetails("dd-mmm-yyyy");
		System.out.println(dateStamp);
		
		

	}

}
