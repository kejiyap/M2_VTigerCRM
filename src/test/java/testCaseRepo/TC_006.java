package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_006 extends BaseClass{
	@Test
	public void CON_003() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickonContactMenu();
		
		ContactPage cp=new ContactPage(driver);
		cp.clickOnCreateNewContactIcon();
		
		String lastname=eUtil.getDataFromExcelFile("Contacts", 8,1);
		String mobile=eUtil.getDataFromExcelFile("Contacts", 8,2);
		String email=eUtil.getDataFromExcelFile("Contacts", 8,3);
		String mailingcity=eUtil.getDataFromExcelFile("Contacts", 8,4);
		String mailingstate=eUtil.getDataFromExcelFile("Contacts", 8,5);
		String mailingCountry=eUtil.getDataFromExcelFile("Contacts", 8,6);
		
		CreatingNewContactPage cncp=new CreatingNewContactPage(driver);
		cncp.CreatingNewContact(lastname, mobile, email,mailingcity,mailingstate,mailingCountry);	
		}
}		
