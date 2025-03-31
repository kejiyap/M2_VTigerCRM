package testCaseRepo;

import org.apache.commons.compress.utils.ArchiveUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewContactPage;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_003 extends BaseClass {

	@Test
	public void LE_003() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickonLeadMenu();
		
		LeadsPage lep=new LeadsPage(driver);
		lep.clickOnCreateingNewLeadIcon();
		
		String lastname=eUtil.getDataFromExcelFile("leads", 8, 1);
		String  company=eUtil.getDataFromExcelFile("leads", 8, 2);
		String noOfEmployees=eUtil.getDataFromExcelFile("leads", 8, 3);
		String mobile=eUtil.getDataFromExcelFile("leads",8, 4);
		String email=eUtil.getDataFromExcelFile("leads", 8, 5);
		String  city=eUtil.getDataFromExcelFile("leads", 8, 6);
		String state=eUtil.getDataFromExcelFile("leads", 8, 7);
		String country=eUtil.getDataFromExcelFile("leads",8, 8);
		
		CreatingNewLeadPage cnlp= new CreatingNewLeadPage(driver);
		cnlp.CreatingNewLead(lastname, company, noOfEmployees, mobile, email, city, country, state);
			 
	}
	

}
