package sample;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcelFilePractice {

	public static void main(String[] args) throws Exception {
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\rajat burnwal\\Desktop\\Animal.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Fish");
//		Row r = sh.getRow(1);
//		Cell c = r.getCell(1);
////		String value = c.getStringCellValue();
//		DataFormatter df = new DataFormatter();
		ExcelUtility eUtil = new ExcelUtility();
		String value = eUtil.getDataFromExcelFile("Leads", 2, 1);
		String value1 = eUtil.getDataFromExcelFile("Contacts", 5, 3);
		System.out.println(value);
		System.out.println(value1);

	}

}
