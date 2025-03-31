package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_004 extends BaseClass {
	@Test
	public void CON_001() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickonContactMenu();
		
		ContactPage cp=new ContactPage(driver);
		cp.clickOnCreateNewContactIcon();
		
		String fName=eUtil.getDataFromExcelFile("Contacts", 2, 1);
		String lName=eUtil.getDataFromExcelFile("Contacts", 2, 2);
		String title=eUtil.getDataFromExcelFile("Contacts", 2, 3);
		CreatingNewContactPage cncp=new CreatingNewContactPage(driver);
		cncp.creatingContact(fName, lName, title);	
	}
	

}
